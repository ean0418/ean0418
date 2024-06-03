create table jun03_snack(
	s_no number(4) primary key,
	s_name varchar2(5 char) not null,
	s_company varchar2(10 char) not null,
	s_price number(4) not null
);

-- DML은 데이터 조작어 ( Data Manipulation Language)라고 하고,
-- 데이블에 데이터를 검색, 삽입, 수정, 삭제 하는데 사용되는 문장
-- select, insert, update, delete 등이 있고, 
-- 줄여서 CRUD ( create / read / update / delete ) 라고 함
-- 여기서 C는 데이터를 만든다는 의미의 C(insert)
--		cf) create table - X (DBA의 작업)
-- 형태는
insert into 테이블명(컬럼명, 컬럼명, ...) values(값, 값, ...);

insert into jun03_snack(s_no, s_name, s_company, s_price)
	values(1, '초코파이', '오리온', 5000);
	
truncate table jun03_snack;

--컬럼의 순서 바꾸기 -됨
insert into jun03_snack(s_name, s_price, s_no, s_maker)
	values('새콤달콤', 500, 2, '롯데');

-- 컬럼에 값 안넣기 - 에러 !, NOT NULL 때문에
insert into jun03_snack(s_name, s_no) values ();

-- (컬럼명, 컬럼명, ...) 안넣고 테이블 생성 당시의 컬럼명 순서대로 넣는 방법도!
insert into jun03_snack values (값, 값, ...);
insert into jun03_snack values (4, '엄마손파이', '롯데', 4000);
-------------------------------------------------------------
-- 테이블 지우고
-- 다시 테이블 생성해서 값 5개 정도 넣어봅시다
drop table jun03_snack cascade constraint purge;

create table jun03_snack(
	s_no number(4) primary key,
	s_name varchar2(5 char) not null,
	s_company varchar2(10 char) not null,
	s_price number(4) not null
);

insert into jun03_snack values(1, '초코파이', '오리온', 5000);
insert into jun03_snack values(2, '포카칩', '롯데', 2000);
insert into jun03_snack values(3, '소금빵', '롯데', 1800);
insert into jun03_snack values(4, '썬칩', '모름', 1900);
insert into jun03_snack values(5, '프레첼', 'CU', 2500);
select*from jun03_snack;

-- 그런데.. 5개 넣어서 하나하나씩 과자들 번호를 부여하면 됐는데
-- 과자의 종류가 상당히 다양한데
-- 과자 데이터 계속 넣다가 나중에 몇번인지 잊어버리면..?
-- 데이터를 만들때마다 과자의 번호가 자동으로 계산이 되었으면 좋겠음 !

-- factory pattern이라고 해서 말 그대로 공장화 시스템 !
-- MySQL :Autoincrement 옵션
-- 현재 우리가 사용하는 OracleDB에서는 Sequence라는 것이 있음
--		번호를 순서에 맞게 자동으로 생성해주는건데
--		테이블과는 무관하고, 
--		단점으로는 insert에 실패해도 sequence 값은 무조건 올라감
--		그리고, 증가된 값을 다시 내릴 수 없다

-- sequence (table과는 무관한) 생성
create sequence 시퀀스명; -- 간단한 시퀀스

-- 테이블명 뒤에 _seq를 붙여주는 문화가 있음
create sequence jun03_snack_seq;

-- 구체적인 시퀀스
create sequence 시퀀스명
	increment by 1 			-- 증가값 (1씩 증가)
	start with 1			-- 시작값
	minvalue 1				-- 최솟값
	maxvalue 999			-- 최댓값
	nocycle / cycle			-- 최대값에 도달하면 시작값부터 다시 반복할지 말지
	nocache / cache			-- 시퀀스를 미리 만들어놓고 메모리에서 가져다 쓸지말지
	noorder / order;		-- 요청 순서대로 값을 생성할지 말지

-- sequence 삭제
drop sequence 시퀀스명;

-- sequence 사용 : 시퀀스명.nextval
-- 기존에 있던 테이블 삭제했다가 다시 만들어서 값을 넣어봅시다 !

drop table jun03_snack cascade constraint purge;

create table jun03_snack(
	s_no number(4) primary key,
	s_name varchar2(5 char) not null,
	s_company varchar2(10 char) not null,
	s_price number(4) not null
);

insert into jun03_snack values(jun03_snack_seq.nextval, '초코파이', '오리온', 5000);
insert into jun03_snack values(jun03_snack_seq.nextval, '포카칩', '롯데', 2000);
insert into jun03_snack values(jun03_snack_seq.nextval, '소금빵', '롯데', 1800);
insert into jun03_snack values(jun03_snack_seq.nextval, '썬칩', '모름', 1900);
insert into jun03_snack values(jun03_snack_seq.nextval, '프레첼', 'CU', 2500);
select * from jun03_snack;
	
-- 이제 다시 테이블이랑 시퀀스 지워주고, 테이블 다시 만들때 속성 추가!
--		(유통기한 Date)	
drop table jun03_snack cascade constraint purge;
drop sequence jun03_snack_seq;

create sequence jun03_snack_seq;
create table jun03_snack(
	s_no number(4) primary key,
	s_name varchar2(5 char) not null,
	s_company varchar2(10 char) not null,
	s_price number(4) not null,
	s_expiration date not null
);truncate table jun03_snack;
select sysdate from dual;
					--(연습장 느낌)
insert into jun03_snack values(jun03_snack_seq.nextval, '초코파이', '오리온', 5000, sysdate);

