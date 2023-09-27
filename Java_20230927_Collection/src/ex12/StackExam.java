package ex12;

import java.util.*;
import java.util.concurrent.LinkedTransferQueue;

public class StackExam {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(10);
		stack.add(11);
		stack.add(9);
		stack.add(10);
		stack.add(15);
		
//		stack.pop();
		stack.pop();

		System.out.println("--------------------------");
		for(int i : stack)
			System.out.println(i);
	}
		

}