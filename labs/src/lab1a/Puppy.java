package lab1a;

public class Puppy {
	private String name;
	private int age;
	
	public Puppy() {
		name = "Name not given yet";
		age = 0;
	}
	
	public Puppy(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	//created a getter for age since it is a private variable
	//would not be able to retrieve it outside the class
	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		Puppy myPuppy = new Puppy("Fido", 2);
		System.out.println("Puppy name: " + myPuppy.getName());
		System.out.println("Puppy age: " + myPuppy.getAge());
	}
}
