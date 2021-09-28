import java.util.Scanner;
public class ConditionalOperatorDemo1 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,result;
		System.out.println("Enter any two integers:");
		a = sc.nextInt();
		b = sc.nextInt();
		result = a>b?a:b;
		System.out.println("Gretater of the two integers entered is: "+result);
	}
}
