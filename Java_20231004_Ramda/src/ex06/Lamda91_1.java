package ex06;

import java.util.function.Function;

@FunctionalInterface
interface Eeee{
	int sumArr(int[] arr);
}

public class Lamda91_1 {
	public static void main(String[] args) {
//		Eee ee = (int[] arr) -> {
//				int sum=0;
//				for(int i : arr)
//					sum +=i;
//				return sum;
//		};		
//	int[] arr = {1,2,3,4,5};
//	int result = ee.sumArr(arr);
//	System.out.println(result);
		
		Function<Integer[], Integer> f1 =  
				(arr) ->{
				int sum=0;
				for(int i : arr)
				sum +=i;
				return sum;							
	};
	Integer[] arr = {1,2,3,4,5};
	int result = f1.apply(arr);
	System.out.println(result);
	
	}
}