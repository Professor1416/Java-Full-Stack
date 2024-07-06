import java.util.Scanner;
public class validate
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String user = "username";
		String password = "password";

		System.out.println("Enter UserName");
		String u = sc.next();
		
		System.out.println("Enter Password");
		String p = sc.next();

		if(!user.equals(u) && !password.equals(p))
		{
			System.out.println("UserName is Incorrect AND Password is Incorrect");		
		}
		else if(!password.equals(p))
		{
			System.out.println("Password is Incorrect...!");		
		}
		else if(!user.equals(u))
		{
			System.out.println("UserName is Incorrect...!");			
		}
		else 
		{
			System.out.println("Login Successfully...!");		
		}
			
	}
}