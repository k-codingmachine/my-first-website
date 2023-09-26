package ex02;

class Box<T>{
	private T ob;	
	public void set(T ob) { this.ob = ob;}
	public T get() {return this.ob;}  
 
	@Override
	public String toString() {
		return super.toString();
 }
}
	class Unboxer{
		public static <T> T openBox(Box<T> box) { // 제네딕메소드
			return box.get();
		}
		public static void peekBox(Box<?> box) { // 와일드카드
			System.out.println(box);
		}
	}


public class WildCardUnBox {

	public static void main(String[] args) {

		Box<String> box = new Box<>();
		box.set("So Simple String");
		
		Unboxer.peekBox(box);
		
		String str = Unboxer.openBox(box);
		System.out.println("openBox : " + str);
	}

}
