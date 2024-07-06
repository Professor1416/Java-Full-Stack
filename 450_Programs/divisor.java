//Java Divisor Program
//This Java program finds and displays all the divisors of a given number, counts the total number of divisors, and calculates the sum of these divisors.
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


/*
>>Variable Declarations:
Scanner sc = new Scanner(System.in); creates a Scanner object to read input from the standard input stream (keyboard).
int num, i, cnt = 0, sum = 0; declares variables for the number to be checked (num), the loop counter (i), the count of divisors (cnt), and the sum of divisors (sum).

>>User Input:
System.out.println("Enter Number"); prompts the user to enter a number.
num = sc.nextInt(); reads the number from the user.

>>Divisor Calculation:
System.out.println("Divisor Of " + num); prints a message indicating that the divisors of the entered number will be displayed.
The for loop iterates from 1 to the entered number (num). For each iteration, it checks if the current value of i is a divisor of num by evaluating num % i == 0.

>>Inside the Loop:
If i is a divisor of num:
System.out.println(i); prints the divisor.
cnt++; increments the count of divisors.
sum += i; adds the divisor to the sum of divisors.

Output:
System.out.println("Total Count OF Divisor " + cnt); prints the total count of divisors.
System.out.println("Total Sum " + sum); prints the total sum of divisors.
Scanner Closure:

The program does not explicitly close the Scanner object, but it's a good practice to do so to avoid resource leaks. You can add sc.close(); 
at the end of the main method.

>>Output
Enter Number
6
Divisors of 6:
1
2
3
6
Total Count of Divisors: 4
Total Sum of Divisors: 12

*/
