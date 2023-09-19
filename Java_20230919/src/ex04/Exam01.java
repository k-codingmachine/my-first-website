package ex04;

import java.util.Arrays;

// 1차원 배열 - String
public class Exam01 {

	public static void main(String[] args) {

		
		//1. 렌덤을 이용해서 5명 학생 점수를 입력받는다.
		//2. 5명 점수 총점과 평균을 구한다.
		//3. 최대값, 최소값 출력
		int[] StuArr = new int[5];
		int total = 0;
		double avg = 0;
		
		
		for(int i =0;i<StuArr.length; i++)  // 입력	
		 StuArr[i] = (int)(Math.random()*100)+1; 
		
		System.out.print("정렬 데이터 : ");
		for(int i =0;i<StuArr.length; i++) { // 총점 계산
			System.out.printf(StuArr[i] + " ");
			total += StuArr[i];
			
		}
		System.out.println();
		avg = (double)total/StuArr.length; // 평균 계산
		
		System.out.println("총점 : "+ total);
		System.out.printf("평균 :%.2f\n", avg);
		System.out.println("-----------------------------------");
		 
		//최대값, 최소값 구현
		int max = StuArr[0];
		int min = StuArr[0];
		for(int i =1;i<StuArr.length; i++) {
			if( max < StuArr[i])
				max = StuArr[i];
			if(min > StuArr[i])
				min = StuArr[i];
		}
		
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);
		System.out.println("-----------------------------------");
		
		// 입력 데이터를 오름차순 정렬
		
		for(int i = 0; i<StuArr.length; i++) {
			boolean flag = false;									// 쓸데없는 연산을 줄여주기 위한 함수
			for(int j = i+1; j<StuArr.length; j++) {
				if(StuArr[i]>StuArr[j]) {
				int tmp = StuArr[i];
					StuArr[i] = StuArr[j];
					StuArr[j] = tmp;
					flag = true;
			 }
		  }
			if(!flag)break;
//		System.out.println( i+1 +"회전 : ");
//		for(int j = 0; j<StuArr.length; j++)
//			System.out.print(StuArr[j]+" ");
	   }
		
		System.out.print("정렬데이터 : ");
		for(int i = 0; i<StuArr.length; i++) {
			System.out.print(StuArr[i]+" \n");
			
		}
		
	
	
		}	
	}		
		

