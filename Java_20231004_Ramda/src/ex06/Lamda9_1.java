package ex06;

import java.util.function.Supplier;

// return (int)Math.random()*6;

// Supplier () -> T T get()

public class Lamda9_1 {
	public static void main(String[] args) {
//		Dddd dd = 
//			
//			() -> (int)Math.random()*6; //  문장이 하나면 {}생략
//
//			
//	int result = dd.roll();
//	System.out.println(result);
		
	
	Supplier<Integer> s1 = ()->(int)Math.random()*6;
	
	System.out.println(s1.get());
	
	System.out.println("-----------------------------------");
	
	Supplier<Integer> s2 = new Supplier<Integer>() {
		@Override
		public Integer get() {
			return (int)Math.random()*6;
		}
	};
	
	System.out.println(s2.get());

	}
}