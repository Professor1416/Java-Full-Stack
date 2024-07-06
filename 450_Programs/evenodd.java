//Java Even/Odd Number Program
//This Java program determines whether a given number is even or odd.
import java.util.Scanner;
public class evenodd
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		if(num%2==0)
		{
			System.out.println(num+" is even number");
		}
		else
		{
			System.out.println(num+" is odd number");
		}
		sc.close();
	}
}

/*
>>User Input:
System.out.println("Enter Number"); prompts the user to enter a number.
int num = sc.nextInt(); reads the number from the user.

>>Even/Odd Check:
The if statement checks if the number is even by evaluating num % 2 == 0.

If the number is even (num % 2 == 0 evaluates to true):
System.out.println(num + " is an even number"); prints that the number is even.

If the number is odd (num % 2 != 0):
System.out.println(num + " is an odd number"); prints that the number is odd.

>>Scanner Closure:
sc.close(); closes the Scanner object to avoid resource leaks.

>>Output
Enter Number:
4
4 is an even number

Enter Number:
5
5 is an odd number
*/

