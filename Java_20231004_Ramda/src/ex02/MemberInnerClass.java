package ex02;

// member class 를 외부에 노출시키지 않기위해서 inner class 를 사용한다.   
class Outer4{
	private int num = 0;
	
	class Member{
		void add(int n) {num +=n;}
		int get() {return num;}
	}
}


class Outer3{ // 안에 맴버를 사용하려면 바깥쪽 객체부터 생성
	private int num = 0;
	
	class Member{
		void add(int n) {num +=n;}
		int get() {return num;}
	}
}
public class MemberInnerClass {

	public static void main(String[] args) {

		Outer3 o1 = new Outer3();
		Outer3 o2 = new Outer3();
		
		Outer3.Member m1 = o1.new Member();
		Outer3.Member m2 = o1.new Member();
		
		Outer3.Member m3 = o2.new Member();
		Outer3.Member m4 = o2.new Member();
		
		m1.add(5);
		System.out.println(m1.get());
		m2.add(15);
		System.out.println(m2.get());
		
		m3.add(1);
		System.out.println(m3.get());
		m4.add(15);
		System.out.println(m4.get());
	}

}
