package ex06;

@FunctionalInterface
interface Ddd{
	int roll();
}
class Dd implements Ddd{
	@Override
	public int roll() {
		return (int)Math.random()*6;
	}
}
public class Lamda9 {
	public static void main(String[] args) {
		Ddd dd = 
			
			() -> (int)Math.random()*6; //  문장이 하나면 {}생략

			
	int result = dd.roll();
	System.out.println(result);
		
	}

}
