package ex04;

public class Student {

	
	private String name;
	private int age, kor, eng, match, sum;
	private double avg;
	
	public int sum() {
		return kor+eng+match;
	}
	public double average() {
		return (int)(sum()/3.0*100+0.5)/100.0;
//		return sum()/3.0;
	}
	
	
	public Student(String name, int age, int kor, int eng, int match) {
		this.name = name;
		this.age = age;
		this.kor = kor;
		this.eng = eng;
		this.match = match;
		this.sum = sum();
		this.avg = average();
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", kor=" + kor + ", eng=" + eng + ", match=" + match
				+ ", sum=" + sum + ", avg=" + avg + "]";
	}
	

	
	
}
