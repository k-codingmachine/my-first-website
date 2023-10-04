package ex06;
//람다식(인터페이스에 추상메소드가 한개만 존재해야한다.)
@FunctionalInterface // 추상메소드가 한개만 존재함을 의미(두개 들어가면 뻑난다.)
interface Cal3{
	int max(int num1, int num2);

}


public class Lamda6 {
	public static void main(String[] args) {
		Cal3 cal = 
			
			(num1, num2) -> num1>num2 ? num1: num2;
//		{return num1>num2 ? num1: num2;}; {}가 없으면 return 뺴준다. 
			
	
		
		int result = cal.max(5, 10);
		System.out.println(result);
	}

}
