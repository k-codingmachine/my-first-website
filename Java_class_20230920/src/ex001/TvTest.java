package ex001;

public class TvTest {

	public static void main(String[] args) {

		Tv tv = new Tv();
		
		tv.channel = 7;
		tv.channelDown();
		
		System.out.println(tv.channel); // 6
		
		Tv tv2 = new Tv();
		
		System.out.println(tv2.channel); // 0
		
		Tv tv3;
		tv3 = tv;
		System.out.println(tv3.channel ); // 6
		
		tv3.channel = 100;
		
		System.out.println(tv.channel); // 100
		System.out.println(tv3.channel); // 100
	}

}
