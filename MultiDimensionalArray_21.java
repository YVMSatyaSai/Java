public class MultiDimensionalArray_21 {
	public static void main(String[] args) {
		int nums[][]=new int [3][4];
		//inr random=0;
		//int random=(int)Math.random()*100;
		
		for(int i=0;i<3;i++) // Auto generating values.
		{
			for(int j=0;j<4;j++)
			{
				nums[i][j]=(int)(Math.random()*100);
				System.out.print(nums[i][j]+ " ");
			}
			System.out.println();
		}

		System.out.println(); 
	
		for(int i=0;i<3;i++) // printing the generated values.
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println();
		
		for(int n[]:nums) // shortcut to print array values.
		{
			for(int m:n)
			{
				System.out.print(m+" ");
			}
			System.out.println();
		}
	}
}