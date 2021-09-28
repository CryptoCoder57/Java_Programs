import java.util.Scanner;
public class ConditionalOperatorDemo2 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,result;
		System.out.println("Enter any three integers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		result = (a>b && a>c)?a:(b>c)?b:c;
		System.out.println("Greatest of the three integers entered is: "+result);
	}
}
