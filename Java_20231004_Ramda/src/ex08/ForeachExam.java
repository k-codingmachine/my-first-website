package ex08;

import java.util.Arrays;
import java.util.List;

public class ForeachExam {

	public static void main(String[] args) {
		
		List<String> lists = Arrays.asList("Box", "Toy", "Robot", "Toy", "Box");

		
		for(String list : lists)
			System.out.println(list);
		System.out.println("-----------------------------------------");
		lists.forEach(s-> System.out.println(s));

		System.out.println("-----------------------------------------");
		lists.forEach(System.out::println);
	}

}
