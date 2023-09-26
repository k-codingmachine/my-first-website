package ex01_1;

class Box<T>{
	private T ob;
	public void set(T ob) {  // set :4번줄에 값을 넣고자함
		this.ob = ob;
	}
	public T get() {return this.ob;}  // get :4번줄에 값을 꺼내고자함
} 

class Unboxer{
	public static <T> T openBox(Box<T> box) {
		return box.get();
	}
//	public static <T> String openBox(Box<String> box) {
//		return box.get();
//	}
}

public class GenericMethodExam {

	public static void main(String[] args) {
		Box<String> box = new Box<String>(); 
		box.set("Sweet");
		
		String str = Unboxer.<String>openBox(box); //<String> 생략가능
		System.out.println(str);
		
	}

}
