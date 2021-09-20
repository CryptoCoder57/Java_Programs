public class SumOfIndividualDigits 
{
	public static void main(String args[])
	{
		int n = 5478;
		int sum = 0;
		int m,r;
		m = n;	// m is to maintain a copy of n
		//Logic to find the sum of individual digits of a number
		while(m!=0)
		{
			r = m % 10;
			sum = sum + r;
			m = m / 10;
		}
		System.out.println("Sum of individual digits of "+ n + " is "+sum);
	}
}
