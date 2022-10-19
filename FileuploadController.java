package kr.happyjob.study.admsst.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
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

import kr.happyjob.study.common.comnUtils.ComnCodUtil;

import kr.happyjob.study.admsst.service.FileuploadService;
import kr.happyjob.study.admsst.model.FileuploadModel;

@Controller
@RequestMapping("/admsst/")
public class FileuploadController {
	
	@Autowired
	FileuploadService fileuploadService;
	
	// Set logger
	private final Logger logger = LogManager.getLogger(this.getClass());

	// Get class name for logger
	private final String className = this.getClass().toString();
	
	
	  
	/**
	 * 파일 업로드 샘플 초기화면
	 */
	@RequestMapping("fileupload.do")
	public String fileupload(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		
		logger.info("+ Start " + className + ".initComnCod");
		logger.info("   - paramMap : " + paramMap);
		
		logger.info("+ End " + className + ".initComnCod");

		return "admsst/fileupload";
	}

	@RequestMapping("listFileupload.do")
	public String listFileupload(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		
		logger.info("+ Start " + className + ".listFileupload");
		logger.info("   - paramMap : " + paramMap);			
		
		int clickpagenum = Integer.parseInt( String.valueOf(paramMap.get("clickpagenum"))) ;   
		int pagesize = Integer.parseInt( String.valueOf(paramMap.get("pagesize"))) ;  
		int startnum = (clickpagenum - 1) * pagesize;
		
		paramMap.put("startnum", startnum);
		paramMap.put("pagesize", pagesize);
		
		
		List<FileuploadModel> searchlist = fileuploadService.listFileupload(paramMap);		
		model.addAttribute("searchlist", searchlist);
		
		int searchlistcnt = fileuploadService.searchlistcnt(paramMap);
		model.addAttribute("searchlistcnt", searchlistcnt);
		
		logger.info("+ End " + className + ".listFileupload");

		return "admsst/fileuploadlist";
	}
		
	@RequestMapping("selectFileupload.do")
	@ResponseBody
	public Map<String, Object> selectFileupload(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		
		logger.info("+ Start " + className + ".selectFileupload");
		logger.info("   - paramMap : " + paramMap);			
		
		FileuploadModel searchone = fileuploadService.selectFileupload(paramMap);
		
		Map<String, Object> returnmap = new HashMap<String, Object>();
		
		returnmap.put("result", "SUCESS");
		returnmap.put("searchone", searchone);
		
		logger.info("+ End " + className + ".selectFileupload");

		return returnmap;
	}	

	@RequestMapping("saveFileupload.do")
	@ResponseBody
	public Map<String, Object> saveFileupload(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		
		logger.info("+ Start " + className + ".saveFileupload");
		logger.info("   - paramMap : " + paramMap);			
		
		paramMap.put("loginID",(String) session.getAttribute("loginId"));
		
		String action = String.valueOf(paramMap.get("action"));
		
		if("I".equals(action)) {
			fileuploadService.insertFileupload(paramMap);
		} else if("U".equals(action)) {
			fileuploadService.updateFileupload(paramMap);
		} else if("D".equals(action)) {
			fileuploadService.deleteFileupload(paramMap);
		}
		
		Map<String, Object> returnmap = new HashMap<String, Object>();
		
		returnmap.put("result", "SUCESS");
		
		logger.info("+ End " + className + ".saveFileupload");

		return returnmap;
	}		
	
	
}  
