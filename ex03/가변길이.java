package ex03;

public class 가변길이 {

	static int eng;
	static int kor;
	static int sum;
	
	static{
		eng = 100;
		kor = 90;
		sum = eng+kor;
		
	}
	public static void main(String[] args) {
//		가변길이 가  = new 가변길이(); 
		
		System.out.println(eng);	// 객체생성안하면 null값
		System.out.println(kor);	// 객체생성안하면 null값
		System.out.println(sum);// 객체생성안하면 null값
		
		
//		System.out.println("sum(1,2,3,4,5) : " + sum(1,2,3,4,5));
//		System.out.println("sum(1,3,5,7,9) : " + sum(1,3,5,7,9));
//		System.out.println("sum(1,2,3,4,5,6,7,8,9,10) : " + sum(1,2,3,4,5,6,7,8,9,10));
	}
	
	static int sum(int ...values) { // static을 사용하면 객체를 만들지 않고 실행할 수 있다.
		int sum = 0;
		for(int i=0; i<values.length; i++) 
			sum += values[i];
		
		return sum;
	}

}

class A{
	void func() {
		가변길이.sum(1,2,3);  // 외부에서 사용할떄는 클래스를 앞에 꼭 붙여준다.
	}
}