public class Jagged_And_3D_Arrays_22 {
	public static void main(String[] args) 
	{

// un-uniform elements in count of an array is known as jagged array.
		int nums[][]=new int [3][]; //jagged
		nums[0]=new int [3];
		nums[1]=new int [4];
		nums[2]=new int [2];
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums[i].length;j++)
			{
				nums[i][j]=(int)(Math.random()*10);
				System.out.print(nums[i][j]+ " ");
			}
				System.out.println(" ");
		}
		

		System.out.println(" ");


// three dimensional
		int nums1[][][] = new int [3][4][5]; 

		
		for(int i=0;i<nums1.length;i++)
		{
			for(int j=0;j<nums1[i].length;j++)
			{
				for(int k=0;k<nums1[j].length;k++)
				{
					nums1[i][j][k]=(int)(Math.random()*10);
					System.out.print(nums1[i][j][k] + " ");
				}
				System.out.println(" ");
			}
		}
	}
}