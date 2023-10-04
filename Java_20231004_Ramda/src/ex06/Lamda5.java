package ex06;
// 익명이너
interface Cal2{
	int max(int num1, int num2);
}


public class Lamda5 {
	public static void main(String[] args) {

		Cal2 cal = new Cal2() {
			@Override
			public int max(int num1, int num2) {
				return num1>num2 ? num1:num2;
			}	
		};
		
		int result = cal.max(5, 10);
		System.out.println(result);
	}

}
