-- R(Read) 제일 많이 사용하게 될...
select [distinct] [컬럼명], [컬럼명 as 별칭 || 컬럼명 별칭], [연산자], [통계함수]
	from [테이블명]
	where [조건식]
	group by [그룹대상]
	having [함수 포함 조건]
	order by [정렬대상 asc/desc(오름차순 / 내림차순)]
	
-- where절 (조건식)
-- 전체 데이터 중 지정한 조건에 맞는 데이터를 찾아주는 문장
-- 조건식에 사용할 연산자를 알아봅시다! (비교 연산자)
-- =, !=, ^=, <>, >, <, >=, <=
-- 이 중에서 2, 3, 4번째는 '같지 않다'로 쓰이는 연산자
-- 2번과 4번은 각각 표준화를 하려다보니 사용하게 되었고, 
-- 3번의 경우에는 몇몇 DBMS과 차별화를 두기 위해 사용하게 되었음

-- 가격이 3000원인 과자의 모든 정보 조회
select * from jun03_snack where s_price = 3000;
--------------------------------------------------------------------------------
-- 모든 과자 이름, 가격 조회
select s_name, s_price from jun03_snack; 
-- 모든 과자 이름(가격) 조회 (ex: 콘칩(2000원) )
-- 별칭에 띄어쓰기가 있거나, 특수문자가 들어가거나, 숫자로 시작한다면
--		별칭이름을 큰따옴표로 묶어준다!!
select s_name || '(' || s_price|| '원)' "이름(가격)" from jun03_snack; 
-----------------------------------------------------------------------------
-- 2000원 이하의 과자 중 최소가격은 얼마인지
select min(s_price) 최소가격 from jun03_snack where s_price <= 2000;
-- 모든 과자의 평균가
select round(AVG(s_price),1) 평균가 from jun03_snack;
-- 과자의 이름과 가격의 30%할인된 금액
select s_name, s_price * 0.7 from jun03_snack;
-- 3500원인 과자의 갯수는 몇 개?
select count(s_price) from jun03_snack where s_price = 3500;
-- 3000원 이하인 과자의 이름, 회사 이름
select s_name, s_company from jun03_snack where s_price <=3000;
-----------------------------------------------------------
-- 모든 과자 이름, 가격, 유통기한 조회
select s_name,s_price,s_expiration from jun03_snack;
-- 모든 과자 이름, 가격, 부가세 조회(가격의 10%)
select s_name,s_price,s_price * 0.1 VAT from jun03_snack;
-- 모든 과자 이름, 가격, 판매가 조회(20%할인)
select s_name,s_price,s_price * 0.8 selling_price from jun03_snack;
-- 3000원보다 큰 금액의 과자들의 평균가 조회
select ROUND(AVG(s_price),1) from jun03_snack where s_price > 3000;
-- 최고가, 최저가, 총 과자 종류 몇가지인지 조회
select max(s_price),min(s_price),count(*) from jun03_snack;
-- 3000원 이상인 과자의 전체 정보 조회
select * from jun03_snack where s_price >= 3000;
-- 3000원 미만인 과자의 이름, 가격, 판매가 조회(20퍼 할인)
select s_name, s_price, s_price * 0.8 from jun03_snack where s_price < 3000;
-- 포카칩의 가격 조회
select s_price from jun03_snack where s_name = '포카칩';
-- 농신 회사의 과자 가격의 총합 조회
select sum(s_price) from jun03_snack where s_company ='농심';
-- 6월 안으로 먹어야하는 과자 이름, 가격, 유통기한 조회
select s_name, s_price, s_expiration from jun03_snack where s_expiration <= to_date('2024-07-01 00:00:00','YYYY-MM-DD HH24:MI:SS');




































