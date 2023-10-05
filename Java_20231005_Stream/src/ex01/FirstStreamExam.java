package ex01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FirstStreamExam {

	public static void main(String[] args) {
		int[] ar = {5,2,3,4,1};
		
		Arrays.stream(ar).sorted().forEach(i ->System.out.print(i + " ")); // sorted를 이용한 정렬
		
		IntStream stm1 = Arrays.stream(ar);
		IntStream stm2 = stm1.filter( n-> n%2 == 1);
		
		System.out.println();
		int sum = stm2.sum();
//		int sum = (int)stm2.count(); // 필터를 통과한 놈들의 개수
		System.out.println(sum);
		
		int result = Arrays.stream(ar).filter(n-> n%2 == 0).sum(); // 체인방식
		System.out.println(result);
		
		System.out.println("---------------------------------------");
		String[] names = {"Toy","BB", "Box","CCCC", "Robot","KKKKKKK","AAAA"};
		
		List<String> list = Arrays.stream(names).
				filter(s-> s.length()>3).	// 중간연산(여기선 filter)은 여러개 할수있다. 중간연산자에 올수있는 다른연산자도 가능.
				filter(s-> s.length()%2==1)
				.toList(); // 다시 리스트로 만들어준다.
		//		forEach(s->System.out.println(s)); 

		System.out.println("List : "+list);
		
		System.out.println("---------------------------------------");
		 Arrays.stream(names)
			.map(s->s.length())
			.forEach(s-> System.out.println(s));
		
		 System.out.println("---------------------------------------");
		 int sum2 = Arrays.stream(names)
		 	.mapToInt(s-> s.length())
		 	.sum();
		System.out.println(sum2);

		System.out.println("---------------------------------------");
		List<String> str = Arrays.asList("Toy","BB", "Box","CCCC", "Robot","KKKKKKK","AAAA");
		
		int sum3 = str.stream().mapToInt(s->s.length()).sum();
		System.out.println(sum3);
		
		
		
	}

}
