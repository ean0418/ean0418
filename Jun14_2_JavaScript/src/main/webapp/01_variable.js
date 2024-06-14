// alert('성공!')

// JavaScript
//  Netscape 사에서 만들었고, 원래 이름은 LiveScript였음
//  Java의 인기가 엄청 높았을 떄 => JavaScript

//	인터프리터 언어! 
//  오타안나게 주의!!!

// 1. 변수
//		: 데이터를 담는 그릇!

// 변수에 접근하는 방법
//		- alert()			: 경고창을 띄워주는 함수
//		- console.log() 	: 로그를 띄워주는 함수
//		- document.write()	: 웹페이지에 내용을 출력

// name = "Ean";
// age = 20;		// => 이런 방식은 위험함 ! (전역 변수의 형태이기 때문에)

// 이걸 방지하기 위해서 변수 선언의 형태로 3가지 방법이 있는데...
//		var, let, const

//	▶ var : var(iable)
//		중복해서 선언 + 초기화가 가능

var a = 10;		// 변수 선언 + 초기화
console.log(a);		// 10
var a = 20;
console.log(a);
var a = 30;
console.log(a);
var a;			// 변수 선언 : 마지막에 할당된 값이 변수에 저장
console.log(a);

// => 기존에 선언해둔 변수를 까먹고 다시 값을 할당하는 실수가 발생할 수도 있음

// ▶ let : Java 변수 만들떄와 같은 느낌 (변수명 중복 x !)
let name = "황정수";
console.log(name);

// let name = "정수"; // 이미 name이 김비버로 선언되어 있기 때문에 에러 발생!
// console.log(name);

// let은 한번 선언한 후에 값은 바꿔줄 수 있음!
let grade = "F";
console.log(grade);
grade ="A+";
console.log(grade);

// ▶ const : 값이 절대로 바뀌지 않는 상수
//		수정이 안되고, 수정하려고 하면 에러가 발생함
//		파이, 최대값/최소값, 생일, ...
//		const 변수명 꼭 !!!! 반드시 ~~~ 대문자로 지어주세요!
const PI = 3.141592;
console.log(PI);
// PI = 6.144323434;
// console.log(PI);

// 정리 !
//		JS에서 변수를 선언할 때
//		변할 수 있는 값은 var, let
//		변하지 않는 값은 const로 선언
//	JS 변수명 짓는 조건 !! (JAVA와 동일)
//	 1. 변수는 문자와 숫자, $, _ 만 사용 0
//	 2. 첫 글자로는 숫자 x
//	 3. 예약어는 사용 X
// 		-> let let = 3; xxxxxxxx
//	 4. 변수명은 읽기 쉽고 이해할 수 있게 !
//	 5. const 변수를 만들 때 변수명을 대문자로!
// 	 






