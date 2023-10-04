package ex05;

public class Tire {
	public void roll() {
		System.out.println("일반 타이어가 굴러감..");
	}

}

//class SubTire extends Tire{
//	@Override
//	public void roll() {
//	System.out.println("익명타이어 굴러감");
//	}
//}

class Sub extends Tire{
	@Override
	public void roll() {
	System.out.println("익명 객체3이 굴러감(하위클래스 객체)");
	}
}