import java.util.Scanner;

public class Patient {
	
	String name;
	int age;
	Scanner mouth = new Scanner(System.in);
	double weight;
	double height;
	double bmi;
	String bmiResult;
	
	public void showPatientInfo() {
		System.out.println("<< 환자 >>");
		System.out.println(name);
		System.out.println(age);
	}
	
	// 키에 대해 대답
	public double answerHeight() {
		return mouth.nextDouble();
	}
	// 몸무게
	public double answerWeight() {
		return mouth.nextDouble();
	}
}
