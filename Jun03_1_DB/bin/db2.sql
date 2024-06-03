-- <<쓸만한 내장 함수>>
-- 1. 숫자 함수
--	- ABS(숫자) : 절대값 계산		EX) ABS(-4.5)
--	- ROUND(숫자, m) : 숫자를 반올림, m은 반올림 기준 자릿수 ex) ROUND(5.36, 1)
--	- POWER(숫자, n) : 숫자의 n제곱 값을 계산 ex) POWER(2, 3)
--	- TRUNC(숫자, m) : 숫자의 m번째 자리까지 남기고 값을 버림 ex) TRUNC(123.456, 2)
--	- MOD(m, n) : 숫자 m을 n으로 나눈 나머지 ex) MOD(12, 10)
-- 	- SQRT(숫자) : 숫자의 제곱근 값을 계산 (숫자는 양수!) EX) SQRT(9.0)

select ABS(-4.5) from dual;
select ROUND(5.36, 1) from dual;
select POWER(2, 3) from dual;
select TRUNC(123.456, -1) from dual;
select MOD(12, 10) from dual;
select SQRT(18.0) from dual;

----------------------------------------------------
-- 2. 문자함수
-- 		- CONCAT(s1, s2) : 두 문자열을 연결 ex) CONCAT('ABCD', 'EFG')
--		- SUBSTR(s1, n, k) : 문자열의 n번째부터 k만큼의 길이를 반환 ex) SUBSTR('ABCDEFG', 3, 4)
--		- INSTR(s1, s2, n, k) : s1의 n번째부터 시작해서 찾고자 하는
--								s2가 k번째 나타내는 문자열의 위치를 반환 ex) INSTR('Hello','l',1,2)
--		- LPAD(s, n, c) : 문자열 s의 왼쪽부터 지정한 자리 수 n까지
--						지정한 문자 c로 채워줌 ex) LPAD('ABC', 5, '*')
--		- RPAD(s, n, c) : 문자열 s의 오른쪽부터 지정한 자리 수 n까지
--						지정한 문자 c로 채워줌 ex) RPAD('ABC', 5, '*')
--		- LTRIM(s1, s2) : 문자열 s1 기준으로 왼쪽에 있는 지정한 문자 s2 제거 ex) LTRIM('*ABC', '*')
--		- RTRIM(s1, s2) : 문자열 s1 기준으로 오른쪽에 있는 지정한 문자 s2 제거 ex) RTRIM('ABC*', '*')
--		- REPLACE(s1, s2, s3) : s1의 지정한 문자 s2를 문자 s3로 변경
--							ex) REPLACE('JACK and JUE', 'J', 'BL')
--		- LENGTH(s1) : 글자수를 세어주는 함수 ex) LENGTH('ㅋㅋㅋㅋ')
--		- LENGTHB(s1) : 글자의 용량(바이트)을 세어주는 함수 EX) LENGTHB('ㅋㅋㅋㅋ')
select CONCAT('ABCD', 'EFG') from dual;
select SUBSTR('ABCDEFG', 3, 4) from dual;
select INSTR('Hello','l',1,2) from dual;
select LPAD('ABC', 5, '*') from dual;
select RPAD('ABC', 5, '*') from dual;
select LTRIM('*ABC','*') from dual;
select RTRIM('ABC*', '*') from dual;
select REPLACE('JACK and JUE', 'J', 'BL') from dual;
select LENGTH('ㅋㅋㅋㅋ') from dual;
select LENGTHB('ㅋㅋㅋㅋ') from dual;
------------------------------------------------------------
-- 3. 날짜 / 시간 함수
-- [날짜 형식] - 대문자
-- 		YYYY : 4자리 연도
--		YYY, YY, Y : 각각 4자리 연도 마지막 3, 2, 1 자리
-- 		MM : 월
--		DD : 1달 중 날짜 (일자)
--		DAY : 요일 (월요일 ~ 일요일)
--		DY : 요일 약자 (월 ~ 일)
--		HH, HH12 : 12시간 / AM or PM : 오전 OR 오후
--		HH24 : 24시간
--		MI : 분 / SS : 초

