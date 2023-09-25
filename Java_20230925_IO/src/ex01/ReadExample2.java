package ex01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws IOException {
		
		InputStream is = new FileInputStream("c:data/test2.db");
		
		byte[] data = new byte[100];
		
		while(true) {
			int num = is.read(data); // data가 몇개의 인덱스를 차지하고있는지 나타내줌
			System.out.println("num :" + num);
			if(num == -1) break;
			for(int i=0; i<num; i++) 
				System.out.println(data[i]);
		}
		is.close();
	}
	

}
