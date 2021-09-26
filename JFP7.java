/* Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. */
import java.util.Scanner;
public class JFP7 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num,choice;
		int countP=0,countN=0,countZ=0;
		System.out.println("1. To take input \n2. Exit & Display the count");
		do
		{
			System.out.println("Enter Choice (1 or 2) : ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter any number : ");
				num = sc.nextInt();
				if(num==0)
					countZ++;
				else if(num>0)
					countP++;
				else if(num<0)
					countN++;
				break;
			case 2:
				break;
			default:
				System.out.println("Invalid choice entered");
				System.out.println("Please enter a valid choice ");
			}
		}while(choice!=2);
		System.out.println("Count of positive numbers entered is : "+countP);
		System.out.println("Count of negative numbers entered is : "+countN);
		System.out.println("Count of zeroes entered is : "+countZ);
	}
}
