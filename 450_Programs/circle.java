import java.util.Scanner;

public class circle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle");
		double r = sc.nextDouble();
		
		if(1<=r && r<=1000)
		{
			double area = 3.142*r*r;
			double cir  = 2*3.142*r;
			System.out.println("Area of Circle " + area);
			System.out.println("Circumfrence of Circle " +cir );
		}
		else
		{
			System.out.println("-1");
		}
		
		
	}
}