import java.util.Scanner;
public class divisor
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num,i,cnt=0 , sum=0;
		System.out.println("Enter Number");
		num = sc.nextInt();
		System.out.println("Divisor Of " +num);
		
		for(i=1;i<=num;i++)
		{
			if((num %i)==0)
			{
				System.out.println(i);
				cnt++;
				sum+= i;
			}
		}
		System.out.println("Total Count OF Divisor "+ cnt);
		System.out.println("Total Sum "+ sum);	
		

		
	}
}