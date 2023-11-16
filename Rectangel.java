//To find perimeter of a rectangle
package Area;
import java.util.Scanner;
public class Rectangel 
{
public static void main(String args[]) 
	   {   
	     double length,breadth,perimeter;
	     Scanner sc = new Scanner(System.in);                       //Scanner class to take input from the user
	     System.out.println("Enter the length of the Rectangle:");  
	     length= sc.nextDouble();
		 System.out.println("Enter the width of the Rectangle:");   
		 breadth= sc.nextDouble();   
	     perimeter=2*(length+breadth);                                //Formula for perimeter
		 System.out.println("perimeter of Rectangle is: " + perimeter);      
	   }
}