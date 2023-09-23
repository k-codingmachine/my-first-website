package ex03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx01 {

	public static void main(String[] args) {
		System.out.println("예외처리1");
		System.out.println("예외처리2");
		System.out.println("예외처리3");
		System.out.println("예외처리4");

		Scanner sc = new Scanner(System.in);
		System.out.println(">> 정수입력(0은 입력하지마세요)");
		
		try { // 문제가 될 여지가 있는 문장을 넣어준다.
		int num = sc.nextInt();
		System.out.println(5/num);
		}catch(ArithmeticException e) { //(java.lang.ArithmeticException)파란색으로 뜨는 오류 메세지를 넣어준다.
			System.out.println("예외 내용1: " +e.getMessage());// 문제가 있어야만 catch 가 발동된다.
		}catch (InputMismatchException e) { // 예외내용을 적고 import 해준다.
			System.out.println("예외 내용2: " +e.getMessage());
		}
		finally { // finally 는 옵션 반드시필요 x (문제가 없어도 반드시 거쳐가는 코드)
			System.out.println("예외처리 종료!!!!");
		}
		
		System.out.println("예외처리5");
		System.out.println("예외처리6");
		System.out.println("예외처리7");
		System.out.println("예외처리8");
		System.out.println("프로그램 종료");
		
	}

}
