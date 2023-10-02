package ex03;

import java.io.File;
import java.io.IOException;

public class ExceptionEx02 {

	
	public static void main(String[] args) throws IOException { // 직접처리하지않고 자신을 호출한곳으로 떠넘긴다!

		File file = new File("member.txt");
		
		if(!file.exists()) {
			file.createNewFile();
		}
	}

}
