
public class OMain1 {
	public static void main(String[] args) {
		
	
	// UP DOWN ( 1 ~ 100 )
	// 심판 / 친구 / 나
	// 주도적으로 끌고 갈 인물
	// 등장인물이 다 등장해야!
	// 상황 설정은 제각각
	// 심판과 친구는 나와있고 => 심판이 나를 불러내는 상황
	// 심판 => 친구한테 답요구 : 종이에 답을 적어서 제출
	// 심판 => 나 답요구 : 말로 대답을 할 것!
	// 판정 
	// 맞출때까지 진행 => 몇번째 시도만에 정답을 맞췄는지
	
	
	Friend f = new Friend();
	Me m = new Me();
	Judgement j = new Judgement();
	
	
	
	
	j.start(f);
	
	
	
	
	}
}
