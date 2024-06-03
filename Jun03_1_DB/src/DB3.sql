-- 웹사이트에서 게시판에 대한 테이블과 이를 [참조하는] 댓글 데이블을 만드려고 함
-- 게시판 테이블에는 [작성자 / 게시판 글 내용 / 작성 시간] 에 대한 부분이 있었으면
-- 댓글 테이블에는 [작성자 / 댓글 내용 / 작성 시간]에 대한 부분이 있었으면

-- 1. 테이블의 구조를 파악해서 게시판 테이블 만들기
create table post(
	p_no number(2) primary key,
	p_name varchar2(10 char) not null,
	p_writing varchar2(30 char) not null,
	p_time date NOT NULL
);
create sequence post_seq;
-- 2. 테이블의 구조를 파악해서 댓글 테이블 만들기
create table post_reply(
	pr_no number(2) primary key,
	pr_p_no number(2) not null, -- 소속된 글 번호 / 이걸로 board 테이블을 참조
	pr_name varchar2(10 char) not null,
	pr_writing varchar2(10 char) not null,
	pr_time date not null,
	constraint fk_post_reply foreign key(pr_p_no)
		references post(p_no)
		on delete cascade
);
create sequence post_reply_seq;
-- [조건 : 참조 되는 테이블 내용이 삭제되면 관련있는 댓글 내용도 삭제]
-- 3. 게시판 테이블에 값 2개 넣고 / 각 게시글마다 댓글 2개씩 넣기
insert into post values(post_seq.nextval,'a','ㅎㅇ',sysdate);
insert into post values(post_seq.nextval,'b','ㄴㄴ',sysdate);
select * from post;
insert into post_reply values(post_reply_seq.nextval,1,'a', '방가',sysdate);
insert into post_reply values(post_reply_seq.nextval,2,'b','ㅇㅇ',sysdate);
insert into post_reply values(post_reply_seq.nextval,1,'c','qq',sysdate);
insert into post_reply values(post_reply_seq.nextval,2,'d','ss',sysdate);
-- [조건 : 날짜 관련한 값은 현재 날짜/시간으로 통일]
-- 4. 게시글 1번을 지웠을 때 관련 댓글들도 지워지는지 확인
delete from post where p_no = 1;

drop table post cascade constraint purge;
drop table post_reply cascade constraint purge;
drop sequence post_seq;
drop sequence post;



















