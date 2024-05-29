// 객체간의 관계
// A is a B : Dog is a Animal
public class IMain1 {
	public static void main(String[] args) {
		// 동물 객체 => sort, age + 정보 출력 기능
		Animal a = new Animal(null, 0);
		a.printInfo();
		Cat c = new Cat();
		c.printInfo();
		Dog d = new Dog("말티즈", 5, "집");
		d.printInfo();
		
	}
}
