package kr.happyjob.study.admsst.service;

import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.admsst.model.FileuploadModel;
import kr.happyjob.study.admsst.dao.FileuploadDao;;

@Service
public class FileuploadServiceImpl implements FileuploadService {

	// Set logger
	private final Logger logger = LogManager.getLogger(this.getClass());
	
	// Get class name for logger
	private final String className = this.getClass().toString();
	
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
    
    
}
