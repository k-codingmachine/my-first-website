package ex06;

@FunctionalInterface
interface Ccc{
	int square(int x);
}
class Cccc implements Ccc{
	@Override
	public int square(int x) {
		return x*x;
	}
}


public class Lamda8 {
	public static void main(String[] args) {
		Ccc cc = x -> x*x;
			
			int result = cc.square(9);
			System.out.println(result);
			
			
			
			
			

			
	
		
	}

}
