package ex09_inher;

public class PhoneExam01 {

	public static void main(String[] args) {
		
		Phone p = new Phone("에플폰", "V11");
		
		p.bell();
		p.sendVoice("놀자....");
		p.hangUp();
		
		SmartPhone s = new SmartPhone("삼성폰", "폴더", true);
		
		
	}

}
