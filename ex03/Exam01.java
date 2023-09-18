package ex03;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
	
//		int num1 = 100;
//		
//		short n1 = 10;
//		
//		n1 = (short)num1;   // n1(작은놈)을 num1(큰놈에 담는거 불가능)  강제로 넣은표기
//		
//		System.out.printf("num1:%d, n1:%d\n", num1,n1);
		
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt(); // 버퍼에 앤터가 남아있다.(int형의 경우)
		
		String str= sc.nextLine();
		
		System.out.println(number);
		System.out.println(str);
		
		
	}

}
