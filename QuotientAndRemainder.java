import java.util.Scanner;
public class QuotitentAndRemainder 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int dividend,divisor,q,r;
		System.out.println("Enter the dividend : ");
		dividend = sc.nextInt();
		System.out.println("Enter the divisor : ");
		divisor = sc.nextInt();
		q = dividend / divisor;
		r = dividend % divisor;
		System.out.println("Quotient is : "+q);
		System.out.println("Remainder is : "+r);
	}
}
