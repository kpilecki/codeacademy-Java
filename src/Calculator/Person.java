package Calculator;

public class Person {
	private String name = "";
	private int age = 0;
	
	public Person() {}
	public Person(String name , int age) throws IllegalArgumentException {
		if(name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		} else {
			this.name = name;
		}
		
		if(age >= 0) {
			this.age = age;
		} else {
			throw new IllegalArgumentException("age cannot be negative");
		}
	}
	public Person(String name) throws IllegalArgumentException {
		if(name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		} else {
			this.name = name;
		}
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws IllegalArgumentException {
		if(age >= 0) {
			this.age = age;
		} else {
			throw new IllegalArgumentException("age cannot be negative");
		}
	}
	public void sayHi() {
		System.out.println("Hi my name is: " + name);
	}
	public String toString() {
		return "Name: " + name + " Age:" + age;
	}
}
