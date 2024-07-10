//Print ASCII Value of a Character
import java.util.Scanner;
public class AsciiValue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);
        
        int asciiValue = (int) ch;
        
        System.out.println("The ASCII value of " + ch + " is: " + asciiValue);
        
        sc.close();
    }
}

/*
>>Variable Declaration and Scanner Initialization:
Scanner sc = new Scanner(System.in);
Creates a Scanner object named sc to read input from the user.
>>Prompting for User Input:
System.out.println("Enter a character:");
char ch = sc.next().charAt(0);
Prompts the user to enter a character.
Reads the input and stores the first character entered by the user in the variable ch.

>>Typecasting Character to ASCII Value:
int asciiValue = (int) ch;
Converts the character ch to its ASCII value by typecasting it to an int.

>>Printing the ASCII Value:
System.out.println("The ASCII value of " + ch + " is: " + asciiValue);
Prints the character and its corresponding ASCII value.

>>Closing the Scanner:
sc.close();
Closes the Scanner object to release resources.

Example Execution
>>Input:
Enter a character:
A

>>Output:
The ASCII value of A is: 65
*/
