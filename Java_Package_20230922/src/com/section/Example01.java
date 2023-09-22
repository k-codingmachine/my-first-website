package com.section;

public class Example01 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Programing");
		System.out.println(sb);
		
		sb.insert(6, "JAVA ");
		System.out.println(sb);
		
		sb.replace(1, 4, "Good");
		System.out.println(sb);
		
		sb.delete(1, 5);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}

}
