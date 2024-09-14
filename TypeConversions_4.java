public class TypeConversions_4 {

	public static void main(String[] args) {
		byte b=127;
		int a=b;
		System.out.println(b);
		System.out.println(a);
		
		int a1=257;
		byte b1=(byte)a1;
		System.out.println(b1);

		float f=5.6f;
		int a3=(int)f;
		System.out.println(a3);
		
		int a2=2567;
		byte b2=(byte)a2;
		System.out.println(b2);
		
		
		byte a5=10;
		byte b5=20;
		int result = a5*b5;
		System.out.println(result);

		int a6=10;
		int b6=20;
		byte result1 = (byte) (a6*b6);
		System.out.println(result1);
	
	}

}
