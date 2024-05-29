// 실행용 Class : 프로그램 실행을 위한 mian() method를 제공하는 역할

public class OMain4 {
	// 이름, 사는곳 속성을 가진 학생 객체
	// 속성을 출력
	
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "황정수";
		s.resident = "용인";
		System.out.println("s가 student 객체를 참조");
		System.out.println(s);
		s.printStudent();
		System.out.println("=======================");
		// 완전히 독립한 서로 다른 객체
		Student s2 = new Student();
		s2.name = "황정수2";
		s2.resident = "용인2";
		System.out.println("s2가 Student 객체를 참조");
		System.out.println(s2);
		s2.printStudent();
		s.printStudent();
		
	}
}
