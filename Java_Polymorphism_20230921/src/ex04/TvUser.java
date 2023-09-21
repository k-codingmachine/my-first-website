package ex04;

public class TvUser {

	public static void main(String[] args) {
		
		Tv tv = new LgTvSub();
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
	}

}
