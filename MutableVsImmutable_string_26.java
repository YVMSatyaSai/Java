public class MutableVsImmutable_string_26 {
	public static void main(String[] args) 
	{
		String name="satya";
		name=name+" Sai";
		System.out.println("hello "+name);
		
		String s1="Satya";
		String s2="Satya";
		
		System.out.println(s1==s2);	
		
	}
}