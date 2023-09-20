package ex08_singleton;


// public > protected > default > private
public class B {

	public static void main(String[] args) {

		A a = new A();
		a.number = 10;
		
//		a.number2 = 100;
		a.number3 = 2;
		
		a.add();
		
	}

}
