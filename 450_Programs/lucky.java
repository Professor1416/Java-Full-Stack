import java.util.Scanner;
public class lucky
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num , rem,temp,a,b,c,d;
		System.out.println("Enter Number Four Digit Number");
		num = sc.nextInt();
		temp = num;
		a =  num/1000;
		b = (num/100)%10;
		c = (num/10)%10;
		d =  num%10;
		//System.out.println(d);

		/*while(n>0)
		{
				
		}*/
		if((a+b)==(c+d))
		{
			System.out.println(temp+" is Lucky Number");
		}
		else
			System.out.println(temp+" is Not Lucky Number");
	}
}	