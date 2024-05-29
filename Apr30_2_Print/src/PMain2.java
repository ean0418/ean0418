
public class PMain2 {
	public static void main(String[] args) {
		// Escape Sequence(이스케이프 문자)
		// : 특수한 문자 or 특수한 기능을 표현할 때
		// 		역슬래쉬 \ 를 사용해서
					  
		// \t : Tab키 (줄 맞추는 용도)
		// \n : New Line (줄만 맞추는 용도)
		// \r : Carriage Return (커서를 맨 앞으로)
		// \r\n : Enter키
		// \b : Backspace키 (1byte만 지움) -> Java에서 사용x
		// 	   C언어  - 한 글자 : 1byte
		// 	   Java - 한 글자 : 2byte
		// \0 : 빈칸 (space키)
		
		// syso 4개에 각각 문장하나씩 생성
		// => 중간중간에 이스케이프 문자 넣어서 출력
		System.out.println("안녕하세요\t");
		System.out.println("저는\n26살"); 
		System.out.println("용인에\r사는\b"); 
		System.out.println("황정수\0입니다\r\n");	
		System.out.println("강아지는\r고양이보다\0\r\n귀엽다");

		// 현재 : 가볍게 확인용도로 사용하는 콘솔창이라서
		//		\r or \n 둘 중 하나만 있어도 enter키 처리가 가능
		// 파일처리 / 통신 : \r이나 \n 하나만 쓰게 되면...
		//			내용이 다 뒤집어질 수도 있음!
		// => 이클립스 안에서는 \r, \n을 구분하기는 어려움
		// => \n을 엔터처리로 하고, 이후에 파일처리에서 \r, \n을 보자!
		
		// \(^_^)\ 출력
		System.out.println("\\(^_^)/");
		// \\ : \를 글자로!
		
		// (".") 출력
		System.out.println("(\".\")");
		// \" : " 를 글자로!
		
		
	}

}
