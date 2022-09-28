select DISTINCT pn.loginID
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
from tb_planning pn
    inner join tb_dept dp on pn.loginID
    inner join tb_userinfo ui on pn.loginID = ui.loginID
       inner join tb_sitem si on pn.si_cd = si.si_cd 
       
       WHERE pn.loginID
      
    order by pn.pln_nmt DESC
