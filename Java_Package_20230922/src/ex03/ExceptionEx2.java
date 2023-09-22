package ex03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx2 {

	public static void main(String[] args) {
		System.out.println("예외처리1");
		System.out.println("예외처리2");
		System.out.println("예외처리3");
		System.out.println("예외처리4");
	
		Scanner sc = new Scanner(System.in);
		System.out.println(">> 정수입력(0은 입력하지마세요)");
		
		int[] num2 = new int[5];
		try { // 문제가 될 여지가 있는 문장을 넣어준다.(문제가 생기면 바로  catch로 넘어간다.)그 사이에 뭐가 있든 무시
		int num = sc.nextInt();
		System.out.println(5/num);
		num2[10]=9;
		}catch(Exception e) { // 예외처리에 상위클래스를 넣어주면 하위클래스의 예외처리된다.
			System.out.println("예외 내용1: " +e.getMessage());
		}
		finally { 
			System.out.println("예외처리 종료!!!!");
		}
		
		System.out.println("예외처리5");
		System.out.println("예외처리6");
		System.out.println("예외처리7");
		System.out.println("예외처리8");
		System.out.println("프로그램 종료");
		
	}

}
