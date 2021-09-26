/* Program to  write a function that takes in age as input and returns if that person is eligible to vote or not. 
 A person of age > 18 is eligible to vote */
import java.util.Scanner;
public class JFP5 
{
	public static boolean checkEligibility(int age)
	{
		if(age>18)
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		boolean result =  checkEligibility(age);
		if(result == true)
			System.out.println("You are eligible to vote ");
		else
			System.out.println("You are not eligible to vote");
	}
}
