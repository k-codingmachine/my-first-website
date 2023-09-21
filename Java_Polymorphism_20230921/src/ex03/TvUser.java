package ex03;

public class TvUser {

	public static void main(String[] args) {
		
		Tv tv = new SamsungTv();
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
	}

}
