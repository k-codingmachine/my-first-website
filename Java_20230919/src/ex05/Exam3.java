package ex05;


// 로또!!!!!

public class Exam3 {

	public static void main(String[] args) {

		int[]numA = new int[45];
		
		for(int i =0; i<numA.length; i++)
			numA[i] = i+1;
		
	
		for(int i =0; i<1000; i++) {
			int n = (int)(Math.random()*45); 
			int tmp = numA[0];
			numA[0] = numA[n];
			numA[n] = tmp;
		}
		
		System.out.println("\n이번주 번호 :");
		for(int i=0; i<6; i++)
			System.out.print(numA[i]+" ");
		
	}
}