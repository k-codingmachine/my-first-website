package ex06_interface;

public class MainClass {

	public static void main(String[] args) {
		Printable prn = new LPrinter(); // override에 의해 Printer 클래스에 접근가능
		String msg = "hello world";
		prn.print(msg);
		
		prn = new SPrinter();
		prn.print(msg);
		
		
		CSPrint p = new SPrinter();
		p.cprint(msg);
		
		p.print(msg);
		
		Printable p2 = new SPrinter();
		
		
		
		
		
		
		
	}

}
