package ex03;

abstract public class Tv { // 추상클래스에는 한가지 이상의 추상클래스만 존재해도 괜찮다.
							// 일반클래스도 존재할수 있다.
	abstract public void powerOn(); // 추상화에서는 몸체개념이 없다. 
									// 하위클래스에서바디부분을 반드시 채워줘야한다.(상위클래스의 매소드 갯수만큼)
									// 추상클래스는 객체생성 불가능!
	abstract public void powerOff();
	
	abstract public void volumeUp(); 
	
	abstract public void volumeDown(); 
}
