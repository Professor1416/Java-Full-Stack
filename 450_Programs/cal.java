import java.util.Scanner;
public class cal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//do{
			int num1,num2, res;
			
			System.out.println("1.Add\n2.Subtract\n3.Multiplication\n4.Division\n5.Exit");
			System.out.println("Enter YOur Choice:");
			int choice =sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter Enter Number 1:");
					num1 = sc.nextInt();
					System.out.println("Enter Enter Number 2:");
					num2 = sc.nextInt();
					res = num1+num2;
					System.out.println("Addition is " +res);
					break;
				case 2:
					
					System.out.println("Enter Enter Number 1:");
					num1 = sc.nextInt();
					System.out.println("Enter Enter Number 2:");
					num2 = sc.nextInt();
					res = num1-num2;
					System.out.println("Subtraction  is " +res);
					break;
				case 3:
					System.out.println("Enter Enter Number 1:");
					num1 = sc.nextInt();
					System.out.println("Enter Enter Number 2:");
					num2 = sc.nextInt();
					res = num1*num2;
					System.out.println("Multiplication is " +res);
					break;
				case 4:
					
					System.out.println("Enter Enter Number 1:");
					num1 = sc.nextInt();
					System.out.println("Enter Enter Number 2:");
					num2 = sc.nextInt();
					res = num1/num2;
					System.out.println("Division is " +res);
					break;
				case 5:
					System.exit(0);	
				default:
					System.out.println("Invalid Choice" );
			}
			
		//}while(choice != 0);
	}	
}