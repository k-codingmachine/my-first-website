package ex03;

class Counter2{
	int count = 0;
	
	public void increment() {
		synchronized(this) {
		count++;
		}
	}
	public void decrement() {
		synchronized(this) {
		count--;
		}
	}
	public int getCount() {return count;}
}

public class CurrentThreadName5 {

	public static Counter2 cnt = new Counter2();
	public static void main(String[] args) throws InterruptedException {
		

		Runnable task1 = () -> {
			for(int i =0; i<1000; i++) {
				cnt.increment();
				}
		};
		
		Runnable task2 = () -> {
			for(int i =0; i<1000; i++) {
				cnt.decrement();
				}
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.start();
		t2.start();

		t1.join();
		t2.join();
		
		System.out.println("count : " + cnt.getCount());
		
		
		
		
		
		
	}

}
