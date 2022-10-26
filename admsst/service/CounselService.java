package kr.happyjob.study.admsst.service;

import java.util.List;
import java.util.Map;

import kr.happyjob.study.admsst.model.ConsultModel;
import kr.happyjob.study.admsst.model.CounselDtlModel;
import kr.happyjob.study.admsst.model.CounselDtlModel2;
import kr.happyjob.study.admsst.model.CounselModel;


public interface CounselService {

	/**  목록 조회 */
	public List<CounselModel> listCounsel(Map<String, Object> paramMap) throws Exception;
	public int searchlistcnt(Map<String, Object> paramMap) throws Exception;
	
	
	/** 참여 학생 목록 */
	public List<CounselDtlModel> listCounselDtl(Map<String, Object> paramMap) throws Exception;
	
	public int listCounselDtlCnt(Map<String, Object> paramMap) throws Exception;
	
	public List<CounselDtlModel2> listCounselDtl2(Map<String, Object> paramMap) throws Exception;
	
	public int listCounselDtlCnt2(Map<String, Object> paramMap) throws Exception;
	

	public  void insertConsult(Map<String, Object> paramMap) throws Exception;
	public  void updateConsult(Map<String, Object> paramMap) throws Exception;
	
}
