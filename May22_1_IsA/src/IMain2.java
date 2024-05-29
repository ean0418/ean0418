// A is a B : 상속관계
// 쇼핑몰 - "상품"에 대한 정보 게시
public class IMain2 {
	public static void main(String[] args) {
		// 신발 (이름, 가격, 사이즈)
		// 출렭
		
		// 컴퓨터 (이름 가격 사이즈 cpu ram hdd
		// 출력
		
		// 노트북 ( 무게 배터리 지속시간
		// 출력
		
		ShoppingMall shoppingMall = new ShoppingMall(null, 0);
		shoppingMall.printInfo();
		System.out.println("------------------");
		Shoes shoes = new Shoes("나이키", 150000, 250);
		shoes.printInfo();
		System.out.println("------------------");
		Computer computer = new Computer(null, 0, null, 0, 0);
		computer.printInfo();
		System.out.println("------------------");
		Notebook notebook = new Notebook(null, 0, null, 0, 0, 0, 0);
		notebook.printInfo();
		System.out.println("------------------");
	}
}
