//Assignment operators
package Operators;
import java.util.Scanner;
public class Assignment {
		public static void main(String[] args) 
		{
			int a;
	        Scanner sc = new Scanner(System.in);//scanner class to take input from the user
			System.out.println("Enter a number: ");
	        a=sc.nextInt();
			a+=10;
			System.out.println("Result is : "+a);		
			a-=10;
			System.out.println("Result is : "+a);	
			a*=10;
			System.out.println("Result is : "+a);		
			a/=10;
			System.out.println("Result is : "+a);	
			a%=10;
			System.out.println("Result is : "+a);		
		}

	}