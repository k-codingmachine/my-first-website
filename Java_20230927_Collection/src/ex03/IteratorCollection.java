package ex03;

import java.util.*;

public class IteratorCollection {

	public static void main(String[] args) {

		List<String> list = new LinkedList<String>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
		Iterator<String> itr = list.iterator(); // 반복자 획득
		
		String str;
		while(itr.hasNext()) {
			str = itr.next();
			if(str.equals("Box"))
				itr.remove(); // Box 두개 모두 삭제
			System.out.println(str);
		}
		System.out.println("-------------------------------");
		itr = list.iterator(); // 다시 반복하려고 사용 이 문장이 없으면 값 출력x -> 이미 값을 다 출력했기때문
		while(itr.hasNext()) {
			str = itr.next();
			System.out.println(str);
		}
		
	
	}
	

}
