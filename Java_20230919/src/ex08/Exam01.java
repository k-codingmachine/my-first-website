package ex08;

import java.util.Scanner;

// 배열의 같은 숫자 갯수 세기!

public class Exam01 {

	public static void main(String[] args) {

		String myStr1 = "java";
		String myStr2 = "java";
		
		System.out.println(myStr1 == myStr2);
		
		String myStr3 = new String("java");
		String myStr4 = new String("java");
		
		System.out.println(myStr3 == myStr4);
		
		System.out.println(myStr3.equals(myStr4));
	}
}



