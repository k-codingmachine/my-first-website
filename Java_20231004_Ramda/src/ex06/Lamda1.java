package ex06;

interface Printable{
	void print(String msg);
}

class Printer implements Printable{

	@Override
	public void print(String msg) {
		System.out.println(msg);
	}
	
}
public class Lamda1 {

	public static void main(String[] args) {
		Printable prn = new Printer();
		prn.print("msg print");

	}

}
