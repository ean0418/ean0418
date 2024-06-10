-- 어떤 특정한 식당에 대한 테이블
-- 식당 지점(체인점 지역), 식당 주인(이름), 좌석 수
create table jun10_restaurant(
	r_location varchar2(10 char) primary key,
	r_owner varchar2(10 char) not null,
	r_seat number(4) not null
);
drop table jun10_restaurant cascade constraint purge;

-- 데이터 2-3개 정도 넣기
insert into jun10_restaurant values('강남점','황정수',300)
insert into jun10_restaurant values('용인점','김정수',200)
insert into jun10_restaurant values('건대점','이정수',400)
select * from jun10_RESTAURANT;
----------------------------------------------------------
-- 예약 테이블
-- 예약자 이름, 예약 시간, 예약자 전화번호, 예약 지점
create table jun10_reservation(
	r_no number(2) primary key,
	r_name varchar2(10 char) not null,
	r_time date not null,
	r_phone varchar2(15 char) not null,
	r_location varchar2(10 char) not null,
	constraint fk_r_location foreign key (r_location)
		references jun10_restaurant(r_location)
		on delete cascade
);
-- 데이터 2-개 정도 넣기
create sequence j_reservation_seq;
drop sequence j_reservation_seq;
insert into jun10_reservation values(j_reservation_seq.nextval,'김세훈',to_date('2024-06-10 18:30', 'YYYY-MM-DD HH24:MI'), '010-1111-2222','강남점');
insert into jun10_reservation values(j_reservation_seq.nextval,'양세훈',to_date('2024-06-11 20:00', 'YYYY-MM-DD HH24:MI'), '010-2222-3333','용인점');
insert into jun10_reservation values(j_reservation_seq.nextval,'이세훈',to_date('2024-06-10 15:20', 'YYYY-MM-DD HH24:MI'), '010-3333-4444','건대점');
SELECT *FROM jun10_reservation;
drop table jun10_reservation cascade constraint purge;
----------------------------------------------------------




