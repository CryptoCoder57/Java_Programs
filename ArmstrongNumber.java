public class ArmstrongNumber 
{
	public static void main(String args[])
	{
		int num = 1634;
		int sum = 0,n = 0;
		int m,r;
		// logic to find the no. of digits
		m = num;	// to maintain a copy of num
		while(m!=0)
		{
			m = m / 10;
			n++;
		}
		// Armstrong Number Logic
		m = num;	// to maintain a copy of num
		while(m!=0)
		{
			r = m % 10;
			sum = (int) (sum + Math.pow(r,n));
			m = m / 10;
		}
		if(sum == num)
		{
			System.out.println(num+" is an Armstrong number");
		}
		else
		{
			System.out.println(num+" is not an Armstrong number");
		}	
	}
}
