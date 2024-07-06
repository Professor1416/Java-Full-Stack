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