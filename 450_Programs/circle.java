//Java Circle Calculation Program
import java.util.Scanner;
public class Circle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        double r = sc.nextDouble();

        if (1 <= r && r <= 1000)
        {
            double area = Math.PI * r * r;
            double cir = 2 * Math.PI * r;
            System.out.printf("Area of Circle: %.4f%n", area);
            System.out.printf("Circumference of Circle: %.4f%n", cir);
        }
        else
        {
            System.out.println("-1");
        }

        sc.close();
    }
}


/*
>>User Input:
System.out.println("Enter radius of circle"); prompts the user to enter the radius of the circle.
double r = sc.nextDouble(); reads the radius value from the user.

>>Radius Validation and Calculation:
The if statement checks if the radius r is between 1 and 1000 (inclusive).
>>If the radius is within the valid range:
double area = 3.142 * r * r; calculates the area of the circle using the formula 
  (approximating π as 3.142).
double cir = 2 * 3.142 * r; calculates the circumference of the circle using the formula 
2πr (approximating π as 3.142).

System.out.println("Area of Circle " + area); prints the area of the circle.
System.out.println("Circumference of Circle " + cir); prints the circumference of the circle.
If the radius is outside the valid range:
System.out.println("-1"); prints -1.


>>OUTPUT
Enter radius of circle:
5
Area of Circle: 78.5398
Circumference of Circle: 31.4159

*/
