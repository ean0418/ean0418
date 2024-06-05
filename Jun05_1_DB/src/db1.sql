-- 요식업 프랜차이즈 (참조관계 고려 x)

-- 홍콩반점 서초점은 홍길동이 운영하고 100석
-- 홍콩반점 종로점은 김길동이 운영하고 80석
-- 한신포차 강남점은 홍길동이 운영하고 150석
-- 부천포차 부천점은 최길동이 운영하고 150석
-----------------------------------------
-- 홍길동, 1990-03-01일생, 남자
-- 김길동, 1992-02-01일생, 여자
-- 홍길동, 1991-12-12일생, 여자
-- 최길동, 1989-09-01일생, 남자
-------------------------------------------
-- 짜장면, 5000원, 홍콩반점 서초점(100석)에서 파는
-- 불닭발, 12000원, 한신포차 강남점(150석)에서 파는
-- ... 매장당 메뉴 5개 정도씩

create table j5_restaurant(
	r_no number(3) primary key,
	r_name varchar2(5 char) not null,
	r_location varchar2(5 char) not null,
	r_owner varchar2(3 char) not null,
	r_ceo number(3) not null,
	r_seat number(3) not null
);
create sequence j5_restaurant_seq;

create table j5_owner(
	o_no number(3) primary key,
	o_name varchar2(3 char) not null,
	o_birth date not null,
	o_gender varchar2(3 char) not null
);
create sequence j5_owner_seq;

create table j5_menu(
	m_no number(3) primary key,
	m_name varchar2(7 char) not null,
	m_price number(5) not null,
	m_f_no number(3) not null
);
create sequence j5_menu_seq;
drop table j5_owner cascade constraint purge;
insert into j5_restaurant values (j5_restaurant_seq.nextval,'홍콩반점', '서초점', '홍길동',1, 100);
insert into j5_restaurant values (j5_restaurant_seq.nextval,'홍콩반점', '종로점', '김길동',2, 80);
insert into j5_restaurant values (j5_restaurant_seq.nextval,'한신포차', '강남점', '홍길동',3, 150);
insert into j5_restaurant values (j5_restaurant_seq.nextval,'부천포차', '부천점', '최길동',4, 150);
select * from j5_restaurant;

insert into j5_owner values (j5_owner_seq.nextval,'홍길동', to_date('1990-03-01','YYYY-MM-DD'), '남자');
insert into j5_owner values (j5_owner_seq.nextval,'김길동', to_date('1992-02-01','YYYY-MM-DD'), '여자');
insert into j5_owner values (j5_owner_seq.nextval,'홍길동', to_date('1991-12-12','YYYY-MM-DD'), '여자');
insert into j5_owner values (j5_owner_seq.nextval,'최길동', to_date('1989-09-01','YYYY-MM-DD'), '남자');
select * from j5_owner;

insert into j5_menu values (j5_menu_seq.nextval,'짜장면', 5000, 1);
insert into j5_menu values (j5_menu_seq.nextval,'짬뽕', 5500, 1);
insert into j5_menu values (j5_menu_seq.nextval,'탕수육', 15000, 1);
insert into j5_menu values (j5_menu_seq.nextval,'울면', 6000, 1);
insert into j5_menu values (j5_menu_seq.nextval,'볶음밥', 7000, 1);
insert into j5_menu values (j5_menu_seq.nextval,'짜장면', 5000, 2);
insert into j5_menu values (j5_menu_seq.nextval,'사천짜장면', 6000, 2);
insert into j5_menu values (j5_menu_seq.nextval,'짬뽕', 6000, 2);
insert into j5_menu values (j5_menu_seq.nextval,'깐풍기', 16000, 2);
insert into j5_menu values (j5_menu_seq.nextval,'마라샹궈', 13000, 2);
insert into j5_menu values (j5_menu_seq.nextval,'불닭발', 12000, 3);
insert into j5_menu values (j5_menu_seq.nextval,'통닭', 14000, 3);
insert into j5_menu values (j5_menu_seq.nextval,'계란찜', 10000, 3);
insert into j5_menu values (j5_menu_seq.nextval,'주먹밥', 3500, 3);
insert into j5_menu values (j5_menu_seq.nextval,'오돌뼈', 13000, 3);
insert into j5_menu values (j5_menu_seq.nextval,'불닭발', 13500, 4);
insert into j5_menu values (j5_menu_seq.nextval,'골뱅이소면', 17000, 4);
insert into j5_menu values (j5_menu_seq.nextval,'주먹밥', 4000, 4);
insert into j5_menu values (j5_menu_seq.nextval,'계란말이', 11000, 4);
insert into j5_menu values (j5_menu_seq.nextval,'감자채전', 12000, 4);
select*from j5_menu;
select*from j5_restaurant;
select*from j5_owner;




