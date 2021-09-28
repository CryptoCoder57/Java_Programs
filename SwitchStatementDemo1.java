import java.util.Scanner;
public class SwitchStatementDemo1 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String day,dayInLowerCase;
		System.out.println("Enter the day name:");
		day = sc.next();
		dayInLowerCase = day.toLowerCase();
		switch(dayInLowerCase)	//Strings are supported as input of switch statement from JDK-7
		{
		case "sunday":	// the string is internally converted into hash code
			System.out.println("It is sunday!");
			break;
		case "monday":
			System.out.println("It is monday!");
			break;
		case "tuesday":
			System.out.println("It is tuesday!");
			break;
		case "wednesday":
			System.out.println("It is wednesday!");
			break;
		case "thursday":
			System.out.println("It is thursday!");
			break;
		case "friday":
			System.out.println("It is friday!");
			break;
		case "saturday":
			System.out.println("It is saturday!");
			break;
		default:
			System.out.println("Invalid day name entered");
		}
	}
}
