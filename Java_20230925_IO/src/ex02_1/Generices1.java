package ex02_1;

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

class Box{ 
	private Object obj;
	
	void setObj(Object obj) {
		this.obj = obj;
	}
	
	Object getObj() {
		return obj;
	}
	
}



public class Generices1 {
	public static void main(String[] args) {
		
		Box aBox = new Box(); // 사과
		Box oBox = new Box(); // 오렌지
		
		aBox.setObj(new Apple());
		oBox.setObj(new Orange());
		
		Object o1 = aBox.getObj();
		Apple a1 = (Apple)aBox.getObj(); // 형변환
	}
}
