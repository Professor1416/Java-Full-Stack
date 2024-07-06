public class Add
{
    public static void main(String args[])
    {
        // Declare and initialize two integer variables
        int a = 10;
        int b = 20;
        
        // Calculate the sum of the two variables
        int res = a + b;
        
        // Print the result to the console
        System.out.println("Addition is " + res);
    }
}





/*
>>Code Explanation<<
Class Definition:
This line declares a public class named add. In Java, every application begins with a class definition. 
The name of the class should ideally start with an uppercase letter as per Java naming conventions, so it might be better to use Add instead.

>> Main Method:
This line declares the main method, which is the entry point for any Java application.

>> public: This means the method is accessible from anywhere.
>> static: This means the method belongs to the class and not a specific instance of the class.
>> void: This means the method does not return any value.
>> String args[]: This is an array of String arguments that can be passed to the program from the command line.
>> Variable Declaration and Initialization:

int a = 10; declares an integer variable a and initializes it to 10.
int b = 20; declares another integer variable b and initializes it to 20.
int res = a + b; declares an integer variable res and assigns it the sum of a and b.
Printing the Result:

System.out.println is used to print messages to the console.
The message "Addition is " is concatenated with the value of res using the + operator. This concatenated string is then printed to the console.
Execution
When you run this program, it will output:

>> Excution
Addition is 30
*/	
