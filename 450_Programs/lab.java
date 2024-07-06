//Lab Capacity Comparison
import java.util.Scanner;

public class Lab {
    public static void main(String args[]) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the capacity of Lab1:");
        x = sc.nextInt();

        System.out.println("Enter the capacity of Lab2:");
        y = sc.nextInt();

        System.out.println("Enter the capacity of Lab3:");
        z = sc.nextInt();

        if (x <= y && x <= z) {
            System.out.println("Lab1 has Minimal Capacity");
        } else if (y <= x && y <= z) {
            System.out.println("Lab2 has Minimal Capacity");
        } else {
            System.out.println("Lab3 has Minimal Capacity");
        }

        sc.close();
    }
}

/*
1. Importing the Scanner Class
>>import java.util.Scanner;
This line imports the Scanner class from the java.util package, which allows us to read input from the user.

2. Class Definition
>>public class Lab { }
Defines a public class named Lab. In Java, class names typically start with an uppercase letter.

3. main Method
>>public static void main(String args[]) { }
This is the starting point of the program where execution begins.

4. Variable Declarations and Scanner Initialization
>>int x, y, z; // Variables to store lab capacities
Scanner sc = new Scanner(System.in); // Scanner object to read input
x, y, and z are integer variables that will hold the capacities of three labs (Lab1, Lab2, Lab3).
Scanner sc = new Scanner(System.in); creates a Scanner object named sc to read input from the standard input stream (keyboard).

5. Prompting for Input
>>System.out.println("Enter the capacity of Lab1:");
x = sc.nextInt();

System.out.println("Enter the capacity of Lab2:");
y = sc.nextInt();

System.out.println("Enter the capacity of Lab3:");
z = sc.nextInt();
Prompts the user to enter the capacity of three labs (Lab1, Lab2, Lab3) one by one.
sc.nextInt() reads integer input provided by the user and assigns them to variables x, y, and z respectively.

6. Determining Lab with Minimal Capacity
if (x <= y && x <= z) {
    System.out.println("Lab1 has Minimal Capacity");
} else if (y <= x && y <= z) {
    System.out.println("Lab2 has Minimal Capacity");
} else {
    System.out.println("Lab3 has Minimal Capacity");
}
Uses conditional statements (if, else if, else) to compare the capacities of the three labs.
Condition (x <= y && x <= z):
Checks if the capacity of Lab1 (x) is less than or equal to both Lab2 (y) and Lab3 (z).
If true, prints "Lab1 has Minimal Capacity".
Condition (y <= x && y <= z):
Checks if the capacity of Lab2 (y) is less than or equal to both Lab1 (x) and Lab3 (z).
If true (and the first condition is false), prints "Lab2 has Minimal Capacity".
else Condition:
If neither of the above conditions is true, then Lab3 (z) has the minimal capacity.
Prints "Lab3 has Minimal Capacity".

7. Closing the Scanner
>>sc.close();
Closes the Scanner object sc to release resources associated with it.


8.Example Execution
Let's go through an example to understand how the program works:
>>Input:
Enter the capacity of Lab1:
30
Enter the capacity of Lab2:
20
Enter the capacity of Lab3:
25
>>Output:
Lab2 has Minimal Capacity

In this example:
Capacity of Lab1 (x) is 30.
Capacity of Lab2 (y) is 20.
Capacity of Lab3 (z) is 25.
Lab2 has the smallest capacity (20)
*/
