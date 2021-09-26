/* Two numbers are entered by the user, x and n. 
 Program to write a function to find the value of one number raised to the power of another i.e. x raised to power of n */
import java.util.Scanner;
public class JFP8 
{
	private static int ComputePower(int x,int n)
	{
		int presult = 1;
		for(int i=1;i<=n;i++)
		{
			presult = presult * x;
		}
		return presult;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x,n;
		int result;
		System.out.println("Enter any number : ");
		x = sc.nextInt();
		System.out.println("Enter the value of exponent : ");
		n = sc.nextInt();
		result = ComputePower(x,n);
		System.out.println("Value of "+x+" raised to the power of "+n+" is : "+result);
	}
}
