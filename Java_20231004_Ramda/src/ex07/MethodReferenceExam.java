package ex07;

public class MethodReferenceExam {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.action(new Calcuable() {
			@Override
			public double calc(double x, double y) {
				return x+y;
			}
		}); // 익명
		
		
		person.action((x, y)-> x+y); // 위의 문장의 람다식
		
		person.action(new Calcuable() {
			@Override
			public double calc(double x, double y) {
				return x+y;
			}
		});
		
		System.out.println("----------------------------");
		person.action(Double::sum);
		
		System.out.println("----------------------------");
		person.action(new Calcuable() {
			
			@Override
			public double calc(double x, double y) {
				return Computer.staticMethod(x, y);
			}
		});
		System.out.println("----------------------------");
		person.action(
				(x, y)-> Computer.staticMethod(x, y)
				);
		System.out.println("----------------------------");
		person.action(Computer::staticMethod);
		
		Computer com = new Computer();
		person.action(new Calcuable() {
			@Override
			public double calc(double x, double y) {
				return com.instanceMethod(x, y);
			}
		});
		System.out.println("=====================================");
		person.action( (x, y) ->com.instanceMethod(x, y)
				);
		System.out.println("-----------------------------------");
		person.action(com::instanceMethod);
			
		
	
		
	}

}
