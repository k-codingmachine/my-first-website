package ex03;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
	
		int numA = 100;
		int numB = 200;

			System.out.printf("before => A : %d, B : %d\n",numA,numB); //100,200
			
			// numA, numB 체인지
			
			int tmp = numA;
			numA = numB;
			numB = tmp;
			
			System.out.printf("after => A : %d, B : %d\n",numA,numB); //200,100
			
			
		
		
	}

}
