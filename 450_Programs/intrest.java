//Simple Interest Calculation
import java.util.Scanner;
public class intrest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle Amount");
		int p = sc.nextInt();
		
		System.out.println("Enter Rate Of Interst");
		int r = sc.nextInt();
		
		System.out.println("Enter Duration in year");
		int y = sc.nextInt();
	
		int si = (p*r*y)/100;
		System.out.println("Simple Intrest: "+si);
		
		int total = p+si;
		System.out.println("Total Amount :" +total);	
	}
}

/*
1.Prompting for Input
System.out.println("Enter Principle Amount:");
int p = sc.nextInt();

System.out.println("Enter Rate Of Interest:");
int r = sc.nextInt();

System.out.println("Enter Duration in years:");
int y = sc.nextInt();
Prompts the user to enter three pieces of information:

Principle Amount (p): The initial amount of money.
Rate Of Interest (r): The annual interest rate (as a percentage).
Duration in years (y): The duration for which the interest will be applied.
sc.nextInt() reads integer input provided by the user and assigns them to variables p, r, and y respectively.

2. Calculating Simple Interest
>>int si = (p * r * y) / 100;
>>System.out.println("Simple Interest: " + si);

Computes the simple interest (si) using the formula:
Simple Interest = 𝑃×𝑅×𝑌/100
Where:
𝑃
P is the principal amount (p).
𝑅
R is the rate of interest (r).
𝑌
Y is the duration in years (y).
Prints the calculated simple interest using System.out.println().

3.Calculating Total Amount
int total = p + si;
System.out.println("Total Amount: " + total);
Calculates the total amount (total) by adding the principal amount (p) and the simple interest (si).
Prints the total amount using System.out.println().

4.Input
Enter Principal Amount:
1000
Enter Rate Of Interest:
5
Enter Duration in years:
2

5.Output
Simple Interest: 100
Total Amount: 1100

*/
