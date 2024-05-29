import java.util.Scanner;

public class KIMain2 {
	public static void main(String[] args) {
		// 메뉴판 (분식집)
		// 떡볶이, 순대, 어묵, 튀김, 주먹밥
		// 가격을 입력받아서
		// 메뉴판 모양으로 출력~~~`
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
		String aaa = keyboard.next();
		System.out.print("＊\t동대문 엽기떡볶이\t");
		String aaab = keyboard.next();
		System.out.print("＊\t메뉴판\t");
		String aaac = keyboard.next();
		
		System.out.print("＊엽떡 : ");
		int riceCake = keyboard.nextInt();
		
		System.out.print("＊순대 : ");
		int soondae = keyboard.nextInt();
		
		System.out.print("＊튀김 : ");
		int fried = keyboard.nextInt();
		
		System.out.print("＊주먹밥 : ");
		int rice = keyboard.nextInt();
		
		System.out.print("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
		String aaad = keyboard.next();
		
		System.out.println("------------");
		System.out.printf("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊%s\n", aaa);
		System.out.printf("＊\t동대문 엽기떡볶이%s\t*\n", aaab);
		System.out.printf("＊\t\t메뉴판%s\t*\n", aaac);
		System.out.printf("＊엽떡\t: %,7d원\t*\n", riceCake);
		System.out.printf("＊순대\t: %,7d원\t*\n", soondae);
		System.out.printf("＊튀김\t: %,7d원\t*\n", fried);
		System.out.printf("＊주먹밥\t: %,7d원\t*\n", rice);
		System.out.printf("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊%s\n", aaad);
			
				
	}
}
