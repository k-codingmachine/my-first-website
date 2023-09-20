package ex04;

public class Tv {

	String color;
	boolean power;
	int channel;  // 맴버변수
	
	//생성자의 역할 : 멤버변수 초기화 이용될수 있다.
	Tv(){   
		System.out.println("기본생성자");
		this.channel = 11; 
		this.color = "white";
		this.power = false;
	}
	Tv(int channel){  
		this.channel = channel;
		this.color = "white";
		this.power = false;
	}
	Tv(String color){  
		this.color = color;
		this.channel = 11;
		this.power = false;
	}
	
	Tv(String color, boolean power, int channel){   
		this.color = color;
		this.power = power;
		this.channel = channel; 
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
