package ex03;

import java.util.Scanner;

public class star {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("길이 : ");
		
		int len = s.nextInt();
		
		for(int i =0; i<len; i++) {
			
			// 공백
			for(int j = 0; j<i; j++) {
				System.out.print(" ");
			}
			
			//*
			for(int j=0; j<(2*len)-1-(i*2); j++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
	}

}
