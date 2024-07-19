create table jul19_weather(
	w_no number(2) primary key,
	w_time number(5) not null,
	w_temp number(5) not null,
	w_hmx number(5) not null,
	w_wfKor varchar2(10 char) not null,
	w_wdKor varchar2(10 char) not null
);
drop sequence jul19_weather_seq;
create sequence jul19_weather_seq;
select * from jul19_weather;
drop table jul19_weather


create table jul19_dust(
	d_no number(2) primary key,
	d_MSRSTE_NM varchar2(10 char) not null,
	d_PM10 number(4, 1) not null,
	d_PM20 number(4, 1) not null
);
select * from jul19_dust;
create sequence jul19_dust_seq;
drop sequence jul19_dust_seq;
drop table jul19_dust;

------------------------------------------------
-- (table 간 제약조건 고려x)
-- 학생 : 이름, 생일, 몇 강의장, 중간, 기말
create table jul19_student(
	s_no number(2) primary key,
	s_name varchar2(10 char) not null,
	s_birth date not null,
	s_room varchar2(10 char) not null,
	s_test1 number(3) not null,
	s_test2 number(3) not null
);
create sequence jul19_student_seq;
select * from jul19_student;
------------------------------------------------
-- 강의장 : 몇 강의장, 강의장 위치
-- 1강의장 : 5층 복도 오른쪽 / 2강의장 : 5층 복도 왼쪽 끝
-- 3강의장 : 5층 복도 왼쪽 첫번째 / 4강의장 : 6층 정면 / 5강의장 : 6층 오른쪽 
create table jul19_lRoom(
	l_room varchar2(10 char) primary key,
	l_location varchar2(10 char) not null
);

insert into Jul19_lRoom values('1강의장', '5층 복도 오른쪽');
insert into Jul19_lRoom values('2강의장', '5층 복도 왼쪽 끝');
insert into Jul19_lRoom values('3강의장', '5층복도 왼쪽첫번째');
insert into Jul19_lRoom values('4강의장', '6층 정면');
insert into Jul19_lRoom values('5강의장', '6층 오른쪽');

select * from jul19_lRoom;