package kr.happyjob.study.admsst.controller;

import java.util.HashMap;
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
import org.springframework.web.bind.annotation.ResponseBody;

import kr.happyjob.study.admsst.model.ConsultModel;
import kr.happyjob.study.admsst.model.CounselDtlModel;
import kr.happyjob.study.admsst.model.CounselDtlModel2;
import kr.happyjob.study.admsst.model.CounselModel;
import kr.happyjob.study.admsst.service.CounselService;

@Controller
@RequestMapping("/admsst/")
public class CounselController {
	

	@Autowired
	CounselService counselservice;
	
	// Set logger
	private final Logger logger = LogManager.getLogger(this.getClass());

	// Get class name for logger
	private final String className = this.getClass().toString();
	
	
	  
	/**
	 * 파일 업로드 샘플 초기화면
	 */
	@RequestMapping("counsel.do")
	public String counsel(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		
		logger.info("+ Start " + className + ".counsel");
		logger.info("   - paramMap : " + paramMap);
		
		logger.info("+ End " + className + ".counsel");

		return "admsst/counsel";
	}
	@RequestMapping("listCounsel.do")
	public String listCounsel(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		
		logger.info("+ Start " + className + ".listCounsel");
		logger.info("   - paramMap : " + paramMap);			
		
		int clickpagenum = Integer.parseInt( String.valueOf(paramMap.get("clickpagenum"))) ;   
		int pagesize = Integer.parseInt( String.valueOf(paramMap.get("pagesize"))) ;  
		int startnum = (clickpagenum - 1) * pagesize;
		
		paramMap.put("startnum", startnum);
		paramMap.put("pagesize", pagesize);
		
		
		List<CounselModel> searchlist = counselservice.listCounsel(paramMap);		
		model.addAttribute("searchlist", searchlist);
		
		int searchlistcnt = counselservice.searchlistcnt(paramMap);
		model.addAttribute("searchlistcnt", searchlistcnt);
		
		logger.info("+ End " + className + ".listcounsel");

		return "admsst/counsellist";
	}
	
	
	@RequestMapping("listCounselDtl.do")
	public String listCounselDtl(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		
		logger.info("+ Start " + className + ".listCounsel");
		logger.info("   - paramMap : " + paramMap);			
		
		int clickpagenum = Integer.parseInt( String.valueOf(paramMap.get("clickpagenum"))) ;   
		int pagesize = Integer.parseInt( String.valueOf(paramMap.get("pagesize"))) ;  
		int startnum = (clickpagenum - 1) * pagesize;
		
		paramMap.put("startnum", startnum);
		paramMap.put("pagesize", pagesize);
		logger.info("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		logger.info("startnum"+startnum);
		logger.info("pagesize"+pagesize);		
		logger.info("li_no"+String.valueOf(paramMap.get("li_no")));		
		
		List<CounselDtlModel> listCounselDtl = counselservice.listCounselDtl(paramMap);		
		model.addAttribute("listCounselDtl", listCounselDtl);
		
      
		int searchlistcnt = counselservice.listCounselDtlCnt(paramMap);
		logger.info("searchlistcnt"+searchlistcnt);
		model.addAttribute("searchlistcnt", searchlistcnt);
		
		logger.info("+ End " + className + ".listcounsel");

		return "admsst/counselDtllist";
	}
	
	@RequestMapping("listCounselDtl2.do")
	public String listCounselDtl2(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		
		logger.info("+ Start " + className + ".listCounsel");
		logger.info("   - paramMap : " + paramMap);			
		
		int clickpagenum = Integer.parseInt( String.valueOf(paramMap.get("clickpagenum"))) ;   
		int pagesize = Integer.parseInt( String.valueOf(paramMap.get("pagesize"))) ;  
		int startnum = (clickpagenum - 1) * pagesize;
		
		
		paramMap.put("startnum", startnum);
		paramMap.put("pagesize", pagesize);
		logger.info("~~~~~~~~~~~~~~~~~~~~~~~@@@@@@");
		logger.info("startnum"+startnum);
		
		logger.info("pagesize"+pagesize);		
		
		logger.info("loginID"+String.valueOf(paramMap.get("loginID")));		
		
		List<CounselDtlModel2> listCounselDtl2 = counselservice.listCounselDtl2(paramMap);	
		
		model.addAttribute("listCounselDtl2", listCounselDtl2);
		

		int searchlistcnt2 = counselservice.listCounselDtlCnt2(paramMap);
		logger.info("~~~~~~~~~~~~~~~~~~~~~");
		logger.info("searchlistcnt2"+searchlistcnt2);
		model.addAttribute("searchlistcnt2", searchlistcnt2);
		logger.info("+ End " + className + ".listcounsel");

		return "admsst/counselDtllist2";
	}
	
	
	
	// 등록 저장부분. 
	@RequestMapping("saveConsult.do")
	@ResponseBody
	public Map<String, Object> saveConsult(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		
		logger.info("+ Start " + className + ".saveConsult");
		logger.info("   - paramMap : " + paramMap);			
		

		String action = String.valueOf(paramMap.get("action"));
		
		if("I".equals(action)) {
			counselservice.insertConsult(paramMap);
		} else if("U".equals(action)) {
			counselservice.updateConsult(paramMap);
		} 
		
		Map<String, Object> returnmap = new HashMap<String, Object>();
		
		returnmap.put("result", "SUCESS");
		logger.info("~@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		logger.info("+ End " + className + ".saveConsult");

		return returnmap;
	}	
	
	
}		
	
	  
