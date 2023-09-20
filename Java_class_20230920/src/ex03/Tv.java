package ex03;

public class Tv {

	String color;
	boolean power;
	int channel;  // 맴버변수 (this를 사용하면 지역변수의 값을 맴버변수의 값으로 바꿔준다.
	
	//생성자의 역할 : 멤버변수 초기화 이용될수 있다.
	Tv(){   //생성자(반환타입 없음, 기본생성자는 디폴드값으로 만들어주지만 필요할떄마다 습관처럼 만들어주는게 좋다.)
		System.out.println("기본생성자");
	}
	Tv(int channel){  // 지역변수(지역변수와 맴버변수가 충돌하면 지역이 먼저사용)
		this.channel = channel;
	}
	
	Tv(String color, boolean power, int channel){   
		this.color = color;
		this.power = power;
		this.channel = channel; // 멤버변수를 다 지정해줘야한다.
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
