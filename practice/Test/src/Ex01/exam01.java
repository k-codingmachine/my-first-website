package Ex01;

public class exam01 {

	public static void main(String[] args) {
		
		int[]myArr = new int[5];
		
		for(int i=0; i<myArr.length; i++)
			myArr[i]= (int)(Math.random()*100)+1;
		
		for(int i=0; i<myArr.length; i++)
			System.out.println(myArr[i]);

	}

}
