package ex01;

public class Tv {

	String color;
	boolean power;
	int channel;
	
	Tv(){   //생성자(반환타입 없음, 기본생성자는 디폴드값으로 만들어주지만 필요할떄마다 습관처럼 만들어주는게 좋다.)
		System.out.println("기본생성자");
	}
	Tv(int n){   //생성자(반환타입 없음)
		System.out.println("1개 변수");
	}
	Tv(String k, int n){   //생성자(반환타입 없음)
		System.out.println("2개 변수");
	}
	
	void power() {
		power = !power;     // 부정 티비가 켜지면 버튼눌러 끄고 역도 가능
	}
	void channelUP() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	

}
