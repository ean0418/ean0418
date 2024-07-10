create table moviesite_member(
	ms_id varchar2(10 char) primary key,
	ms_pw varchar2(10 char) not null,
	ms_name varchar2(10 char) not null,
	ms_fav_movie varchar2(20 char) not null,
	ms_addr varchar2(200 char) not null,
	ms_photo varchar2(200 char) not null
);

select * from moviesite_member;