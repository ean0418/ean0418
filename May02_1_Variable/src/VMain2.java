
public class VMain2 {
	public static void main(String[] args) {
		// 이름, 오늘 날짜 (연도.월.일), 사는 곳(지역),
		// 시력, java경험의 유무(%b)

		String name = "황정수";
		int year = 2024;
		int month = 5;
		int day = 2;
		String location = "용인";
		double sight = 1.2;
		boolean java = false;
		System.out.println("이름 : " + name);
		System.out.println("오늘 날짜 : " + year + "." + month + "." + day);
		System.out.printf("날짜 : %d.%02d.%02d\n", year, month, day);
		System.out.println("사는 지역 : " + location);
		System.out.println("시력 : " + sight);
		System.out.printf("시력 : %.1f\n", sight);
		System.out.printf("java경험의 유무 : %b\n", java);
		System.out.println("java경험의 유무 : " + java);
		System.out.println("----------------------");
		/////////////////////////////////////////

		// 섬유향수
		// 1000원
		// 80ml
		// 체리블라썸
		// 향균은 99.9%
		// 무색
		// 다이소
		// 재활용 해야함 (true / false)

		String name2 = "섬유향수";
		int price = 1000;
		int measure = 80;
		String smell = "체리블라썸";
		double antibacterial = 99.9;
		String color = "무색";
		String company = "다이소";
		boolean recycle = true;

		System.out.println("이름 : " + name2);
		System.out.printf("이름 : %s\n", name2);
		System.out.println();

		System.out.println("가격 : " + price + "원입니다");
		System.out.printf("가격 : %d원입니다\n", price);
		System.out.println();

		System.out.println("용량 : " + measure + "ml입니다");
		System.out.printf("용량 : %dml입니다\n", measure);
		System.out.println();

		System.out.println("향균 : " + antibacterial + "%입니다");
		System.out.printf("향균 : %.1f%%입니다\n", antibacterial);
		System.out.println();

		System.out.println("색 : " + color);
		System.out.printf("색 : %s\n", color);
		System.out.println();

		System.out.println("구매처 : " + company);
		System.out.printf("구매처 : %s\n", company);
		System.out.println();

		System.out.println("재활용 여부 : " + recycle);
		System.out.printf("재활용 여부 : %b\n", recycle);
		System.out.println("-----------------------");
	}
}
