package ex09_inher;

public class Phone {

	String model;
	String color;
	
//	public Phone() {}  매개변수 생성자를 생성할꺼면 기본 생성자 또한 만들어줘야 뻑이안난다. or 매개변수를 요구하는 만큼 넣어준다.
	public Phone(String model,String color) {
		this.model = model;
		this.color = color;
	}
	
	
	public void bell() {
		System.out.println("전화벨이 울립니다.");
	}
	
	public void sendVoice(String message) {
		System.out.println("음성 메세지를 보냅니다 : " + message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다."); 
	}
}
