import java.util.Scanner;
public class InputDemo 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer value : ");
		int int_var = sc.nextInt();
		System.out.println("Enter a float value : ");
		float float_var = sc.nextFloat();
		System.out.println("Enter a double value : ");
		double double_var = sc.nextDouble();
		System.out.println("Enter a charcater : ");
		char char_var = sc.next().charAt(0);
		sc.nextLine();  
		System.out.println("Enter a string : ");
		String string_var = sc.nextLine();
		
		System.out.println("The integer value eneterd is : "+int_var);
		System.out.println("The float value eneterd is : "+float_var);
		System.out.println("The double value eneterd is : "+double_var);
		System.out.println("The character enetered is : "+char_var);
		System.out.println("The string entered is : "+string_var);
	}
}
