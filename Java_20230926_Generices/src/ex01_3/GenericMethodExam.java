package ex01_3;

class Box<T>{
	private T ob;
	
	public Box(T ob) {
		this.ob = ob;
	}
	
	public void set(T ob) {  // set :4번줄에 값을 넣고자함
		this.ob = ob;
	}
	public T get() {return this.ob;}  // get :4번줄에 값을 꺼내고자함
} 

class SteelBox<T> extends Box<T>{
	public SteelBox(T ob) {
		super (ob);
		
	}
}

public class GenericMethodExam {

	public static void main(String[] args) {
		
		Box<Integer> iBox = new SteelBox(new Integer(9999));
		Box<String> sBox = new SteelBox(new String("Sweet"));

		
//		Box<String> sBox2 = new SteelBox(new Integer(0000)); 하위클래스와 상위클래스의 타입을 일치시켜줘야한다.
		
		System.out.println(iBox.get());
		System.out.println(sBox.get());
		
	}

}
