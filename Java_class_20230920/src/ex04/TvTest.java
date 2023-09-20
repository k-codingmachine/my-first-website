package ex04;

public class TvTest {

	public static void main(String[] args) {

	
		Tv tv = new Tv();
		Tv tv2 = new Tv("Black");
		Tv tv3 = new Tv(10);
		
		System.out.println(tv.channel);
		
		Tv tv4 = new Tv("black", false, 7);
		
		
	}

}
