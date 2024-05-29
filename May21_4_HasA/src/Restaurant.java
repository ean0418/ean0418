
public class Restaurant {
	// 강남포차, 논현동, 02-1111-2222, Andrew Kim의 식당
		// 출력 (식당 주인의 정보까지)
	String name;
	String location;
	String phoneNum;
	Someone owner;
	
	public Restaurant() {
		// TODO Auto-generated constructor stub
	}

	public Restaurant(String name, String location, String phoneNum, Someone owner) {
		super();
		this.name = name;
		this.location = location;
		this.phoneNum = phoneNum;
		this.owner = owner;
	}
	public void printIntro() {
		System.out.println(name);
		System.out.println(location);
		System.out.println(phoneNum);
		owner.printInfo();
	}
}
