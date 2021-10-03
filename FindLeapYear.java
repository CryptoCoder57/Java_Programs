import java.util.Scanner;
public class FindLeapYear
{
	private static boolean checkLeapYear(int y)
	{
		if((y % 400 == 0)||(y % 4 == 0 && y % 100 != 0))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int year_num;
		boolean result;
		System.out.println("Enter the year number : ");
		year_num = sc.nextInt();
		result = checkLeapYear(year_num);
		if(result==true)
			System.out.println(year_num+" is a leap year");
		else
			System.out.println(year_num+" is not a leap year");
	}
}
