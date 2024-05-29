
public class Plate {
	String name;
	int price;
	Menu bulgogi;
	public Plate() {
		// TODO Auto-generated constructor stub
	}
	public Plate(String name, int price, Menu bulgogi) {
		super();
		this.name = name;
		this.price = price;
		this.bulgogi = bulgogi;
	}
	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
	}
}
