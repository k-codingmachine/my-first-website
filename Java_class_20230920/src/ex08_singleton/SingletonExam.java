package ex08_singleton;

import java.sql.DriverManager;

public class SingletonExam {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		
		System.out.println(s.apple);
		
		
	}
	
	
	
	
}
