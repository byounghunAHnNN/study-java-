package kr.happyjob.study.admsst.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.admsst.dao.CounselDao;
import kr.happyjob.study.admsst.model.ConsultModel;
import kr.happyjob.study.admsst.model.CounselDtlModel;
import kr.happyjob.study.admsst.model.CounselDtlModel2;
import kr.happyjob.study.admsst.model.CounselModel;
import kr.happyjob.study.admsst.model.FileuploadModel;;

@Service
public class CounselServiceImpl implements CounselService {

	@Autowired
	private CounselDao counseldao;
	
	@Override
	public List<CounselModel> listCounsel(Map<String, Object> paramMap) throws Exception {		
		return counseldao.listCounsel(paramMap);
	}
	@Override
	public int searchlistcnt(Map<String, Object> paramMap) throws Exception {
		return counseldao.searchlistcnt(paramMap);
	}

	
	public List<CounselDtlModel> listCounselDtl(Map<String, Object> paramMap) throws Exception {
				
		return counseldao.listCounselDtl(paramMap);
	}
	@Override
	public int listCounselDtlCnt(Map<String, Object> paramMap) throws Exception {
		return counseldao.listCounselDtlCnt(paramMap);
	}
	
	public List<CounselDtlModel2> listCounselDtl2(Map<String, Object> paramMap) throws Exception {
		
		return counseldao.listCounselDtl2(paramMap);
	}
	
	@Override
	public int listCounselDtlCnt2(Map<String, Object> paramMap) throws Exception {
		return counseldao.listCounselDtlCnt2(paramMap);
	}
	
    public void insertConsult(Map<String, Object> paramMap) throws Exception {
		
    	paramMap.put("fileyn", "N");
    	paramMap.put("filepro", "N");
    	counseldao.insertConsult(paramMap);
		
		return ;
	}
    
    
    public void updateConsult(Map<String, Object> paramMap) throws Exception {
		
    	counseldao.updateConsult(paramMap);
		
		return ;
	}

	

    
    
}
