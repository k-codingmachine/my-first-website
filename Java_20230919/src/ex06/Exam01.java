package ex06;


// 배열의 같은 숫자 갯수 세기!

public class Exam01 {

	public static void main(String[] args) {

		int[]numA = new int[10];
		int[]numB = new int[10];
		
		
		for(int i =0; i<numA.length; i++)
			numA[i] = (int)(Math.random()*10);
		
		for(int i =0;i<numA.length; i++)
			System.out.print(numA[i] + " ");
		System.out.println();
		System.out.println();
		
		for(int i =0;i<numA.length; i++) // 빈도수
			numB[numA[i]]++;
			
		for(int i =0;i<numA.length; i++)
			System.out.printf( "%d의 개수는 : %d\n" ,i,numB[i]);
			
		}
			
	
		
		
		
		
	}



