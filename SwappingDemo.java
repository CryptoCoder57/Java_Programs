import java.util.Scanner;
public class SwappingDemo 
{
	private static void swap(int a,int b)
	{
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("The values after swap are : a = "+a+", b = "+b);
	}
	public static void main(String args[])
	{
		Scanner sc  = new Scanner(System.in);
		int a,b;
		System.out.println("Enter any two numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("The values before swap are : a = "+a+", b = "+b);
		swap(a,b);
	}
}
