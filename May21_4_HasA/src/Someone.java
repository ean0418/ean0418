
public class Someone {
	String name;
	String sex;
	String phoneNum;
	String who;
	Market garak;
	
	public Someone() {
		// TODO Auto-generated constructor stub
	}

	public Someone(String name, String sex, String phoneNum) {
		super();
		this.name = name;
		this.sex = sex;
		this.phoneNum = phoneNum;
	}
	public Someone(String name, Market garak) {
		super();
		this.name = name;
		this.garak = garak;
	}
	public void printInfo() {
		System.out.println(name);
		System.out.println(sex);
		System.out.println(phoneNum);
	}
	public void printInfo2() {
		System.out.println(name);
		garak.printInfo();
	}
}
