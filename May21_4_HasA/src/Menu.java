
public class Menu {
	String name;
	int price;
	Restaurant food;
	
	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public Menu(String name, int price, Restaurant food) {
		super();
		this.name = name;
		this.price = price;
		this.food = food;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
		food.printIntro();
	}
}
