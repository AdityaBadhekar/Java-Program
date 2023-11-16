//Logical operators
package Operators;
import java.util.Scanner;
public class Logical{
		public static void main(String[] args) 
		{
			int a,b;
		 	Scanner sc = new Scanner(System.in);
			System.out.println("Enter value of a: ");
	        a=sc.nextInt();
			System.out.println("Enter value of b: ");
			b=sc.nextInt();
			System.out.println(a>b && b>a);		 
			System.out.println((a>b)||(b>a));	
			System.out.println(!(a>b)&&(b>a));	
		}
}
