package ex02_2;

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
class Box<T>{ 
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

		Box<Apple> aBox = new Box<Apple>(); // T를 전부 Apple로 바꾸어준다.
		
		aBox.setObj(new Apple()); // 33번줄에의해 Apple만 들어갈수있다.
		
//	    Apple a1 =(Apple)aBox.getObj(); 형변환의 과정이 불필요
		
		
		
		
//		Box aBox = new Box();
//		aBox.setObj(new Apple());
//		System.out.println(aBox.getObj());
	
	}
}
