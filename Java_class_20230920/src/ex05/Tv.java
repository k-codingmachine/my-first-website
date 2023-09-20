package ex05;

public class Tv {

	String color;
	boolean power;
	int channel;  // 맴버변수
	
	//생성자의 역할 : 멤버변수 초기화 이용될수 있다.
	Tv(){   
		this("white",11,false);  // 생성자호출 (this는 생성자에서 반드시 맨윗줄에 위치해야한다)
		System.out.println("기본생성자");
		
	}
	Tv(int channel){  
		this("white",channel,false);

	}
	Tv(String color){  
		this(color,11,false);
	}
	
	Tv(String color, int channel ,boolean power){   
		this.color = color;
		this.power = power;
		this.channel = channel;   //this의 다른생성자 호출하는 예시(모든 생성자들이 여기를 거쳐서 위로 들어감)
	}
	
	void power() {
		power = !power;     
	}
	void channelUP() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	

}
