//Program to take input of 3 numbers from the user & make a function to print their average.
import java.util.Scanner;
public class JFP1 
{
	private static void printAverage(int a,int b,int c)
	{
		int result = (a+b+c)/3;
		System.out.println("Avearge of the three numbers is : "+result);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x1,x2,x3;
		System.out.println("Enter any three numbers to find the average: ");
		x1 = sc.nextInt();
		x2 = sc.nextInt();
		x3 = sc.nextInt();
		printAverage(x1,x2,x3);
	}
}
