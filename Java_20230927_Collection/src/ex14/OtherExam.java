package ex14;

import java.util.*;
import java.util.concurrent.LinkedTransferQueue;

public class OtherExam {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
//		List<Integer> list = {10,20,30,40,50}; (x)
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		int[] intNum = new int[5];
		int[] intNum2 = {10,20,30,40,50};
		
		List<Integer> list2 = Arrays.asList(10,20,30,40,50);
		for(int i : list2)
			System.out.print(i + " ");
		System.out.println();
 
		List<String> list3 = Arrays.asList("Toy", "Box", "Robot");
		for(String i : list3)
			System.out.print(i + " ");
		
		System.out.println();
		// list3.add("Box"); 사용불가 Arrays.asList 추가안됨
//		list3.add("Box");
//		for(String i : list3)
//			System.out.print(i + "");
		
		List<String> list4 = Arrays.asList("Toy", "Box", "Robot");
		
		List<String> list5 = new ArrayList<String>(list4);
//		List<String> list5 = new ArrayList(Arrays.asList("Toy", "Box", "Robot"));
		list5.add("Box");
		list5.add("Robot");
		
		for(String s : list5)
			System.out.print(s + " ");
	
	}
		

}