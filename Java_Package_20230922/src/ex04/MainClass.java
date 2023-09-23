package ex04;

public class MainClass {
	public static void main(String[] args) {
	
		Student[] students = new Student[3];
		int total = 0;
		double average = 0;
		students[0] = new Student("백승훈", 100, 90, 100, 90);
		students[1] = new Student("김용우", 10, 30, 50, 40);
		students[2] = new Student("김영규", 70, 50, 90, 50);
		
		
		for(int i=0; i<students.length; i++) {
			System.out.println(students[i]);
			total += students[i].sum();
		}
		average = (double)total/students.length;
		
		System.out.printf("전체 총점 : %d, 전체 평균 : %.2f", total, average);
	
	}
}
