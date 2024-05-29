// 아무 상속도 받고 있지 않으면 extends Object
// ShoppingMall is a Object (자바 객체)
public class ShoppingMall2 /* extends Object */ {
	String name;
	int price;
	
	
	public ShoppingMall2() {
		System.out.println("Product !");
	}

	public ShoppingMall2(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		
	}
	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
		
	}
}
