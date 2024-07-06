import java.util.Scanner;
public class greatest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1" );
		int a = sc.nextInt();
		System.out.println("Enter Number 2" );
		int b = sc.nextInt();
		System.out.println("Enter Number 3" );
		int c = sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("A is gratest number");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is gratest number");	
		}
		else
		{
			System.out.println("C " is gratest number ");
		}	
		sc.close();
	}
}