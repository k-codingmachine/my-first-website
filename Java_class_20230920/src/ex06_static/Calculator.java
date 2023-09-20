package ex06_static;

public class Calculator {

	int result; // 인스턴스 변수
	static int minus; // 정적변수, 클래스 변수
	
	// 인스턴스 메소드
	void add(int num1, int num2) {
		this.result =  num1+num2;
//		result =  num1+num2;(o)
	}
	//정적 메소드, 클래스 메소드 
	static void sub(int num1, int num2) { // static 객체없이 사용가능
//		this.minus = num1-num2;(x)
		minus = num1-num2;
	}
}
