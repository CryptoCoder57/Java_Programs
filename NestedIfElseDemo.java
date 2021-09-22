public class NestedIfElseDemo 
{
	public static void main(String args[])
	{
		//To find the greatest of given three numbers
		int a = 5,b = 54,c = 10;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+" is greater");
			}
			else
			{
				System.out.println(c+" is greater");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println(b+" is greater");
			}
			else
			{
				System.out.println(c+" is greater");
			}
		}
	}
}
