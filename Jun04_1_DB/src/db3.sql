-- 1. 음료 테이블과 카페테이블을 만들기
-- 음료테이블 : 음료이름/ 가격/ 판매하는 카페의 이름
-- 카페테이블 : 카페이름/ 지역/ 좌석 수
-- [조건] 참조관계 고려 x, 각 테이블에서 음료이름, 카페이름은 고유한 값을 갖는다.

create table jun04_drink(
	d_name varchar2(6 char) primary key,
	d_price number(4) not null,
	d_cafename varchar2(3 char) not null
);

create table jun04_cafe(
	c_name varchar2(3 char) primary key,
	c_address varchar2(3 char) not null,
	c_seat number(3) not null
);


-- 2. 조건에 맞는 테이블을 생성 + 데이터 넣기
-- a카페는 서울에 위치하고 좌석 100석
--   (아메리카노, 2000원), (라뗴, 3000원), (녹차, 2500원)을 판매
-- b카페는 제주에 위치하고 좌석 80석
--		(홍차, 2500원), (스무디, 3000원), (에스프레소, 4000원)을 판매
insert into jun04_drink values ('아메리카노', 2000, 'a');
insert into jun04_drink values ('라떼', 3000, 'a');
insert into jun04_drink values ('녹차', 2500, 'a');
insert into jun04_drink values ('홍차', 2500, 'b');
insert into jun04_drink values ('스무디', 3000, 'b');
insert into jun04_drink values ('에스프레소', 4000, 'b');
insert into jun04_cafe values ('a', '서울', 100);
insert into jun04_cafe values ('b', '제주', 80);


-- 3. 쿼리문 작성
--	전체 음료 기준 평균가보다 비싼 음료는 몇 종류?
select count(*) from jun04_drink
	where d_price >=(
				select avg(d_price)
				from jun04_drink
	);
	
-- 	제일 싼 음료를 파는 카페의 이름?
select d_cafename from jun04_drink
	where d_price =(
			select min(d_price)
			from jun04_drink
	);
-- 	서울에 있는 카페에서 만드는 음료의 평균가?
select round(avg(d_price),1) from jun04_drink
	where d_cafename = (
			select c_name from jun04_cafe
			where c_address = '서울'
			);
-- 	좌석이 90석 이상인 카페에서 파는 음료의 이름?
select d_name from jun04_drink
	where d_cafename = (
			select c_name from jun04_cafe
			where c_seat >= 90
			);
-- 	전체 음료 기준 평균가 이하인 음료 이름?
select d_name from jun04_drink
	where d_price <= (
			select avg(d_price) from jun04_drink
			);
-- 	가장 비싼 음료를 파는 카페는 어디에 있는지?
select c_address from jun04_cafe
	where c_name =(
		select d_cafename from jun04_drink
			where d_price=(
			select max(d_price) from jun04_drink
			)
		);