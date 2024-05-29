// Function - 클래스 밖에 만든 것 - x (사실상 Java에는 function 이라는 용어가 없음)
// method - Class 속에 만든 것 (Class에 종속적인 함수라고도 표현)
//			- 여태까지 써왔던건 다 method였던거임..




// Class : 객체를 찍어내는 틀!

public class Bus {
	// 멤버변수 (Member Variable)   - 속성 ( = attribute, field, 전역변수)
	//							  - 객체의 데이터가 저장되는 공간
	
	// 버스번호
	// 버스의 차종
	// 버스회사
	// 버스의 운전사
	// 버스의 시작점
	int number;
	String car;
	String company;
	String name;
	String startingPoint;
	
	public void printInfo() {
		// this : 객체 자기 자신을 말한다.( this. 생략 가능 0)
		System.out.println(this.number);
		System.out.println(car);
		System.out.println(company);
		System.out.println(name);
		System.out.println(startingPoint);
	
	}
	
	// method - 액션, 프로그램상 필요한 기능
	//			-객체의 동작에 해당하는 실행 블록
	public void go() {
		System.out.println("부릉~");
	}
}
