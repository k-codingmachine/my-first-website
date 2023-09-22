package ex04;

import java.util.Scanner;

public class student1 {
	String name;
	int age;
	static int kor = 70;
	static int eng = 80;
	static int match = 90;
	int sum;
	int avg = sum/3;
	
	private void name(String n) {
		this.name = n;
}
	private int age() {
		return age = 20;
}
	private int kor() {
		return kor;
}
	private int eng() {
		return eng;
}
	private int match() {
		return match;
}
	private int avg() {
		return avg;
}
	void sum(int kor, int eng, int match) {
		sum = kor+eng+match;
	}
	void avg(int kor, int eng, int match) {
		avg = (kor+eng+match)/3;
	}
	public static void main(String[] args) {
		
		student1 stu = new student1();
		stu.sum(kor, eng, match);
		stu.avg(kor, eng, match);
		System.out.println("총점 :"+ stu.sum);
		System.out.println("평균 :"+ stu.avg);
		
		System.out.println("========================================");
		
		student1[] stu1 = new student1[2];
		System.out.println(">> 학생 이름 : ");
		Scanner sc = new Scanner(System.in);
		sc.next();
		
		System.out.println(">> 국어 점수 : ");
		int x = sc.nextInt();
		System.out.println(">> 수학 점수 : ");
		int y = sc.nextInt();
		System.out.println(">> 영어 점수 : ");
		int z = sc.nextInt();
		
		int sum = x + y + z;
		int avg = (x + y + z)/3;
		
		System.out.println("총합 :" + sum );
		System.out.println("평균 :" + avg );
			
		
		
	}
	
	
	
	

}
