

// 지역변수(Local Variable)
//		메소드 속에서 만든 변수
//		그 행동을 하는 동안에만 필요한 임시변수로..
// 메소드 파라미터 (Parameter)
//		그 행동을 하는데 필요한 재료
// 리턴되는 값
// 		그 행동을 한 후에 결과물
// 멤버변수 (Member Variable)
// 		그 객체의 속성


public class Doctor {

	String name;
	int age;
	
	public void showDoctorInfo() {
		System.out.println("<< 의사 >>");
		System.out.println(name);
		System.out.println(age);
	}
	public void callGuest(Patient p) {
		System.out.printf("의사 : %s씨 들어오세요\n", p.name);
	}
	public double askHeight(Patient p) {
		System.out.println("키 :");
		double h = p.answerHeight();
		return (h >= 1 && h <= 200) ? h/100 : askHeight(p);
	}
	public double askWeight(Patient p) {
		System.out.println("몸무게 :");
		double w = p.answerWeight();
		return w >= 1 && w <=100 ? w : askWeight(p);
	}
	// 비엠아이 계산
	public double calBmi(Patient p) {
		return p.weight / (p.height * p.height);
	}
	// 비엠아이 판단
	public String judgeBMI(Patient p) {
		if (p.bmi >= 40) {
			return "고도비만";
		} else if (p.bmi >= 35) {
			return "중증도비만";
		} else if (p.bmi >= 30) {
			return "경도비만";
		} else if (p.bmi >= 25) {
			return "과체중";
		} else if (p.bmi >= 18.5) {
			return "정상";
		} else {
			return "저체중";
		}
	}
	//결괌라해주기
	public void tellResult(Patient p) {
		System.out.printf("%s씨의 키는 %.1fcm이고, 몸무게는 %.1fkg..\n", p.name, p.height*100, p.weight);
		System.out.printf("당신은 ... %s입니다", p.bmiResult);
}
	public void start(Patient p) {
		callGuest(p);
		p.height = askHeight(p);
		p.weight = askWeight(p);
		p.bmi = calBmi(p);
		p.bmiResult = judgeBMI(p);
		tellResult(p);
	}
}