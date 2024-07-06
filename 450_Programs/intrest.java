import java.util.Scanner;
public class intrest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle Amount");
		int p = sc.nextInt();
		
		System.out.println("Enter Rate Of Interst");
		int r = sc.nextInt();
		
		System.out.println("Enter Duration in year");
		int y = sc.nextInt();
	
		int si = (p*r*y)/100;
		System.out.println("Simple Intrest: "+si);
		
		int total = p+si;
		System.out.println("Total Amount :" +total);	
	}
}