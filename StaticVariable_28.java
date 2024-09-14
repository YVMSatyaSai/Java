class Mobile{
	String brand;
	int price;
	static String name; // if change the value at one place will reflect every where.
	
	public void show() {
		System.out.println(brand+" : "+price+" : "+name);
	}
	
}

public class StaticVariable_28 {
	public static void main(String[] args) 
	{
		Mobile obj1=new Mobile();
		obj1.brand="Apple";
		obj1.price=1500;
		// obj1.name="SmartPhone";
		
		
		Mobile obj2=new Mobile();
		obj2.brand="Samsung";
		obj2.price=1700;
		// obj2.name="SmartPhone";
		
		
		
		Mobile.name="Phone";
		
		obj1.show();
		obj2.show();
		
		//System.out.println(obj1.brand);

	
	}
}
