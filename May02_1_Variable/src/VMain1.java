import javax.sound.midi.Soundbank;

public class VMain1 {
	public static void main(String[] args) {
		// 컴퓨터의 장치 !!
		// CPU / RAM / HDD / GPU

		// CPU : 연산장치(Intel : i5-xxxx, i7-xxxx, / AMD : RyzenX)
		// HDD(SSD) : 파일 형태로 저장(장치)
		// => 영구 저장
		// RAM : 변수 형태로 저장(장치)
		// => 임시 저장
		// GPU : 그래픽처리용 (CPU + HDD + RAM) + 보조적 도움

		// 데이터를 임시보존 -> RAM에 변수로 저장!
		// 데이터를 영구보존 -> HDD에 파일로 저장!
		// => 그래서 변수는 무엇?

		// syso로 글자나 숫자를 출력했을 때 -> 휘발성(1회성)임
		// => 재사용이 안됨!
		System.out.println("ㅋ" + "ㅎ" + "ㅁㄴㅇㄴㅇㄴㅁ");
		System.out.println(3 + 2 + 5 - 2);
		// 계산을 하다가...
		// 그 결과 값이 100줄 뒤에 필요하다면..?

		// 변수! (Variable) : 데이터를 저장하는 공간[그릇]
		// 왜? (x) / 언제 (0) - 왜 생겼다보다는 언제 생겼냐에 중점

		// 변수 문법 (어떻게 사용하는지)
		// 1. 변수 선언 - RAM에 공간을 확보해서
		// 무언가를 담을 수 있는 공간을 만든다!
		// ( 자료형 변수명;)의 형태인 변수를 '선언' 했다 라고 표현
		// ex) ( 그릇종류 그릇이름;)

		// 2. 변수 초기화
		// 변수에 값을 넣어줘야 하는데...
		// ( 변수명 = 값;) 의 형태로 표현
		// - 자료형 : 변수가 어떤 값으로 저장할지 그 형태
		// => 문자, 실수, 정수를 담아낼지
		// - 변수명 : 말 그대로 변수의 이름
		// => String s; : 문자열(String)을 담을 그릇 s
		// => int i; : 정수(int)를 담을 그릇 i

		// 변수 선언과 초기화를 동시에 하는 것도 가능 ~
		// ( 자료형 변수명 = 값;) 의 형태
		// => 이 형태를 변수를 만든다! 라고 표현하기로 ~

		// 변수명 짓는 규칙
		// 1. !숫자!로 시작하면 에러!
		int i = 3; // 가능
		// ex) int 3 = 3; xxxxxxx안됨
		// int 3x = 3; xxxxxx
		int i3 = 3; // 가능

		// 2. 특수문자, 띄어쓰기가 들어가면 에러!
		String s = "ㅋㅋ"; //
		// String * = "ㅋㅋ";
		// String u u = "ㅋㅋ";

		// 3. 자바문법(예약어) 사용하면 에러!
		// int int = 3;
		int _int = 3; // 써야한다면 아래 하이픈 써서 에러를 방지!

		/*
		 * Java 문화) 4. 변수명을 봐도 뭔지 알 수 있게! int asdsaf = 2; 가능하다만 뭔지 모름... int age = 2;
		 * 알아볼 수 있도록 변수명을 짓자!
		 */

		/*
		 * 5. 가독성을 위해서 (띄어쓰기가 필요한 경우에) int price of computer = 100000; xxxxxxxx
		 * 
		 * 뱀체 int price_of_computer = 100000;
		 * 
		 * 낙타체 int priceOfComputer = 100000;
		 */

		/*
		 * 6. 한글은 사용 x !
		 */

		//////////////////////////////////////////////
		// 변수를 만들었을 때, ' = ' 에 대해 한번 살펴보자 !
		// = : 대입연산자
		// A = B
		// 현실) A는 B랑 같다.
		// 프로그래밍전반) A에 B라는 값을 넣어라!

		// 자료형
		// Bit : 데이터를 나타내는 최소 단위
		// Binary Digit(이진수)
		// 모든 데이터가 0, 1의 조합으로 구성되는데.
		// 이 때 0, 1의 값이 하나의 Bit가 됨
		// => 8 bits = 1 byte

		// 기본형
		// 정수
		// byte : -128 ~ 127 (맨 앞 부호비트 0 : 양수/ 1 : 음수)
		// short : 약 -3만 ~ 3만
		// int : 약 -21억 ~ 21억 (v) --->대부분 메인사용
		// long : int 를 벗어나는 범위
		// 실수
		// float : 대략
		// double (v) : 상세
		// 다른언어 : float / Java 한정 : double 주력
		// 문자
		// char : 하나의 문자
		// 논리
		// boolean : 참 / 거짓 ( true / false )
		// 없음
		// void : '없음' (나중에 알아보자!)

		// 참조형
		// 기본형이 아닌 것들은 전부 다 참조형 !!
		// 문자열
		// String : 문자열(여러글자)를 저장, 앞에 대문자 S!

		// char vs String
		// char c = 'ㅋ'; // 한 글자를 담는 char / 작은따옴표 사용!
		// String s = "ㅋㅋㅋㅋㅋ";

		// 6층
		// 손가락이 10개
		// =? 각각 변수를 선언한 후 => 변수 초기화까지!

		// String floor = "6층";
		// String fingerNo = "10개";
		// System.out.println(floor);
		// System.out.println(fingerNo);

		int floor;
		floor = 6;

		int finger;
		finger = 10;
		System.out.println(floor);
		System.out.println(finger);

		// 변수 선언과 초기화를 동시에 설정 0
		int num = 10;
		// int num2 = "ten"; // 자료형에 맞지 않는 값 넣으면 에러
		System.out.println(num);
		System.out.println("------");

		int subway = 9;
		double subway2 = 9;
		System.out.println(subway2);
		// double에 int값을 넣는게 가능! but 반대로 불가능
		// 넓게 보면 9는 9.0으로도 표현 가능
		///////////////////////////////////////////

		// 자료형을 쓰면 변수 만드는거까지 포함
		int a = 10; // a라는 이름을 가진 정수형 변수를 만들기
					// + a에 10을 넣기
		// int a;
		// a = 10;

		// 자료형을 쓰지 않으면 값을 수정
		a = 20; // 변수가 이미 만들어져있어야함
		System.out.println(a);

		// Python : 자바보다 고급언어(개발자가 x, 언어가 자동)
		// 자료형을 Python이 알아서 선택
		// a = 10; -> 변수가 없어면 a를 만들어서 10을 넣고
		// a = 10; -> 변수가 있으면 a의 값을 바꾸는 형태

		// 변수끼리도 계산이 가능 0
		System.out.println(floor + finger);

		// 메모리의 영역

		// ??? (추후에)

		// Stack :
		// 프로그램이 종료되면 자동으로 정리
		// 밑에서부터 차곡차곡 쌓이는...<기본형>

		// Heap : 
		// 	프로그램이 종료되어도 여전히 남아있음 (수동 정리)
		//	컴퓨터가 적당하다고 판단한 어떠한 위치에 만들어버림 (번지)
		
		// Garbage Collection : Heap 영역을 자동으로 정리해주는 시스템!
		
		int price = 7000;
		String menu = "짜장면";
		System.out.println(menu + "은 " + price + "원입니다");
		
		
		
	}
}
