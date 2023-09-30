package ex03;

// 1차원 배열
public class Exam01 {

	public static void main(String[] args) {

		
		int[] myArr = new int[5];
		String[] myStr = new String[3];
		
		int[] myArr2 = {10,20,30,40,50}; 
//		int[] myArr2 = new int[]{10,20,30,40,50}; 위 아래값 동일(주로 위처럼 사용)
		String[] myStr2 = {"kor","eng","math"};
		String[] myStr3 = new String[]{"kor","eng","math"};
		
		
	    for(int i =0;i<myArr.length; i++) {
//		int num = (int)(Math.random()*100)+1;  // +1처리를 하지않으면 0~99까지만 출력된다.
		myArr[i] = (int)(Math.random()*45)+1;
	    }
			for(int i=0; i<myArr.length; i++)
				System.out.println(myArr[i]);
			
			for(int i=0; i<myStr3.length; i++)
				System.out.println(myStr3[i]);
		
	
}

	
}
