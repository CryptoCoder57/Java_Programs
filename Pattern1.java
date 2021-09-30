public class Pattern1 
{
	public static void main(String args[])
	{
		int n = 6;
		// Stars pattern1
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println(); 	//for an empty line after each iteration of the outer loop
		}
		System.out.println("===========================================");
		// Number pattern1
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("===========================================");
		// Number pattern2
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("===========================================");
	}
}
