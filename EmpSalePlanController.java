package kr.happyjob.study.business.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.happyjob.study.business.model.EmpSalePlanModel;
import kr.happyjob.study.business.service.BmSalePlanService;
import kr.happyjob.study.business.service.EmpSalePlanService;


@Controller
@RequestMapping("/business/")
public class EmpSalePlanController {
	
	@Autowired
	EmpSalePlanService empsaleplanservice;
	// Set logger
	private final Logger logger = LogManager.getLogger(this.getClass());

	// Get class name for logger
	private final String className = this.getClass().toString();
	

	//처음 로딩될 때 거래처 리스트 페이지 연결 
	@RequestMapping("empSalePlan.do")
	public String empSalePlan(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		logger.info("+ Start " + className + ".empSalePlan");
		logger.info("   - paramMap : " + paramMap);
		
		String loginID = (String) session.getAttribute("loginId");
		String userNm = (String)session.getAttribute("userNm");
		paramMap.put("loginID", loginID);
		paramMap.put("userNm", userNm);
		System.out.println(loginID);
		

		//현재 유저의 아이디
		model.addAttribute("loginId",loginID);
		 logger.info("+ end " + className + ".empSalePlan");
		return "business/empSalePlan";
		
	}
	
	@RequestMapping("empSalePlanModel.do")
	public String listempsaleplan(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		System.out.println("list 불러오기 체크");
		
		
		logger.info("+ Start " + className + ".listnotice");
		logger.info("   - paramMap : " + paramMap);
		

	    int curpage = Integer.parseInt((String) paramMap.get("curpage"));
	    int pageSize = Integer.parseInt((String) paramMap.get("pageSize"));
		int pageIndex = (curpage - 1) * pageSize;
	    
		paramMap.put("pageIndex", pageIndex);
		paramMap.put("pageSize", pageSize);
		
		
		List<EmpSalePlanModel> listempSalePlanModel = empsaleplanservice.listempSalePlanModel(paramMap);
		
		int totEmpSalePlanModel = empsaleplanservice.totEmpSalePlanModel(paramMap);
		
		model.addAttribute("listempSalePlanModel", listempSalePlanModel);
		model.addAttribute("totempSalePlanModel", totEmpSalePlanModel);
		
		model.addAttribute("curpage", curpage);
		model.addAttribute("pageSize", pageSize);		
		
		logger.info("+ Stop " + className + ".listComnGrpCod");
		

		
		return "business/empSalePlanList";
	}
}

