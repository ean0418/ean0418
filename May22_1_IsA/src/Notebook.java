
public class Notebook extends ShoppingMall{
	String cpu;
	int ram;
	int hdd;
	int weight;
	int battery;
	
	public Notebook() {
		// TODO Auto-generated constructor stub
	}

	public Notebook(String name, int price, String cpu, int ram, int hdd, int weight, int battery) {
		super(name, price);
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
		this.weight = weight;
		this.battery = battery;
	}
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(cpu);
		System.out.println(ram);
		System.out.println(hdd);
		System.out.println(weight);
		System.out.println(battery);
	}
}
