package ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class ChracterConverterExample {

	public static void main(String[] args) throws IOException {
		String str = "아시안게임 지유찬, 자유형 50ｍ 21초84 대회신기록…금메달 도전";
		write(str);
		String data = read();
		System.out.println(data);
		

	}
	
	
	static void write(String str) throws IOException{
		OutputStream os = new FileOutputStream("c:/data/test2.txt"); // 바이트단위로 흘러감
		
		Writer writer = new OutputStreamWriter(os, "utf-8"); // 바이트를 문자단위로 변경
		
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	static String read() throws IOException{
		InputStream is = new FileInputStream("c:/data/test2.txt"); // 바이트 단위로 흘러감
		Reader reader = new InputStreamReader(is, "utf-8"); // 문자로 읽을수있게해줌
		
		char[] data = new char[100];
		int num = reader.read(data);
		reader.close();
		
		String str = new String (data, 0 ,num);
		
		return str;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
