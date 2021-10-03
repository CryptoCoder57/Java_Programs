import java.util.Scanner;
public class FactorialUsingRecursion 
{
	private static int factorialOfNum(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n*factorialOfNum(n-1);
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,result;
		System.out.println("Enter an integer to find the factorial : ");
		n = sc.nextInt();
		result = factorialOfNum(n);
		System.out.println("Factorial of "+n+" is : "+result);
	}
}
