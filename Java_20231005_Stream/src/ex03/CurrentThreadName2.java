package ex03;

public class CurrentThreadName2 {

	public static void main(String[] args) {

		Runnable task = () -> {
			int n1 = 10;
			int n2 = 20;
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + (n1+n2));
		};
		
		Thread t = new Thread(task, "Mythread");
		t.start();
		
		System.out.println("end : " + Thread.currentThread().getName());
		
		
		
		
		
		
	}

}
