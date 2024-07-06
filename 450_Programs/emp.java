//Java Employee Salary Program
//This Java program calculates the remaining amount of an employee's salary after applying a tax (if applicable) and a withdrawal amount.
//The program uses a Scanner object for user input and includes a condition to apply a tax if the basic salary is above a certain threshold (25,000).
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

/*
>>Variable Declarations:
double rem_amount; declares a variable to store the remaining amount.
double tax = b_salary * 0.1; calculates the tax as 10% of the basic salary.

>>Tax Application and Salary Calculation:
The if statement checks if the basic salary is greater than or equal to 25,000.
**If true:
The tax is subtracted from the basic salary.
The remaining amount is calculated by subtracting the withdrawal amount from the updated basic salary.
The employee's name, updated basic salary, tax amount, and remaining amount are printed.
**If false:
The remaining amount is calculated by subtracting the withdrawal amount from the basic salary.
The employee's name, basic salary, and remaining amount are printed.

>>Scanner Closure:
sc.close(); closes the Scanner object to avoid resource leaks.

>>Output
Enter Employee Name:
Ajay
Enter Employee Basic Salary:
30000
Enter Withdraw amount:
5000
Employee Name: Ajay
Basic Salary: 27000.00 Rs
Tax Amount: 3000.00 Rs
Remaining Amount: 22000.00 Rs

*/
