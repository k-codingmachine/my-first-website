package ex06_interface;

public class SPrinter implements CSPrint{
	//Override : 상위클래스에 있는걸 재정의 
	@Override  // 어노테이션 (밑에 항목이 상위클래스에 있음을 시사한다.)
	public void print(String msg) {
		System.out.print("삼성프린터 흑백 출력 : ");
		System.out.println(msg);
	}

	@Override
	public void cprint(String msg) {
		System.out.print("삼성프린터 칼라 출력 : ");
		System.out.println(msg);
	}
	
}
