package ex09_inher02;

public class BabyCat extends ParentCat{
	
	public String color;
	
	public BabyCat(String breed, String color) {
		super(breed);
		this.color = color;
	}
	void meow() {
		System.out.println("야용하고 울다.");
	}
}
