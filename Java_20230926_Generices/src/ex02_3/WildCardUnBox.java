package ex02_3;

class Box<T>{
	private T ob;	
	public void set(T ob) { this.ob = ob;}
	public T get() {return this.ob;}  
 
	@Override
	public String toString() {return ob.toString();}
}
class Toy{
	public String toString() {return "I am a Toy";}
		
}
class BoxHandler{
	public static void outBox(Box<Toy> box) { // 꺼내기
		Toy t = box.get();
		System.out.println(t);
	}
	
	public static void inbox(Box<Toy> box, Toy n) { // 저장하기
		box.set(n);
	}
}


public class WildCardUnBox {

	public static void main(String[] args) {
		
		 Box<Toy> box = new Box();
		 BoxHandler.inbox(box, new Toy());
		 BoxHandler.outBox(box);
	
	}

}
