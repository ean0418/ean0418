
public class Cellphone {

//	모델
	//		제조사
	//		가격
	// 		정보를 출력
	//		전화가 왔을 때 - 벨소리
	
	String name;
	String company;
	int price;
	
	public void printCellphone() {
		System.out.println(name);
		System.out.println(company);
		System.out.printf("%d만원\n",price);
	}
	public void bell() {
		System.out.println("띠리링");
	}
	
	
}
