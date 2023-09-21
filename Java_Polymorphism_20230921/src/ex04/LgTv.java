package ex04;

abstract public class LgTv extends Tv{ // 하위클래스도 추상클래스가 될 수있다.

	public void powerOn() {
		System.out.println("LgTv.. 전원 키다.");
	}
	
	public void powerOff() {
		System.out.println("LgTv.. 전원 끈다.");
	}
	
//	public void volumeUp() {
//		System.out.println("LgTv.. 소리를 올리다.");
//	}
	
	public void volumeDown() {
		System.out.println("LgTv.. 소리 내리다.");
	}
	
}
