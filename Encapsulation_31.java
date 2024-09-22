class Human
{
	private int age;
	private String name;

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class Encapsulation_31 {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();

		obj.setAge(25);
		obj.setName("Satya");

		System.out.println(obj.getName()+" : "+obj.getAge());
	
	}
}
