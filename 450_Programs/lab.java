import java.util.Scanner;
public class lab
{
	public static void main(String args[])
	{
		int x ,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the capacity of Lab1");
		x = sc.nextInt();
		
		System.out.println("Enter the capacity of Lab2");
		y = sc.nextInt();

		System.out.println("Enter the capacity of Lab3");
		z = sc.nextInt();

		if(x>y )
		{
			System.out.println("Lab1 has Minimal Capacity");
		}
		else if(y >z)
		{
			System.out.println("Lab 2 has minimal Capacity");	
		}
		else
		{
			System.out.println("Lab 3 has Minimal Capacity");
		}
	}
}