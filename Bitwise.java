// Bitwise operators
package Operators;
import java.util.Scanner;
public class Bitwise {
		public static void main(String[] args) 
		{
			int num1,num2,result;
	        Scanner sc = new Scanner(System.in);								//scanner class to take input from the user
			System.out.println("Enter value of num1: ");
			num1 = sc.nextInt();	
			System.out.println("Enter value of num2: ");
			num2 = sc.nextInt();	
			result = (num1 & num2);              			                   //Bitwise Operations	
			System.out.println("The result of (num1&num2) is: " + result);    
			result = (num1 | num2);
			System.out.println("The result of (num1|num2) is: " + result);		
			result = (num1 ^ num2);
			System.out.println("The result of (num1^num2) is: " + result);
		}
	}