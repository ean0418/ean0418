
public class Company {
	String name;
	String location;
	int staffNo;
	
	
	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(String name, String location, int staffNo) {
		super();
		this.name = name;
		this.location = location;
		this.staffNo = staffNo;
	}
	public void printInfo() {
		System.out.println(name);
		System.out.println(location);
		System.out.println(staffNo);
	}
}
