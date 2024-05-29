public class FMain1 {
	


		// 함수 ( Function )!!!!!
		// 		관련있는 기능(작업)들을 묶고
		//		필요할때마다 불러서(호출해서) 사용이 가능하게 하는 것
		
		// JDK (자바 개발 키트) > JRE (자바 실행 환경)
		// 실행 시 JRE가 OS(운영체제)에 맞춰서 > JVM (자바 가상 머신) 을 만들게 됩니다
		// 	=> WORA (Write Once Read Anywhere) - Java의 장점 !
		// 	OS별로 프로그램을 만들지 않아도 됨!
		
		/* public static 리턴타입 함수명(파라미터, 파라미터, ...) {
			내용
			return
		}
		*/
		
		// 리턴타임 : 반환될 값의 자료형
		// 함수 내에서 식이 완성이 되고, main으로 반환할 결과값에 대한 자료형
		// return 이라는 것을 사용해서 반환할 것이고, 사용은 이따가..!
		
		// 함수명 : 말 그대로 이 함수의 이름
		// 		1. 숫자로 시작하면 -> 에러 !
		//		2. 특수문자, 띄어쓰기 -> 에러 !
		// 		3. 자바문법(예약어) -> 에러 !
		// 		 	-> _으로 시작해서 에러를 방지하는 방법이 있음
		// 		Java의 문화)
		// 		4. 함수명을 봐도 무슨 기능인지 알 수 있게!
		//		5. 소문자로 시작
		//		6. 가독성을 위해서 
		//			뱀체 : abcd_efg_gh
		//			낙타체 : abcdEfgHjd
		//		7. 한글 X !
		
		// 변수명 vs 함수명
		// (명사)   (동사)
	
	
		// 파라미터 (인자, parameter) : 함수를 실행하는데 필요한 재료
		// 필요한 갯수만큼 사용하되, 자료형에 맞춰서 사용해야 함 !!!
		
		public static void prinymythink() {
			System.out.println("아 집 가고싶다 졸립고 춥고 피곤하고 잠도 못잤다");
			System.out.println("하지만 그럴 수가 없다");
			System.out.println("공부를 해야하기 때문이다");
			System.out.println("그래도 열심히 해보자");
		}
		
		// 자기소개하는 함수 (이름, 핸드폰번호, 사는 곳 출력)
		public static void introduce_myself() {
			System.out.println("이름 : 황정수");
			System.out.println("핸드폰번호 : 010-1111-1111");
			System.out.println("사는 곳 : 용인");
		}
		// 정수 두 개를 넣으면, 사칙연산 결과를 출력해주는 함수
		// 계산하는 함수
		// 계산을 하려면, 숫자가 필요!
		// 파라미터(parameter) : 함수를 실행하는데 필요한 재료
		
		/* public static void calculate() {
			Scanner k = new Scanner(System.in);
			int a = k.nextInt();
			int b = k.nextInt();
			System.out.println(a + b);
		}
		*/ 
		public static void calculate(int a, int b) {
			System.out.println(a + b);
			System.out.println(a - b);
			System.out.println(a * b);
			System.out.println(a / (double) b);
		}
		
		
		
		// 실행 시 JVM이 main을 자동으로 호출!!
		// 우리가 자동완성해서 사용한 이 main도 사실은 함수의 일종!
		
			public static void main(String[] args) {
				
			prinymythink();
			prinymythink();
			System.out.println("------");
			
			introduce_myself();
			introduce_myself();
			System.out.println("-------");
		
			calculate(10, 20);
			System.out.println("-----");
			calculate(8, 2);
			System.out.println("-----");
			
		}
			
			
			
			
			
	}

