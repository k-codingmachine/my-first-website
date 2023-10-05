package ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceExam {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		Integer sum = numbers.stream()
			.reduce(0, (a,b)-> a+b);
		
		System.out.println("sum : " + sum);
		System.out.println("-----------------------------");
		List<String> words = Arrays.asList("apple", "banana", "cherry","dete", "elderberry");
		
		Integer totallength = words.stream()
			.map(s->s.length())
			.reduce(0, (a,b)->a+b);
		
		System.out.println(totallength);
		System.out.println("-----------------------------");
		
		List<Integer> nums = new ArrayList<Integer>();
		
		for(int i =0; i<10; i++) {
			nums.add((int)(Math.random()*100));
		}
		for(Integer i : nums)
			System.out.print(i + " ");
		System.out.println();
		Integer max = nums.stream()
			.reduce(Integer.MIN_VALUE, (a,b)->Integer.max(a, b)); // Integer.MIN_VALUE integer 값에서의 최소값 -2147483648
		
		System.out.println("max : " + max);
		System.out.println("-----------------------------");

		List<String> word = Arrays.asList("Hello", " ", "World", "!");
		
		String combind = word.stream().reduce("",(a,b)-> a+b);
		System.out.println(combind);
		
		
	
	}

}
