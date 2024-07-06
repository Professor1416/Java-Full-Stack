//This is a Java program that functions as a simple calculator.
//It allows users to perform addition, subtraction, multiplication, and division operations repeatedly until they choose to exit. 

import java.util.Scanner;
public class Cal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int choice; // Declare choice outside the loop

        do {
            int num1, num2, res;

            System.out.println("1. Add\n2. Subtract\n3. Multiplication\n4. Division\n5. Exit");
            System.out.println("Enter Your Choice:");
            choice = sc.nextInt(); // Read the choice from the user

            switch (choice)
            {
                case 1:
                    System.out.println("Enter Number 1:");
                    num1 = sc.nextInt();
                    System.out.println("Enter Number 2:");
                    num2 = sc.nextInt();
                    res = num1 + num2;
                    System.out.println("Addition is " + res);
                    break;

                case 2:
                    System.out.println("Enter Number 1:");
                    num1 = sc.nextInt();
                    System.out.println("Enter Number 2:");
                    num2 = sc.nextInt();
                    res = num1 - num2;
                    System.out.println("Subtraction is " + res);
                    break;

                case 3:
                    System.out.println("Enter Number 1:");
                    num1 = sc.nextInt();
                    System.out.println("Enter Number 2:");
                    num2 = sc.nextInt();
                    res = num1 * num2;
                    System.out.println("Multiplication is " + res);
                    break;

                case 4:
                    System.out.println("Enter Number 1:");
                    num1 = sc.nextInt();
                    System.out.println("Enter Number 2:");
                    num2 = sc.nextInt();
                    if (num2 != 0) {
                        res = num1 / num2;
                        System.out.println("Division is " + res);
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;

                case 5:
                    System.exit(0); // Exit the program
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5); // Continue the loop until choice is 5

        sc.close(); // Close the scanner
    }
}


/*Code Explanation
>>Import Statement:
import java.util.Scanner; imports the Scanner class, which is used for taking input from the user.

>>Class Definition:
public class cal declares a public class named cal. Ideally, the class name should start with an uppercase letter, so consider renaming it to Cal.

>>Main Method:
public static void main(String args[]) is the entry point of the program.

>>Scanner Initialization:
Scanner sc = new Scanner(System.in); creates a Scanner object to read input from the standard input stream (keyboard).

>>Do-While Loop:
The do-while loop repeatedly displays the menu and processes user choices until the user chooses to exit.

>>Variable Declarations:
int num1, num2, res; declares three integer variables for storing the numbers and the result.

>>Menu Display and User Choice:
The program prints the menu options and prompts the user to enter their choice using sc.nextInt().

>>Switch Statement:
The switch statement processes the user's choice and performs the corresponding arithmetic operation.

>>Case Statements:
Case 1 (Addition): Prompts the user for two numbers, performs addition, and displays the result.
Case 2 (Subtraction): Prompts the user for two numbers, performs subtraction, and displays the result.
Case 3 (Multiplication): Prompts the user for two numbers, performs multiplication, and displays the result.
Case 4 (Division): Prompts the user for two numbers, performs division, and displays the result. Note that integer division will be performed.
Case 5 (Exit): Terminates the program using System.exit(0);.
Default Case: Displays an "Invalid Choice" message for any other input.

>>Exit Condition:
The do-while loop continues as long as the user's choice is not 5.
*/
