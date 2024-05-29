
public class FMain4 {
	// 정수 2개를 넣으면 그 합을 출력해주는 함수
	// 정수 3개를 넣으면 그 합을 출력해주는 함수
	// 실수 3개를 넣으면 그 합을 출력해주는 함수
	
	// **** 고오오오오옹오오오급 기술 !!!!!!!!!!!!!!!?
	// 오버로딩(Overloading)
	// 함수명 같게, 파라미터를 다르게 하는 기술
	// 호출할 때 어떤 값을 넣었느냐에 따라 함수가 불러지게 하는 기술
	
	// 같은 자료형을 써도, 파라미터의 갯수가 다르면 오버로딩 가능
	// 파라미터의 갯수가 같아도, 자료형이 다르면 오버로딩 가능
	// => ** '그 함수들이 같은 기능을 하고있다' 전제조건! 
	
	 /* public static void test(int a, int b) {
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
	}

	public static void test(int a, int b, int c) {
		System.out.println(a + b + c);
		System.out.println(a - b - c);
		System.out.println(a * b * c);
		System.out.println(a / b / c);
	}

	public static void test(double a, double b, double c) {
		System.out.println(a + b + c);
		System.out.println(a - b - c);
		System.out.println(a * b * c);
		System.out.println(a / b / c);
	}
	*/
	
	/* public static void main(String[] args) {
	test(10, 20);
	System.out.println("--------");
	test(3, 4, 5);
	System.out.println("--------");
	test(1.1, 2.2, 3.3);
	System.out.println("--------"); 
	}
	 */
	
	
	// 정수 1개를 넣으면 => 윽! 출력
	// 문자열 1개를 넣으면 => 악! 출력
	// 실수 1개를 넣으면 => 으아아악! 출력
	// 아무것도 넣지 않으면 => ... 출력
	
	public static void test2 (int a) {
		System.out.println("윽!");
	}
	public static void test2 (String a) {
		System.out.println("악!");
	}
	public static void test2 (double a) {
		System.out.println("으아아악!");
	}
	public static void test2 () {
		System.out.println("....");
	}
	
	public static void main(String[] args) {
		test2(1);
		test2("집가고싶다");
		test2(3.3);
		test2();
	
	// 사실 우리는 첫날부터 이 오버로딩을 사용하고 있었습니다 !
	// o0o !
	// System.out.println();
	
	
	}

	
	
	
	
}
