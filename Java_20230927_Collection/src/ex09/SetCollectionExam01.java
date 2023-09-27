package ex09;

import java.util.*;

import lombok.AllArgsConstructor;

/*
 *  이름과 나이가 같으면 동일 인스턴스로 판단이 되도록 hashcode와 equals를 재정의 하세요.
 */
class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return (name.hashCode() + age)/2;
	}
	@Override
	public boolean equals(Object obj) {
		String _name = ((Person)obj).name;
		int _age = ((Person)obj).age;
		return
		name.equals(_name) && age == _age ? true : false;
	}
	@Override
	public String toString() {
		return name + "(" + age + ")";
	}
	
	
}


public class SetCollectionExam01 {

	public static void main(String[] args) {
		
		Set<Person> set = new HashSet<Person>();
		set.add(new Person("조조", 20));
		set.add(new Person("조조", 30));
		set.add(new Person("조조", 20));
		set.add(new Person("유비", 27));
		set.add(new Person("유비", 27));
		
		for(Person p : set)
			System.out.println(p);
	
	}
}