package ex02;

class Apple{
	public String toString() {
		return "I am an apple";
	}
}


class Orange{
	public String toString() {
		return "I am an orange";
	}
}

class AppleBox{ // 사과담는 박스
	private Apple ap;
	
	void setApple(Apple ap) {
		this.ap = ap;
	}
	
	Apple getApple() {
		return ap;
	}
	
}


class OrangeBox{ 
	private Orange op;
	
	void setOrange(Orange op) {
		this.op = op;
	}
	
	Orange getOrange() {
		return op;
	}
	
}
public class Generices1 {
	public static void main(String[] args) {
		AppleBox abox = new AppleBox();
		OrangeBox obox = new OrangeBox();
		
		abox.setApple(new Apple());  // 괄호안의 값 : 인자 , 애플타입만 넣어줄수있다.
		obox.setOrange(new Orange());
		
		Apple a = abox.getApple();
		Orange o = obox.getOrange();
		System.out.println(a);
		System.out.println(o);
	}
}
