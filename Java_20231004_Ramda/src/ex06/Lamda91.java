package ex06;

@FunctionalInterface
interface Eee{
	int sumArr(int[] arr);
}

public class Lamda91 {
	public static void main(String[] args) {
		Eee ee = (int[] arr) -> {
				int sum=0;
				for(int i : arr)
					sum +=i;
				return sum;
		};	
	int[] arr = {1,2,3,4,5};
	int result = ee.sumArr(arr);
	System.out.println(result);
		
	}

}
