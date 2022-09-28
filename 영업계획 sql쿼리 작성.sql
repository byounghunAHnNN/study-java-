	select pn.loginID
		       ,pn.pln_no
		       ,dp.dept_name
		       ,ui.name
		       ,pn.pln_ddate
		       ,DATE_FORMAT(pn.pln_ddate, '%Y-%m-%d') as pln_ddate
		       ,pn.si_cd
		       ,si.si_nm
		       ,pn.pln_nmt
		       ,DATE_FORMAT(pn.pln_date, '%Y-%m-%d') as pln_date
		       ,pn.pln_ar
		       ,pn.pln_etc
		from tb_userinfo ui
		    inner join tb_planning pn on pn.loginID = ui.loginID
		    inner join tb_dept dp on dp.dept_cd = ui.dept_cd
		    inner join tb_sitem si on pn.si_cd = si.si_cd 
        
         order by pn.pln_nmt DESC