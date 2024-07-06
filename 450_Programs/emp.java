import java.util.Scanner;
public class emp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name ");
		String name = sc.next();
		System.out.println("Enter Employee Basic Salary ");
		double b_salary = sc.nextDouble();
		//System.out.println("Basic Salary " +b_salary+".Rs");
		System.out.println("Enter Withdraw amount");
		double w_amount = sc.nextInt();
		double rem_amount;
		double tax= b_salary*0.1;
		if(b_salary >= 25000)
		{
			//tax = b_salary*0.1;
			//System.out.println("Tax Amount " +tax+".Rs");
			b_salary = b_salary - tax;
			rem_amount = b_salary - w_amount;
			
			System.out.println("Employee Name "+name);
			System.out.println("Basic Salary " +b_salary+".Rs");
			System.out.println("Tax Amount " +tax+".Rs");
			System.out.println("Remaing Amount "+rem_amount+".Rs");
		}
		else{
			rem_amount = b_salary - w_amount;
			System.out.println("Employee Name "+name);
			System.out.println("Basic Salary " +b_salary+".Rs");
			System.out.println("Remaing Amount "+rem_amount+".Rs");
		}
		
		sc.close();
	}
}