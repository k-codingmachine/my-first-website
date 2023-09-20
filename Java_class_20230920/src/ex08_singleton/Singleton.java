package ex08_singleton;

public class Singleton {
	
	static Singleton singleton = new Singleton(); // Singleton방식: 객체를 개별적으로 만들지 않고 getInstance를 이용해서 접근하게 하는 방법
	
	int apple = 100;
	
	private Singleton() { // private로 인해 외부에서 Singleton객체 생성 불가
		
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
	
}
