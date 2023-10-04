package ex06;

@FunctionalInterface
interface Predicate<Integer>{
	 boolean test(int x);
}

public class Lamda92 {
	public static void main(String[] args) {
		
//		Predicate<Integer> p1 = x -> {
//			if(x%2 == 0) {
//				return true;
//			}else
//				return false;
//		};
//		System.out.println(p1.test(5));
		
		Predicate<Integer> p1 = new Predicate<Integer>() {
			
			@Override
			public boolean test(int x) {
				return x%2==0;
			}
		};
		
		boolean flag = p1.test((int)(Math.random()*100));
		
		String msg = flag == true ? "짝수" : "홀수";
		
		System.out.println(msg);
		System.out.println("-----------------------");
		
		
		Predicate<Integer> p2 =  x -> x%2==0;
			
		
		
		flag = p2.test((int)(Math.random()*100));
		
		msg = flag == true ? "짝수" : "홀수";
		
		System.out.println(msg);
	}

}
