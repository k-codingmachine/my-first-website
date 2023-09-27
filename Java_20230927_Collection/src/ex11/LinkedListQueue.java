package ex11;

import java.util.*;
import java.util.concurrent.LinkedTransferQueue;

public class LinkedListQueue {

	public static void main(String[] args) {
//		Queue<String> queue = new LinkedList<String>();
//		Queue<String> queue = new ArrayDeque<String>();
		Queue<String> queue = new LinkedTransferQueue<String>();
		
		
		queue.add("Toy"); // add, offer 모두 사용해도 무방하다.
		queue.offer("Box");
		queue.offer("Robot");
		queue.offer("Toy");
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println("==============================");
		for(String s : queue)
			System.out.println(s);
		
		System.out.println("==============================");
		for(String s : queue)
			System.out.println(s);
		System.out.println("===============================");
		
		System.out.println(queue.peek());
		
		System.out.println("==============================");
		for(String s : queue)
			System.out.println(s);
		
		
	}
		

}