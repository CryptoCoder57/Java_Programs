// Program to write a function that calculates the Greatest Common Divisor of 2 numbers.(Using Euclid's GCD algorithm)
import java.util.Scanner;
public class JFP9
{
	private static int ComputeGCD(int a,int b)
	{ 
		if(b==0)
			return a;
		else
			return ComputeGCD(b,a%b);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,gcd;
		System.out.println("Enter any two numbers to find the GCD");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		gcd = ComputeGCD(n1,n2);
		System.out.println("Greatest Common Divisor of the two numbers is : "+gcd);
	}
}
