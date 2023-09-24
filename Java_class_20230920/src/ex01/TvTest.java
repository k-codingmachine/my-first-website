package ex01;

public class TvTest {

	public static void main(String[] args) {

		Tv tv = new Tv(); // 객체생성, 생성자호출
		//객체가 생성되기 위해서는 반드시 생성자를 통해서
		//생성된다....
		//생성자는 오버로딩이 가능
	
		Tv tv2 = new Tv(10);
		
		Tv tv3 = new Tv("kor",10);
		
	}

}
