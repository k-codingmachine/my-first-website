package ex03;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		// 3정수 중 최대값, 최소값 출력 중첩if 이용
		
		int n1 = 100, n2=30, n3=20;
		int max, min;
		max = min = 0;
		
		if(n1>=n2) {
			if(n1>n3) {
				max=n1;
			}else {
				max=n3;
			}
		}else {
			if(n2>n3) {
				max=n2;
			}else {
				max=n3;
			}
		}
		
			
		System.out.println("max : " + max + "\nmin : " + min);
		
	
	}

}
