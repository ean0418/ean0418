-- 1. 노트북에 대한 테이블을 생성..
-- 노트북의 이름, 가격, cpu, ram, hdd, 보증기간 을 속성으로 갖게 하고 싶음
-- 조건에 부합하는 테이블을 작성하는 문장
-- [하나의 기본키(pk)를 가져야 하고, 모든 값을 채워넣어야 함]

create table laptop(
	l_name varchar2(10 char) primary key,
	l_price number(6) not null,
	l_CPU varchar2(10 char) not null,
	l_RAM number(2) not null,
	l_HDD number(6) not null,
	l_warranty date not null
);

insert into laptop values('abcd',500000,'cpu-123',64,3,'2024-05-31')
-- 2. 노트북의 사양이 좋아져서 128GB짜리 RAM을 사용하게 되었음
-- 이 때 RAM 컬럼의 용량을 변경하는 문장 작성
alter table laptop modify l_RAM number(3);
-- 3. 노트북의 크기(인치)에 대한 컬럼을 추가하는 문장 작성
-- [단위 cm, 소수점 두번째 자리까지 나타낼 것]
-- [이 컬럼은 빈 값으로 넣을 수 없음]
truncate table laptop;
alter table laptop add l_size number(4, 2) not null;
-- 4. 노트북에는 앞으로 HDD대신 SSD가 장착됨
-- HDD 컬럼의 이름을 SSD 컬럼명으로 변경하는 문장 작성
alter table laptop rename column l_HDD to l_SDD;
-- 5. 보증 기간 컬럼을 삭제하는 문장 작성
alter table laptop drop column l_warranty
-- 6. 노트북의 가격이 [800000 ~ 2300000] 사이의 값만 들어갈 수 있게끔
-- 해당 컬럼을 변경하는 문장 작성
alter table laptop modify l_price number(7) check (l_price between 800000 and 2300000);
-- 7. 만든 테이블을 완전히 삭제하는 문장 작성
drop table laptop cascade constraint purge;

















