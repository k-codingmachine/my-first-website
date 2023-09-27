package ex05;

import java.util.*;

public class SetCollection01 {

	public static void main(String[] args) {

//		List<String> list = new LinkedList<String>();
		Set<String> list = new HashSet<String>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
		for(String s : list)
			System.out.println(s);
		System.out.println("----------------------------------------------");
		
		Iterator<String> itr = list.iterator(); 
		
		String str;
		while(itr.hasNext()) {
			str = itr.next();
			if(str.equals("Box"))
				itr.remove(); 
			System.out.println(str);
		}
		System.out.println("-------------------------------");
		itr = list.iterator(); 
		while(itr.hasNext()) {
			str = itr.next();
			System.out.println(str);
		}
		
	
	}
	

}
