package ex02_3;

class Apple{
	public String toString() {
		return "I am an apple";
	}
}

class Orange{
	public String toString() {
		return "I am an orange";
	}
}

// 제네릭 클래스
class Box<T extends Number> {  // Number은 정수의 꼭대기
	private T obj;
	
	void setObj(T obj) {
		this.obj = obj;
	}
	
	T getObj() {
		return obj;
	}
	
}



public class Generices1 {
	public static void main(String[] args) {

		Box<Integer> aBox = new Box(); //<>안에는 Number 부터 하위클래스 전부 들어올수있다.
	
	}
}
