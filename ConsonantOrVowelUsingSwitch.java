import java.util.Scanner;
public class ConsonantOrVowelUsingSwitch 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter an Alphabet : ");
		ch = sc.next().charAt(0);
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')	// to check whether the given input is an alphabet or not
		{
			switch(ch)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(ch+" is a vowel");
				break;
			default:
				System.out.println(ch+" is a consonant");
			}
		}
		else
		{
			System.out.println("Please enter a valid alphabet");
		}
	}
}
