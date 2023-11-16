//Operation of Comparison operators 
package Operators;
import java.util.Scanner;
public class Compare {
		public static void main(String[] args) 
		{
			int num1,num2;
	        Scanner sc = new Scanner(System.in);      //scanner class to take input from the user
			System.out.println("Enter value of num1: ");
	        num1=sc.nextInt();
			System.out.println("Enter value of num2: ");
			num2=sc.nextInt();
			System.out.println(num1==num2);		// a is equal to b
			System.out.println(num1!=num2);		// a is not equal to b
			System.out.println(num1>=num2);		// a is greater than  equal to b
			System.out.println(num1<=num2);		// a is less than equal to b
			System.out.println(num1>num2);		// a is greater than b
			System.out.println(num1<num2);		// a is less than b
		}
	}