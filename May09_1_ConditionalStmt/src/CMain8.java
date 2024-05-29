import java.util.Scanner;

// BMI 검사 프로그램 (함수.VER)

// 이름 키 몸무게 입력
// bmi : 몸무게 / (키 * 키) => 키 :m단위
// 18.5미만이면 저체중
// 18.5이상이면 정상
// 25이상이면 과체중
// 30이상이면 경도비만
// 35이상이면 중증도비만
// 40이상이면 고도비만

public class CMain8 {
	public static void putName() {
		Scanner k = new Scanner(System.in);
		System.out.print("이름 :");
		String name = k.next();
	}
	public static double putWeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("몸무게 :");
		double weight = k.nextDouble();
		return weight;
	}
	public static double putHeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("키(cm) :");
		double height = k.nextDouble();
		return height;
	}
	public static double getBMI(double weight, double height) {
		double bmi = weight / ((height / 100) * (height / 100));
		return bmi;
	}
	public static void checkBMI(double bmi) {
		if (bmi >= 40) {
			System.out.println("당신은 고도비만입니다");
		}else if (bmi >= 35) {
			System.out.println("당신은 중증도비만입니다");
		}else if (bmi >= 30) {
			System.out.println("당신은 경도비만입니다");
		}else if (bmi >= 25) {
			System.out.println("당신은 과체중입니다");
		}else if (bmi >= 18.5) {
			System.out.println("당신은 정상입니다");
		}else {
			System.out.println("당신은 저체중입니다");
		}
	}
	public static void endProgram() throws InterruptedException {
		Scanner k = new Scanner(System.in);
		System.out.print("아무키나 입력하시오:");
		String endBMI = k.next();
		
		switch (endBMI) {
		case "y": case "Y":
			Thread.sleep(1000);
			System.out.println("프로그램을 종료합니다");
			break;
		default:
			endProgram(); 
			break;
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		putName();
		double weight = putWeight();
		double height = putHeight();
		double bmi = getBMI(weight, height);
		System.out.printf("당신의 BMI 수치는 무려 %.2f입니다.\n", bmi);
		Thread.sleep(1000);
		System.out.println("두구두구 과연 당신의 운명은?");
		Thread.sleep(1000);
		System.out.println("...........");
		Thread.sleep(3000);
		checkBMI(bmi);
		System.out.println("-----------");
		Thread.sleep(1000);
		endProgram();
	}


}

















