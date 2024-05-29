// 계산기
// 		정수 2개를 넣으면 그 합을 출력하는 기능
public class SMain2 {
	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.sum(1, 2); 	// static 기반
		c.sum(1, 2, 3); // static 기반 x
		/////////////////////////////////////////////////////
		
		Calculator.sum(30, 50); // static 0 => 메모리를 덜 쓰고 해결
//		Calculator.sum(30, 50, 70); // static x => 사용불가
	
		// 같은 맥락으로 Java의 내장 클래스 중 하나인 Math
		// 이거 또한 객체를 만들지 않고 사용한 경우!
		System.out.println(Math.PI);
		double s = Math.sqrt(10);
		System.out.println(s);
	}
}