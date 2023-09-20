package ex09_inher;

public class SmartPhone extends Phone {
	
	public boolean wifi;
	
	public SmartPhone(String model, String color, boolean wifi) {
		super(model,color); // 상위 클래스 생성자 호출
		this.wifi = wifi;
	}
	
	public void setwifi(boolean wifi) {
		this.wifi = wifi;
	}
	
	public void youtube() {
		System.out.println("유튜브 접속한다..");
	}
	

}
