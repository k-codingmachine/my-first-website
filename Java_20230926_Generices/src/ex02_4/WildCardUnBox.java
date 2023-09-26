package ex02_4;

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
	
					//상한제한 ==> 목적 ==> get가능..set불가..
	public static void outBox(Box<? extends Toy> box) { // 꺼내기, get만 가능
		Toy t = box.get();
		System.out.println(t);
	}
					//하한제한 ==> 목적 ==> set가능..get불가..
	public static void inbox(Box<? super Toy> box, Toy n) { // 저장하기, set만 가능
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
