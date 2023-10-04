package ex04;

import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;

interface Printable{ // interface는 객체생성 불가
	void print();
}

class Papers{
	private String con;
	
	public Papers(String con) {this.con = con;}
	
	public Printable getPrinter() {
		
		return new Printable() { // 익명 클래스
			@Override
			public void print() {
				System.out.println(con);
			}
		};
	}
	
	
}
public class UseAnnynomousInnerClass {

	public static void main(String[] args) {
		Papers p = new Papers("프린터로 메시지 출력 합니다.");
		
		Printable prn = p.getPrinter();
		prn.print();
	}

}