-- 		- SYSDATE : 현재 날짜 / 시간을 반환
--		- TO_DATE(s1, datetime형식) : 문자형 데이터를 날짜형으로 반환
select to_date('2024-06-01 오전 06:00', 'YYYY-MM-DD PM HH:MI') from dual;
--		- TO_CHAR(date, datetime형식) : 날짜형 데이터를 문자형으로 반환
select to_char(sysdate, 'YYYY-MM-DD') from dual;
--		특정 날짜 값을 받아오고 싶다면 sysdate자리에 to_date함수를 넣어서 활용
-- => 반환되는 데이터 타입이 다르다!!
--		TO_DATE는 날짜형 / TO_CHAR는 문자형

--		- ADD_MONTHS(date, 숫자) : 날짜에서 지정한 달만큼 더함
--					(1 : 다음달, -1 : 이전달)
select add_months(sysdate, -3) from dual;

--    	- LAST_DAY(date) : 그 달의 마지막 날을 반환
select last_day(sysdate) from dual;
------------------------------------------------------------
-- 오늘 날짜 기준 연도 조회 (테이브 헤더에 ' 연도' / 컬럼에 '2024년' 이라고 나오게
select to_char(sysdate, 'YYYY') || '년' 연도 from dual;
-- 오늘 날짜 기준 월 조회 (테이브 헤더에 ' 월' / 컬럼에 '06월' 이라고 나오게
select to_char(sysdate, 'MM') || '월' 월 from dual;
-- 오늘 날짜 기준 일 조회 (테이브 헤더에 ' 일' / 컬럼에 '03일' 이라고 나오게
select to_char(sysdate, 'DD') || '일' 일 from dual;
-- 오늘 날짜 기준 시/분 조회 (테이브 헤더에 각각 '시', '분' / 컬럼에 '?시','분?' 이라고 나오게
select to_char(sysdate, 'HH') || '시' 시,
	to_char(sysdate, 'MI') || '분' 분 from dual;
-- 지금이 오전인지 오후인지 조회
select  to_char(sysdate, 'AM') "오전/오후" from dual;
-- 문자열 2024-06-06 오전 07:23을 문자형데이터 2024,06,06으로 조회
select to_char(to_date('2024-06-06 오전 07:23', 'YYYY-MM-DD AM HH:MI'),'YYYY.MM.DD') 날짜 from dual;
-- 오늘 날씨 기준 3달 전 마지막 날은 몇월 며칠인지 조회
select to_char(last_day(add_months(sysdate, -3)),'MM-DD') from dual;
----------------------------------------------------------------------------------------
-- 4. 집계 / 분석함수
--		select 컬럼명 쪽이나, having 절에서 사용!
--		- AVG(컬럼명) : 평균
--		- COUNT(컬럼명) : 검색되는 데이터 수
--		- MAX(컬럼명) : 최대값
--		- MIN(컬럼명) : 최소값
--		- SUM(컬럼명) : 총합
--		- RANK(컬럼명) :중복 순위만큼 다음 순위 값을 증가시킴
--		- DENSE_RANK(컬럼명) : 중복 순위가 존재해도 순차적으로 다음 순위값을 표시함
----------------------------------------------------------------------------------
-- 5. NULL 관련 함수
-- 현재 제약조건에 NOT NULL로 무조건 데이터를 입력하게 해놨는데
-- NULL : 미확인 값이나 아직 정용되지 않은 값
--			0이나 비어있는 공란도 아님 !

--		- NVL함수 : NULL인 경우만 지정된 값으로 대치하는 함수
--		NVL(값, NULL일때 대체할 값)
select nvl(null, 'B') from dual;
select nvl('A', 'B') from dual;

-- 		- NVL2함수 : NULL의 여부에 따라 지정한 값으로 대치하는 함수
--		NVL2(값, 값이 있을때 대체값, null일때 대체값)
select nvl2(null, 'A', 'B') from dual;
select nvl2('C', 'A', 'B') from dual;
