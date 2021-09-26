// Program to write a function to print the sum of all odd numbers from 1 to n.
import java.util.Scanner;
public class JFP2 
{
	public static void printSumOfOddNum(int n)
	{
		int sum = 0;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)	// if it is an odd number
			{
				sum += i; 	// sum = sum + i
			}
		}
		System.out.println("Sum of all odd numbers from 1 to "+n+" is : "+sum);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		printSumOfOddNum(n);
	}
}
