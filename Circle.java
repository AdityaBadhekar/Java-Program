package Area;
import java.util.Scanner;
public class Circle {
public static void main(String[] args) 
{
	    Scanner sc = new Scanner(System.in);                    //scanner class to take input from the user
		double pi = 3.142,radius,area,circumference;
        System.out.println("Enter Radius of a circle=");
		radius=sc.nextInt();
		area= pi * radius * radius;                            // Formula for the area of the circle
		System.out.println("Area of circle is :" + area);
        circumference= pi*2*radius;                           // Formula for the circumference of the circle
        System.out.println("The circumference of the circle is: "+circumference); 
		}	
}