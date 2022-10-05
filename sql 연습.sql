서브쿼리 ★
Table에 c,d컬럼이 있으면 
Select c,d
From ( 
) ll  on ll.c=a.a => ll이란 table가져오는데 c,d이 가진 테이블을 가져온다? 

select a.a, b.b, c.c
  from b
         left outer join a on a.a = b.b //원문쿼리 
         left outer join c on c.c = a.a

//서브쿼리로 바꾼것. 
select a.a, b.b, ll.d, ss.f(이걸 주면 에러가 나냐? ) ㅇㅇ 서브쿼리문 안에서만 사용 가능. 서브쿼리 밖에서 ss라는 이니셜을 쓸 수 없다. (ss.f를 ll.f로 써야 정상작동) 
  from a
	Full outer join b on a.a = b.b 
         left outer join a on a.a = b.b //c가 아니라 ll로 바뀐다. Ll이란 가상테이블을 지정했으니까. 
         left outer join (
                              select c, d, f 
                               from c ss // ss로 줬다 쳤을때
						 left outer f on f.f = ss.c  //ANSI SQL 사용가능. 서브쿼리 안에도 사용  ㄱㄴ 
						서브쿼리를 제일먼저 실행 
                           ) ll on ll.c = a.a
	Left outer join ( 
					Select a 
					From a ss (ll2라는 가상 테이블을 만들기 때문 ㄱㄴ) 
				) ll2 on ll2.a = b.b 

Select aa.a, bb.b
	From a aa, b bb
	Where aa.a = bb.b
	
Select aa.a 
   from a aa
	Where aa.a  in ( //in 안에도 서브쿼리 사용 가능. 1대 다를 비교할때는 in 사용 =ㄴㄴ
	                       select b
						From b
					)
Where aa.a in ('1','2','23') 

Select a,b
	From a
Union   //union 위아래를 합쳐주는 것인데 위에컬럼은2개지만 밑은 3개라 오류.
Select f,d,h 
	From b
	
 a : varchar b : number (int) 
 d : varchar f : number (int)  //첫번째 컬럼의 순서의 타입이 동일해야 작동 그래서 이거는 에러.  A.f가 같고 b.d가 같아야 한다