package ex06;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

//	void printVal(String name);
//  System.out.println(name);


public class Lamda7_1 {
	public static void main(String[] args) {
//		Consumer<String> con = (name) -> System.out.println(name);     람다식
		Consumer<String> con = new Consumer<String>() {
			@Override
			public void accept(String name) {
				System.out.println(name);
			}
		}; // 익명이너
		
		con.accept("조조");
			
		BiConsumer<String, Integer> bicon = (name, age) -> System.out.println(name +"=" + age);
		bicon.accept("조조", 30);
		
	}

}
