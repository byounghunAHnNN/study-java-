package kr.happyjob.study.business.dao;

import java.util.List;
import java.util.Map;


import kr.happyjob.study.business.model.EmpSalePlanModel;

public interface EmpSalePlanDao {

	public List<EmpSalePlanModel> listempSalePlanModel(Map<String, Object> paramMap) throws Exception;
	
	public int totEmpSalePlanModel(Map<String, Object> paramMap) throws Exception;
}
