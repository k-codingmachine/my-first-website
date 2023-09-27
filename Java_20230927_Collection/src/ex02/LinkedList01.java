package ex02;

import java.util.*;

public class LinkedList01 {

	public static void main(String[] args) {

		List<String> list = new LinkedList<String>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		System.out.println("----------------------------");
		
		for(String s : list)
			System.out.println(s);
		
	
		System.out.println("----------------------------");
		list.remove(0);
		for(String s : list)
			System.out.println(s);
		
		System.out.println("----------------------------");
		list.add(1, "Toy");
		for(String s : list)
			System.out.println(s);
		
		
	
	}
	

}
