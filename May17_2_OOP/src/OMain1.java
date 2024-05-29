// Coder : 개발자
// Programmer : Coder + 설계 ***

// OOD (Object Oriented Design) - 객체 지향 디자인
// 실생활을 디자인


public class OMain1 {
	public static void main(String[] args) {
		
		// 의사 (이름, 나이)
		Doctor d = new Doctor();
		d.name = "황정수";
		d.age  = 37;
		d.showDoctorInfo();
		
		
		// 손님 (이름, 나이)
		Patient p = new Patient();
		p.name = "황정수2";
		p.age = 27;
		p.showPatientInfo();
		
		d.start(p);
		
		
	}
}
