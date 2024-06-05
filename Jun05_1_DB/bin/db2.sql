select * from j5_restaurant;
select * from j5_owner;
select * from j5_menu;
--------------------------------------------------------------------
-- 좌석 수 제일 많은 식당을 운영하는 사람의 전체 정보 조회
select * 
	from j5_owner
	where o_no in (
		select r_ceo from j5_restaurant
	where r_seat=(
	select max(r_seat) 
	from j5_restaurant
	));
-- 메뉴 전체의 이름, 가격
--			을 가격 오름차순 => 가격이 같다면 메뉴명을 가나다 역숙 정렬
-- 여러번 정렬 하고 싶을 때.. => order by 컬럼명 (ASC/DESC), 컬럼명 (ASC/DESC),...
select m_name, m_price from j5_menu
		order by m_price, m_name desc;
-- 전체 사장님들 이름, 생일 조회
select o_name, o_birth from j5_owner;
-- 프렌차이즈 식당 몇 개?
select distinct count(*) from j5_restaurant; 
-- 프렌차이즈 메뉴 전체의 평균가
select avg(m_price) 전체평균가 from j5_menu;
---------------------------------------------------------------
-- 제일 비싼 메뉴 이름, 가격
select m_name, m_price from j5_menu
	where m_price =(
		select max(m_price) from j5_menu
		);
-- 최연장자 사장님의 이름, 생일 (최연장자 = 최소 생일 값)
select o_name, o_birth from j5_owner
	where o_birth = (
		select min(o_birth) from j5_owner
		);
-- 좌석 수 제일 적은 식당의 이름, 지점명, 좌석 수
select r_name, r_location, r_seat from J5_RESTAURANT
	where r_seat = (
		select min(r_seat) from J5_RESTAURANT
	);
-------------------------------------------------------------
-- 홍콩반점 서초점을 운영하는 사람의 이름, 생일
select o_name, o_birth from J5_OWNER
	where o_no = (
		select r_ceo from j5_restaurant
			where r_location = '서초점'
			);
-- '짜장'이 들어간 음식은 어디가면 먹을 수 있나요? (식당이름,지정명)
select r_name, r_location from J5_RESTAURANT
	where r_no in (
		select m_f_no from j5_menu
			where m_name like '%짜장%'
			);
-----------------------------------------------------------
-- 최연소 사장님네 가게 메뉴 이름, 가격
select m_name, m_price from j5_menu
	where m_f_no =(
		select r_no from j5_restaurant
			where r_ceo =(
				select o_no from J5_OWNER
					where o_birth = (
						select max(o_birth) from J5_OWNER
						)
					)
				);
-- 최길동이 운영하는 가게의 모든 메뉴 이름, 가격, 사장님 생일

select m_name, m_price, (
	select o_birth
	from j5_owner
	where o_no = (
		select r_no
		from j5_restaurant
		where r_no = m_f_no
		)	
	) o_birth
from J5_MENU
	where m_f_no =(
		select r_no from j5_restaurant
			where r_owner in (
				select o_no
				from j5_owner
				where o_name ='최길동'
		));







