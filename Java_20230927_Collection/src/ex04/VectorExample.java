package ex04;

import java.util.*;

public class VectorExample {

	public static void main(String[] args) {

		List<String> list = new Vector<String>();
		
		list.add("페르시안");
		list.add(null);
		list.add(1, "샴");
		
		for(String s : list)
		System.out.println(s);
		
		
		
	
	}
	

}
