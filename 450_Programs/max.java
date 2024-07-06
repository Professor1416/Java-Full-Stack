import java.util.Scanner;
public class max
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int  max=num, min=num;
		while(true)
		{
			System.out.println("Enter Number");
			num = sc.nextInt();
			//max=min=num;
			if(num<0)
			{
				break;
			}
			if(num>max)
			{
				max=num;
			}
			if(num<min)
			{
				min=num;
			}		
		}
		System.out.println("MAX : "+max);
		System.out.println("MIN : "+min);
		
		
	}
}