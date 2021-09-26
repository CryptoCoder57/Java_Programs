// Program to write a function which takes in 2 numbers and returns the greater of those two.
import java.util.Scanner;
public class JFP3 
{
	public static int getGreater(int a,int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,result;
		System.out.println("Enter any two numbers : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		result = getGreater(n1,n2);
		System.out.println("Greatest of the two numbers "+n1+" and "+n2+" is : "+result);
	}
}
