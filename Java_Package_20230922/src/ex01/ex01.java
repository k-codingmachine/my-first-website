package ex01;

public class ex01 {

	public static void main(String[] args) {
		
		Object obj = 10; // Object obj = new Integer(10); -> object는 알아서 객체로 포장을해준다.
		

		
		Person p1 = new Person("김용우", 20);
		Person p2 = new Person("김용우", 20);
		
		System.out.println("----------------------------------");
		System.out.println(p1.equals(p2));

		
		
		
//		Integer intJ = null; // integer은 객체이기때문에 null값을 집어넣을수 있다.
		
//		int ii = null;(x)   int형에 null값 넣을수 없다.
//		int iii = 0;(o)
		
		
		
	}
	
}	

// @Data  프로젝트 생성할때마다 properties에서 lombok 추가해주기!

class Person{
	String name;
	int age;
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// System.out.println(p1.equals(p2));  p1.name == p2.name
	// Person p2 = new Person("김용우", 20);
	// Object obj = p2;
		@Override
		public boolean equals(Object obj) {
			Person p2 = (Person)obj; // 다운사이징 (p2의 name 과 age를 사용하기 위해)
			
			return this.name.equals(p2.name) && this.age == p2.age;
		}
//	//setter(name)
//	void setName(String name) {
//		this.name = name;
//	}
//	//setter(age)
//	void setAge(int age) {
//		this.age = age;
//	}
//	
//	//getter
//	String getName() {
//		return name;
//	}
//	//getter
//	int getAge() {
//		return age;
//	}
	

//	@Override
//	public String toString() {
//		return "[성명 : " + name + " 나이 : "+age+"]";
//	}
//	
	
	

}
