package ex02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class collectExam2 {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("apple", "banana", "cherry", "dete", "elderberry");
		
		List<String> list = words.stream()
			.filter(s-> s.length()>5)
			.collect(Collectors.toList());
		
		System.out.println(list);
		
		
	}

}
