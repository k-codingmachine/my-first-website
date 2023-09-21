package ex09_FuctionalInterface;

public class ImpleSampleInterface 
implements SampleInterface{

	@Override
	public void sample() {
		System.out.println("이넘은 무조건 구현");
	}

	public void sample2() {
		System.out.println("니가 선택해서 구현하든 말든");
		
	}
}
