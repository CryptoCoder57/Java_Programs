public class SimpleIfDemo 
{
	public static void main(String args[])
	{
		int i = 100;
		// in case of single line
		if(i==100)
			System.out.println("Value of i is 100");
		// in case of multiple lines
		System.out.println("==============");
		if(i==100)
		{
			System.out.println("The condition has evaluated to true");
			System.out.println("Value of i is 100");
		}
	}
}
