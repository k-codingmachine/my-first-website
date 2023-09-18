package ex03;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		
		//Java점수를 입력받아서 학점을 구하는 프로그램 구현.
		//90점이상 -> A, 80 -> B, 70 ->C, 60 ->D, F
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 >>");
		
		int Jumsu = sc.nextInt();
		
		if(Jumsu>=90) {
			System.out.println("A");
		}
		else if(Jumsu>=80) {
			System.out.println("B");
		}
		else if(Jumsu>=70 ) {
			System.out.println("C");
		}
		else if(Jumsu>=60 ) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
	}

}
