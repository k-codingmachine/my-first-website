package ex06;

@FunctionalInterface
interface Aa{
	void printVal(String name, int i);
}

public class Lamda7 {
	public static void main(String[] args) {
		Aa aa = 
			
			(name, i) -> System.out.println(name + "="+i);
			
			aa.printVal("승훈", 5);

			
	
		
	}

}
