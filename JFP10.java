/*Write a program to print Fibonacci series of n terms where n is input by user i.e.
0 1 1 2 3 5 8 13 24 .....
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it. */
import java.util.Scanner;
public class JFP10 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,a=0,b=1,c;
		System.out.println("Enter the value of n : ");
		n = sc.nextInt();
		System.out.println("First "+n+" terms of the Fibonacci series are : ");
		for(int i = 1;i<=n;i++)
		{
			System.out.println(a);
			c = a+b;
			a = b;
			b = c;
		}
	}
}
