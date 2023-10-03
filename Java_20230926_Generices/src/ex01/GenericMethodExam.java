package ex01;

class Box<T>{
	private T ob;
	public void set(T ob) {
		this.ob = ob;
	}
	
	public T get() {return this.ob;}
} 

class BoxFactory{
	public static <T> Box<T> makeBox(T o){ //<T>: 제네딕함수 Box<T>: 반화타입   makeBox : 변수 T o: 매개변수
		Box<T> box = new Box<T>();
		box.set(o);							// 지역변수는 괄호밖을나가면 스택공간에서 사라짐
		return box;
	}
}
public class GenericMethodExam {

	public static void main(String[] args) {
		Box<String> sBox = BoxFactory.makeBox("Sweet");
		// String str = sBox.get();
		System.out.println(sBox.get());
		
		Box<Double> dBox = BoxFactory.makeBox(7.59);
		System.out.println(dBox.get());

	}

}
