package ex06_interface;

public class LPrinter implements Printable{

	@Override
	public void print(String msg) {
		System.out.print("LG프린터 흑백 출력 : ");
		System.out.println(msg);
	}

}
