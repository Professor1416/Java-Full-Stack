//Java program that calculates the compound interest on a given principal amount over a specified number of years at a certain rate of interest

import java.util.Scanner;
public class ci 
{
    public static void main(String args[]) 
{
        double amount, rate, year, ci, total_A;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principal amount: ");
        amount = sc.nextDouble();

        System.out.println("Enter rate of interest: ");
        rate = sc.nextDouble();

        System.out.println("Enter year : ");
        year = sc.nextDouble();

        total_A = amount;
        for (int i = 0; i < year; i++) 
	{
            total_A = total_A * (1 + rate / 100);
        }

        System.out.println("Total amount is: " + total_A);

        ci = total_A - amount;
        System.out.println("Compound interest is: " + ci);

        sc.close();
    }
}

/*
>>User Input:
System.out.println("Enter principal amount: "); prompts the user to enter the principal amount.
amount = sc.nextDouble(); reads the principal amount from the user.
System.out.println("Enter rate of interest: "); prompts the user to enter the rate of interest.
rate = sc.nextDouble(); reads the rate of interest from the user.
System.out.println("Enter year: "); prompts the user to enter the number of years.
year = sc.nextDouble(); reads the number of years from the user.

>>Compound Interest Calculation:
total_A = amount; initializes total_A with the principal amount.
The for loop iterates for the number of years, calculating the total amount after each year using the formula total_A = total_A * (1 + rate / 100);.

>>Output:
System.out.println("Total amount is: " + total_A); prints the total amount after the specified number of years.
ci = total_A - amount; calculates the compound interest.
System.out.println("Compound interest is: " + ci); prints the compound interest.

>>Scanner Closure:
sc.close(); closes the Scanner object to avoid resource leaks.

>>Output
Enter principal amount:
1000
Enter rate of interest:
5
Enter year:
2
Total amount is: 1102.5
Compound interest is: 102.5

*/
