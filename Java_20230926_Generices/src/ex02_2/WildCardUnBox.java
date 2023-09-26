package ex02_2;

class Box<T>{
	private T ob;	
	public void set(T ob) { this.ob = ob;}
	public T get() {return this.ob;}  
 
	@Override
	public String toString() {
		return ob.toString();
 }
}
	class Unboxer{
							// 하한 제한
		public static void peekBox(Box<? super Integer> box) { // 와일드카드( Integer 이상의 클래스만 적용가능)
			System.out.println(box);
		}
	}


public class WildCardUnBox {

	public static void main(String[] args) {

		Box<Integer> iBox = new Box();
		iBox.set(9999);
		
		Box<Number> nBox = new Box();
		nBox.set(10.3);
		
		Box<Object> bBox = new Box();
		bBox.set("simple");
		
		Unboxer.peekBox(iBox);
		Unboxer.peekBox(nBox);
		Unboxer.peekBox(bBox);
	}

}
