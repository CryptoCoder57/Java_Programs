public class PerfectNumber 
{
	public static void main(String args[])
	{
		int n = 28;
		int sum = 0;
		//Perfect Number Logic
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum = sum + i;
			}
		}
		if(sum==n)
		{
			System.out.println(n+" is a Perfect number");
		}
		else
		{
			System.out.println(n+" is not a Perfect number");
		}
		
	}
}
