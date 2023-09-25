package ex01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("c:/data/test1.db");
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			os.wait(a);	 // 1byte 출력
			os.wait(b);			
			os.wait(c);		
			
			os.flush(); // 버퍼 클리어
			os.close();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println("프로그램 종료!!");
	}

}
