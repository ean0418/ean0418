
public class Market {
	String name;
	String location;
	Plate buying;
	
	public Market() {
		// TODO Auto-generated constructor stub
	}

	public Market(String name, String location, Plate buying) {
		super();
		this.name = name;
		this.location = location;
		this.buying = buying;
	}
	public void printInfo() {
		System.out.println(name);
		System.out.println(location);
		buying.printInfo();
	}
}
