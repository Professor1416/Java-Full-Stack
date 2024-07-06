import java.util.Scanner;

public class secure
{
	public static void main(String aegs[])
	{
		Scanner sc = new Scanner(System.in);
		String url , s;
		System.out.println("Enter the URL");
		url = sc.next();
		System.out.println("Enter Staring string");
		s= sc.next();

		if(url.startsWith(s))
		{
			System.out.println(url+" is Secure URL");	
		}
		else
		{
			System.out.println(url+" is Not Secure URL");
		}
	}
}