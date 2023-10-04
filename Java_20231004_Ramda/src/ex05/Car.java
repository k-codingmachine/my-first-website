package ex05;

public class Car {
	private Tire tire1 = new Tire();

	private Tire tire2 = new Tire(){ // 상속받아서 재정의 하는 느낌
		public void roll() {
			System.out.println("익명 타이어 굴러감..");
		};
	}; // Tire 파일 10번째줄 ~ 15번줄 내용과 동일
	
	
	
	
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	public void run2() {
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 갹체2 타이어 굴러감..");
			}
		};
		tire.roll();
	}


	public void run3(Tire tire) {
		tire.roll();
	}
}