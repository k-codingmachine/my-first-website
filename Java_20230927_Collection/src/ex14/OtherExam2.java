package ex14;

import java.util.*;
import java.util.concurrent.LinkedTransferQueue;

public class OtherExam2 {

	public static void main(String[] args) {

		int[] ar = {1,7,3,7,8,9,10,2,4};
		
		for(int i : ar)
			System.out.print(i + " ");
		System.out.println();
		System.out.println();
		
		Arrays.sort(ar);
		for(int i : ar)
			System.out.print(i + " ");
		
		System.out.println();
		System.out.println();
		String[] str = {"Box", "Toy", "toy","Robot", "box", "robot"};
		Arrays.sort(str);
		for(String s : str)
			System.out.print(s + " ");
	}
		

}