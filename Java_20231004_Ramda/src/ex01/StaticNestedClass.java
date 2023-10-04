package ex01;

class Outer{
	private static int num = 0;

	
	public Outer() {
		System.out.println("----------------------------------");
	}
	
	static class Nested1{ // static안에서는 this를 쓸수없다.
		void add(int n) {	num += n ;}
	}
	static class Nested2{
		int get() {	return num;}
	}
}
public class StaticNestedClass {

	public static void main(String[] args) {

		Outer.Nested1 nst1 = new Outer.Nested1();
		nst1.add(5);
		
		Outer.Nested2 nst2 = new Outer.Nested2();
		System.out.println(nst2.get());
		
	}

}
