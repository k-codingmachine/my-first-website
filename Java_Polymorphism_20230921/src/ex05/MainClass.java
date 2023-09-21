package ex05;

public class MainClass { // 상위클래스에서 하위클래스의 매서드를 사용하기 위해서는 메서드를 재정의하면된다.

	public static void main(String[] args) {

		Object obj  = new A();
		
		System.out.println(obj.toString());
	
	}

}