select * from jun03_snack;

-- 특정시간 / 날짜
--		내장함수 - to_date('값', '패턴')
--		패턴(대문자) - YYYY, MM, DD, AM/PM, HH(12시간), HH24(추천), MI(분), SS(초)
insert into jun03_snack values(jun03_snack_seq.nextval, '초코파이',
	'오리온', 5000, to_date('2024-06-07 14', 'YYYY-MM-DD HH24'));
insert into jun03_snack values(jun03_snack_seq.nextval, '포카칩',
	'오리온', 2000, to_date('2024-07-07 18', 'YYYY-MM-DD HH24'));
insert into jun03_snack values(jun03_snack_seq.nextval, '꼬북칩',
	'오리온', 1800, to_date('2024-08-13 21', 'YYYY-MM-DD HH24'));
insert into jun03_snack values(jun03_snack_seq.nextval, '꼬북칩초코',
	'오리온', 1800, to_date('2024-08-13 21', 'YYYY-MM-DD HH24'));
insert into jun03_snack values(jun03_snack_seq.nextval, '양파링',
	'농심', 1900, to_date('2024-12-07 11', 'YYYY-MM-DD HH24'));
insert into jun03_snack values(jun03_snack_seq.nextval, '포스틱',
	'농심', 2500, to_date('2024-05-21 06', 'YYYY-MM-DD HH24'));	
insert into jun03_snack values(jun03_snack_seq.nextval, '알새우칩',
	'농심', 1300, to_date('2024-11-07 23', 'YYYY-MM-DD HH24'));	
insert into jun03_snack values(jun03_snack_seq.nextval, '빼빼로',
	'롯데', 1500, to_date('2024-09-23 11', 'YYYY-MM-DD HH24'));	
insert into jun03_snack values(jun03_snack_seq.nextval, '꼬깔콘',
	'롯데', 1700, to_date('2024-07-17 12', 'YYYY-MM-DD HH24'));	
insert into jun03_snack values(jun03_snack_seq.nextval, '몽쉘',
	'롯데', 3300, to_date('2024-11-12 18', 'YYYY-MM-DD HH24'));	
insert into jun03_snack values(jun03_snack_seq.nextval, '몽쉘바나나',
	'롯데', 3300, to_date('2024-12-21 21', 'YYYY-MM-DD HH24'));	
insert into jun03_snack values(jun03_snack_seq.nextval, '몽쉘딸기',
	'롯데', 3300, to_date('2024-08-13 23', 'YYYY-MM-DD HH24'));	
insert into jun03_snack values(jun03_snack_seq.nextval, '감자칩',
	'노브랜드', 1500, to_date('2024-10-07 01', 'YYYY-MM-DD HH24'));	
insert into jun03_snack values(jun03_snack_seq.nextval, '카스타드',
	'노브랜드', 2600, to_date('2024-08-08 19', 'YYYY-MM-DD HH24'));	
insert into jun03_snack values(jun03_snack_seq.nextval, '마요감자칩',
	'노브랜드', 2600, to_date('2024-08-08 19', 'YYYY-MM-DD HH24'));	
insert into jun03_snack values(jun03_snack_seq.nextval, '딸기감자칩',
	'노브랜드', 2600, to_date('2024-08-08 19', 'YYYY-MM-DD HH24'));	

select * from jun03_snack;
	
---------------------------------------------
-- R(Read) 제일 많이 사용하게 될...
select [distinct] [컬럼명], [컬럼명 as 별칭 || 컬럼명 별칭], [연산자], [통계함수]
	from [테이블명]
	where [조건식]
	group by [그룹대상]
	having [함수 포함 조건]
	order by [정렬대상 asc/desc(오름차순 / 내림차순)]
-- 의 형태!

-- 과자테이블 전체 조회
-- '*' : 테이블 내의 모든 컬럼을 가져온다
select * from jun03_snack;

select s_company from jun03_snack;
select distinct s_company from jun03_snack;

-- 컬럼명은 그대로 컬럼명을 쓰면 되고,
-- 별칭 같은 경우...select문 안에서 숫자 계산이 가능한데(+, -, *, /)
select s_price / 100 from jun03_snack;
-- 컬럼명 자체가 s_price/100으로 나옴
-- 실제 프로그래밍 언어와 연동하다보면 컬럼명을 이용해서 값을 불러오는 경우가 있는데
-- 별칭이라는 것을 써서 헷갈림을 방지하는 용도로 사용

-- as를 사용하는 방법
select s_price / 100 as s_price from jun03_snack;
-- 컬럼명 띄어쓰기하고 바로 별칭쓰는 방법 (더 많이 쓰임)
select s_price / 100 s_price from jun03_snack;

-- 연산자 ! (산술연산자)
-- Dual 테이블
-- 1. 오라클 자체에서 제공해주는 더미테이블
-- 2. 간단하게 함수를 이용해서 계산 결과값을 확인할 때 사용하는 테이블
-- ??? 
select 1 + '3' from dual
-- 4가 나옴 !
-- 대부분 다른 언어들 같은 경우에는 '문자 우선' 13이라는 결과가 나오는데
-- 오라클에서는 반대로 '숫자 우선' 
-- 오라클 내에서는 연산자가 숫자만 연사 해줌
select 1 + 'a' from dual; -- 에러 ! (숫자로 바꿀수 없다는 에러 'invalid number')

-- 문자를 더해주기 위한 연산자가 따로 있는데
-- 바로 '||' (shift + \)\
select 1 || 'a' from dual;












