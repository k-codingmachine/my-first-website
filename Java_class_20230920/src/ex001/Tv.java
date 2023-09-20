package ex001;

public class Tv {

	String color;
	boolean power;
	int channel;
	
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
