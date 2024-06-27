-- 사과 테이블 : 지역 / 색 / 맛 / 가격 / 소개 		정보


-- 데이터 2개 넣기

create table jun26_apple (
	a_region varchar2 (10 char) primary key,
	a_color varchar2 (10 char) not null,
	a_taste varchar2 (10 char) not null,
	a_price number(6) not null,
	a_intro varchar2(20 char) not null
); 

insert into jun26_apple values ('영주', 'red', '사과맛',10000,'사과맛이 나는 사과');
insert into jun26_apple values ('충주', 'green', '그린사과맛',8000,'그린사과맛이 나는 사과');

select*from jun26_apple;