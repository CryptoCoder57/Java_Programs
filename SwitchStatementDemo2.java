/* 31 days - 1,3,5,7,8,10,12
 * 30 days - 4,6,9,11
 * 28/29 days - 2
 */

import java.util.Scanner;
public class SwitchStatementDemo2 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int month_num,year;
		System.out.println("Enter the month number(1-12): ");
		month_num = sc.nextInt();
		switch(month_num)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("The month contains 31 days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("The month contains 30 days");
			break;
		case 2:
			System.out.println("Enter the year(YYYY)");
			year = sc.nextInt();
			if((year%400==0) || (year%4==0 && year%100!=0))
			{
				System.out.println("The month contains 29 days");
			}
			else
			{
				System.out.println("The month contains 28 days");
			}
			break;
		default:
			System.out.println("Inavlid month number eneterd");
		}
	}
}
