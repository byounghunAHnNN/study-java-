package kr.happyjob.study.admsst.service;

import java.io.File;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.happyjob.study.admsst.model.FileuploadModel;
import kr.happyjob.study.common.comnUtils.FileUtilCho;
import kr.happyjob.study.admsst.dao.FileuploadDao;;

@Service
public class FileuploadServiceImpl implements FileuploadService {

	// Set logger
	private final Logger logger = LogManager.getLogger(this.getClass());
	
	// Get class name for logger
	private final String className = this.getClass().toString();
	
	@Value("${fileUpload.rootPath}")
	private String rootPath;
	
	@Value("${fileUpload.noticePath}")
	private String noticePath;
	
	@Value("${fileUpload.virtualRootPath}")
	private String virtualRootPath;
	
	@Autowired
	FileuploadDao fileuploadDao;
	
	/** 목록 조회 */
	public List<FileuploadModel> listFileupload(Map<String, Object> paramMap) throws Exception {
		
		List<FileuploadModel> listupload = fileuploadDao.listFileupload(paramMap);
		
		return listupload;
	}
	
    public int searchlistcnt(Map<String, Object> paramMap) throws Exception {
		
		int searchlistcnt = fileuploadDao.searchlistcnt(paramMap);
		
		return searchlistcnt;
	}
    
    public FileuploadModel selectFileupload(Map<String, Object> paramMap) throws Exception {
		
		FileuploadModel selectupload = fileuploadDao.selectFileupload(paramMap);
		
		return selectupload;
	}
    
    public void insertFileupload(Map<String, Object> paramMap) throws Exception {
		
    	paramMap.put("fileyn", "N");
    	paramMap.put("filepro", "N");
		fileuploadDao.insertFileupload(paramMap);
		
		return ;
	}
    
    public void updateFileupload(Map<String, Object> paramMap) throws Exception {
		
		fileuploadDao.updateFileupload(paramMap);
		
		return ;
	}
    
    public void deleteFileupload(Map<String, Object> paramMap) throws Exception {
		
		fileuploadDao.deleteFileupload(paramMap);
		
		return ;
	}
    
    
    public void insertFileuploadatt(Map<String, Object> paramMap, HttpServletRequest request) throws Exception {
    	
    	MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
		
		//파일저장
		String itemFilePath = noticePath + File.separator; // 업로드 실제 경로 조립 (무나열생성)
		FileUtilCho fileUtil = new FileUtilCho(multipartHttpServletRequest, rootPath, itemFilePath);
		Map<String, Object> fileInfo = fileUtil.uploadFiles(); // 실제 업로드 처리
		
		System.out.println("fileInfo @@@@@@@@@@@@@@@@@@@" +fileInfo);
		
        //map.put("file_nm", file_nm);
        //map.put("file_size", file_Size);
        //map.put("file_loc", file_loc);
        //map.put("fileExtension", fileExtension);
        //map.put("loc_file_loc", fileExtension);
		
		String logicalpath = virtualRootPath + File.separator + noticePath + File.separator + fileInfo.get("file_nm");
		
		fileInfo.put("loc_file_loc", logicalpath);
		
		String FilNm = (String)fileInfo.get("file_nm");
		
		if (FilNm != null && !"".equals(FilNm)) {
			paramMap.put("fileyn", "Y");
			fileuploadDao.insertFileinfo(fileInfo);
		} else {
			paramMap.put("fileyn", "N");
		}
		
		paramMap.put("filepro", "Y");
		
		fileuploadDao.insertFileupload(paramMap);
    	
    }
    
    public void updateFileuploadatt(Map<String, Object> paramMap, HttpServletRequest request) throws Exception {
    	
    	MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
		
    	FileuploadModel selectupload = fileuploadDao.selectFileupload(paramMap); //파일 다운할때 쓰는.
    	    	
        String oldFilNm = selectupload.getAtt_ori();
		if (oldFilNm != null && !"".equals(oldFilNm)) {
			fileuploadDao.deleteFileinfobybdno(paramMap);
	    	File oldfile = new File(selectupload.getAtt_mul());
	    	oldfile.delete();			
		}
    	
 
    	
		//파일저장
		String itemFilePath = noticePath + File.separator; // 업로드 실제 경로 조립 (무나열생성)
		FileUtilCho fileUtil = new FileUtilCho(multipartHttpServletRequest, rootPath, itemFilePath);
		Map<String, Object> fileInfo = fileUtil.uploadFiles(); // 실제 업로드 처리
		
		System.out.println("fileInfo @@@@@@@@@@@@@@@@@@@" +fileInfo);
		
        //map.put("file_nm", file_nm);
        //map.put("file_size", file_Size);
        //map.put("file_loc", file_loc);
        //map.put("fileExtension", fileExtension);
        //map.put("loc_file_loc", fileExtension);
		
		String logicalpath = virtualRootPath + File.separator + noticePath + File.separator + fileInfo.get("file_nm");
		
		fileInfo.put("loc_file_loc", logicalpath);
		
		String FilNm = (String)fileInfo.get("file_nm");
		
		if (FilNm != null && !"".equals(FilNm)) {
			paramMap.put("fileyn", "Y");
			fileuploadDao.insertFileinfo(fileInfo);
		} else {
			paramMap.put("fileyn", "N");
		}
		
		paramMap.put("filepro", "Y");
		
		fileuploadDao.updateFileupload(paramMap);
    	
    }
    
    public void deleteFileuploadatt(Map<String, Object> paramMap) throws Exception {
		
    	FileuploadModel selectupload = fileuploadDao.selectFileupload(paramMap);
    	
        String oldFilNm = selectupload.getAtt_ori();
		if (oldFilNm != null && !"".equals(oldFilNm)) {
			fileuploadDao.deleteFileinfobybdno(paramMap);
	    	File oldfile = new File(selectupload.getAtt_mul());
	    	oldfile.delete();			
		}
    	
		fileuploadDao.deleteFileupload(paramMap);
		
		return ;
	}
    
    
}
