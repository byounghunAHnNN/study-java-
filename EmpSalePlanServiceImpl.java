package kr.happyjob.study.business.service;

import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.business.dao.EmpSalePlanDao;
import kr.happyjob.study.business.model.EmpSalePlanModel;

@Service
public class EmpSalePlanServiceImpl implements EmpSalePlanService{
	
	   // Set logger
	   private final Logger logger = LogManager.getLogger(this.getClass());
	   
	   // Get class name for logger
	   private final String className = this.getClass().toString();

	   @Autowired
	   EmpSalePlanDao  empsaleplandao;
	   
	@Override
	public List<EmpSalePlanModel> listempSalePlanModel(Map<String, Object> paramMap) throws Exception {

		List<EmpSalePlanModel> listempSalePlanModel = empsaleplandao.listempSalePlanModel(paramMap);
		
		return listempSalePlanModel;
	};
	public int totEmpSalePlanModel(Map<String, Object> paramMap) throws Exception {
		// 
		int totEmpSalePlanModel = empsaleplandao.totEmpSalePlanModel(paramMap);
		
		return totEmpSalePlanModel;
	};


	   
	   
	   

}
