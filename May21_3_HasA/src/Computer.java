
public class Computer {
	String CPU;
	int RAM;
	int HDD;
	Company brand;
	
	public Computer() {
		// TODO Auto-generated constructor stub
	}

	public Computer(String cPU, int rAM, int hDD, Company brand) {
		super();
		CPU = cPU;
		RAM = rAM;
		HDD = hDD;
		this.brand = brand;
	}
	public void printInfo() {
		System.out.printf("CPU : %s\n", CPU);
		System.out.printf("RAM : %dGB\n", RAM);
		System.out.printf("HDD : %dGB\n", HDD);
		System.out.println(brand.location);
		System.out.println(brand.name);
		System.out.println(brand.staffNo);
		// brand.printInfo();
	}
}
