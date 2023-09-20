package ex06_static;

public class CalculatorExam {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		cal.add(10, 20);
		System.out.println(cal.result);
		
		cal.minus = 123;
		
		System.out.println(cal.minus);
		
		Calculator cal2 = new Calculator();
		cal2.add(100, 200);
		System.out.println(cal2.result);
		
		System.out.println(cal2.minus);
		
		cal.sub(10, 5);
		System.out.println(cal.minus);
		
		Calculator.sub(50, 10); //객체와 클래스 모두로 접근할 수 있다.
		System.out.println(Calculator.minus);
	}

}
