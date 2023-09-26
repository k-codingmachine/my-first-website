package ex01_2;

class Box<T>{
	private T ob;
	public void set(T ob) {  // set :4번줄에 값을 넣고자함
		this.ob = ob;
	}
	public T get() {return this.ob;}  // get :4번줄에 값을 꺼내고자함
} 

class BoxFactory{
	public static <T extends Number> Box<T> makeBox(T o){ // T타입이 Number이거나 Number를 상속한 개체만 받아줌.
		Box<T> box = new Box<T>();
		box.set(o);
		
		System.out.println("Boxed data : " + o.intValue()); // intValue 정수화
		return box;
	}
}
class Unboxer{
	public static <T extends Number> T openBox(Box<T> box) {
		System.out.println("unBoxed data :" + box.get().intValue()); // box.get().intValue() : 값을 꺼내서 int화
		return box.get();
	}

}

public class GenericMethodExam {

	public static void main(String[] args) {
		Box<Integer> sBox = BoxFactory.makeBox(new Integer(9898)); 
		int n = Unboxer.openBox(sBox);
		System.out.println(n);
	
		
	}

}
