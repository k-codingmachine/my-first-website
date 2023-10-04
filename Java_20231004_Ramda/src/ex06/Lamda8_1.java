package ex06;

import java.util.function.BiFunction;
import java.util.function.Function;

//	int square(int x);

// int add(int x, int y)
// int sub(int x, int y)


public class Lamda8_1 {
	public static void main(String[] args) {
		
		
		Function<Integer, Integer> f1 = x -> x*x;
		System.out.println(f1.apply(5));
		
		System.out.println("-----------------------------");
		BiFunction<Integer, Integer, Double> bif1 = (x,y) -> (x+y)*2.0; // <>의 들어있는 마지막 함수가 단위를 결정
		System.out.println(bif1.apply(10, 10));
		
		System.out.println("-----------------------------");
		BiFunction<Integer, Integer, Integer> bif2 = (x,y) -> x-y;
		System.out.println(bif2.apply(10, 10));
			
			
			
			
			

			
	
		
	}

}
