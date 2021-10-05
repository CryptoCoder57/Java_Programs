import java.util.Scanner;
public class ASCIIValueOfChar 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char chr;
		int ascii_chr;
		System.out.println("Enter a character : ");
		chr = sc.next().charAt(0);
		ascii_chr = (int)chr;
		System.out.println("ASCII value of "+chr+" is : "+ascii_chr);
	}
}
