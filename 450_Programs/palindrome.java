import java.util.Scanner;
public class palindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num ,res=0,p, rem;
		System.out.println("Enter Number To Check Palindrome");
		num = sc.nextInt();
		p=num;
		while(num != 0)
		{
			rem= num%10;
			res = res*10+rem;
			num/=10;	
		}
		if(res == p)
		{
			System.out.println(p+" is Palindrome Number" );
		}
		else
			System.out.println(p+" is not a Palindrome Number");		
		
	}
}