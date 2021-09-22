public class IfElseDemo 
{
	public static void main(String args[])
	{
		int i = 5;
		// in case of single statement
		if(i<5)
			System.out.println("Value of i is less than 5");
		else
			System.out.println("Value of i is not less than 5");
		// in case of multiple statements
		System.out.println("================");
		if(i>5)
		{
			System.out.println("The condition has evaluated to true");
			System.out.println("Value of i is greater than 5");
		}
		else
		{
			System.out.println("The condition has evaluated to false");
			System.out.println("Value of i is less than or equal to 5");
		}
	}
}
