// Program to write a function that takes in the radius as input and returns then circumference of a circle.
import java.util.Scanner;
public class JFP4 
{
	public static double getCircumference(double r)
	{
		final double PI = 3.14;
		return 2*PI*r;
    // or simply write: return 2*3.14*r;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double radius,result;
		System.out.println("Enter the radius of circle : ");
		radius = sc.nextDouble();
		result = getCircumference(radius);
		System.out.println("Circumfernce of the circle is : "+result);
	}
}
