//Java Program Finding the Greatest Number in three number
import java.util.Scanner;
public class greatest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1" );
		int a = sc.nextInt();
		System.out.println("Enter Number 2" );
		int b = sc.nextInt();
		System.out.println("Enter Number 3" );
		int c = sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("A is gratest number");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is gratest number");	
		}
		else
		{
			System.out.println("C " is gratest number ");
		}	
		sc.close();
	}
}

/*
1.Importing the Scanner Class
>>import java.util.Scanner;
This line imports the Scanner class from the java.util package. It allows us to take input from the user via the keyboard.

2. Class Definition
>>public class Greatest {
Defines a public class named Greatest. In Java, class names conventionally start with an uppercase letter.

3. main Method
>>public static void main(String args[]) {}
This is the entry point of the program. main method is where the program starts executing.

4. Creating a Scanner Object
>>Scanner sc = new Scanner(System.in);
Creates a Scanner object named sc to read input from the standard input stream (keyboard).

5. Prompting for Input
>>System.out.println("Enter Number 1:");
>>int a = sc.nextInt();
>>System.out.println("Enter Number 2:");
>>int b = sc.nextInt();
>>System.out.println("Enter Number 3:");
>>int c = sc.nextInt();
Prompts the user to enter three numbers one by one.

sc.nextInt() reads the integer input provided by the user and assigns it to variables a, b, and c.

6. Determining the Greatest Number
>>if (a > b && a > c) {
    >>System.out.println("A is the greatest number");
>>} else if (b > a && b > c) {
    >>System.out.println("B is the greatest number");
>>} else {
    >>System.out.println("C is the greatest number");
>>}
7.Uses conditional statements (if, else if, else) to determine which of the numbers (a, b, or c) is the greatest.
First if condition (a > b && a > c):
Checks if a is greater than both b and c.
If true, prints "A is the greatest number".
else if condition (b > a && b > c):
Checks if b is greater than both a and c.
If true, prints "B is the greatest number".

else condition:
If neither of the above conditions is true, then c must be the greatest.
Prints "C is the greatest number".

8.Closing the Scanner
sc.close();
Closes the Scanner object sc to release resources associated with it.
Example Execution
Let's walk through an example execution of the program:

>>Input:
Enter Number 1:
10
Enter Number 2:
5
Enter Number 3:
8

>>Output:
A is the greatest number

>>In this example:
User enters 10, 5, and 8.
The program compares these numbers and determines that 10 (assigned to variable a) is the greatest.
Therefore, it prints "A is the greatest number".
*/
