
public class PMain1 {
	public static void main(String[] args) {

		// syso : 출력(Print) 기능
		// System.out.println();

		// Print의 형태
		// 1. println : Console창에 내용을 출력하고, 줄 바꿈
		// => 괄호안에 값을 넣지 않으면 : 줄 바꿈 역할 !!
		// 2. print : Console창에 내용을 출력하고, 줄 바꿈 x
		// 3. printf : Console창에 형식을 지정해서 내용을 출력
		// (ex: 소수점 자릿수)

		System.out.println("println : 글자출력 + 줄바꿈기능");
		System.out.print("print : 글자 출력");
		System.out.println();
		System.out.printf("printf : ");
		System.out.println();

		// ??? : syso를 자동완성을 하면 => println만 나오는데..
		// 왜 print랑 printf는 자동완성이 없을까요?
		// = println을 제일 많이 사용하기 때문에!

		// syso를 이용
		// 괄호안에 숫자 2개를 넣어서 사칙연산에 대한 결과를 출력!

		System.out.println("------");
		System.out.println(1 + 3); // 4
		System.out.println(1 - 3); // -2
		System.out.println(1 * 3); // 3
		System.out.println(12 / 3); // 4
		System.out.println("------");

		// ??? : 숫자 계산할 때는 큰따옴표를 사용하지 않았을까?
		// => 큰따옴표 사이에 뭔가 내용을 넣으면...
		// => '문자'로 인식!!
		System.out.println("1 + 3");
		System.out.println("1 - 3");
		System.out.println("1 * 3");
		System.out.println("12 / 3");
		// 계산이 안되고 10+2 문자 그대로 나오는 걸 확인할 수 있음

		System.out.println("ad" + "ksa" + "jdk");
		System.out.println("dasdsa");
		System.out.println("wqewqewqe");
		System.out.println("sdsadsad");

		// 띄어쓰기, 줄바꿈, 들여쓰기 => 전혀 관심 없음(컴퓨터 입장)
		// 단순히 사람의 가독성을 위해서 사용하는 것!

		// 한글자당 2byte의 용량을 차지
		// 이 파일을 압축 -> 띄어쓰기, 줄바꿈, 들여쓰기를 없애서
		// => 용량을 줄임

		// 가독성 vs 컴퓨터 자원 아끼기 ?

		// 요즘 시대에 컴퓨터들의 사양이 상당히 향상!
		// 일단은 코드를 짜는대로 짜는데,
		// ctrl + shift + f (정렬 단축키를 활용)
		

	}
}
