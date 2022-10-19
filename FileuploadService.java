package kr.happyjob.study.admsst.service;

import java.util.List;
import java.util.Map;
import kr.happyjob.study.admsst.model.FileuploadModel;

public interface FileuploadService {

	/**  목록 조회 */
	public List<FileuploadModel> listFileupload(Map<String, Object> paramMap) throws Exception;
	public int searchlistcnt(Map<String, Object> paramMap) throws Exception;
		
	public FileuploadModel selectFileupload(Map<String, Object> paramMap) throws Exception;
	
	public void insertFileupload(Map<String, Object> paramMap) throws Exception;
	public void updateFileupload(Map<String, Object> paramMap) throws Exception;
	public void deleteFileupload(Map<String, Object> paramMap) throws Exception;
	
}
