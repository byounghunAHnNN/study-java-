package kr.happyjob.study.admsst.dao;

import java.util.List;
import java.util.Map;

import kr.happyjob.study.admsst.model.CounselDtlModel;
import kr.happyjob.study.admsst.model.CounselDtlModel2;
import kr.happyjob.study.admsst.model.CounselModel;
import kr.happyjob.study.admsst.model.ConsultModel;
public interface CounselDao {

	/**  목록 조회 */
	public List<CounselModel> listCounsel(Map<String, Object> paramMap) throws Exception;
	public int searchlistcnt(Map<String, Object> paramMap) throws Exception;
	public CounselModel selectCounsel(Map<String, Object> paramMap) throws Exception;
	
	public ConsultModel selectConsult(Map<String, Object> paramMap) throws Exception;
	
	// 등록 저장부분 
	public void insertConsult (Map<String, Object> paramMap) throws Exception;
	public void updateConsult (Map<String, Object> paramMap) throws Exception;
	
	

	
	/** 참여 학생 목록 조회 */
	public  List<CounselDtlModel> listCounselDtl(Map<String, Object> paramMap)throws Exception;
	
	public int listCounselDtlCnt(Map<String, Object> paramMap)throws Exception;
	
	public  List<CounselDtlModel2> listCounselDtl2(Map<String, Object> paramMap)throws Exception;
	
	public int listCounselDtlCnt2(Map<String, Object> paramMap) throws Exception;

}
