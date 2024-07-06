import java.util.Scanner;
public class reverse
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num ,res=0,i, rem;
		System.out.println("Enter Number");
		num = sc.nextInt();
		while(num != 0)
		{
			rem= num%10;
			res = res*10+rem;
			num/=10;	
		}
		System.out.println("Reverse Number " +res);	
		
	}
}