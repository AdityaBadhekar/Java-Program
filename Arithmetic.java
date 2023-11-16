//Operations for Arithmetic operators
package Operators;
import java.util.*;
public class Arithmetic

{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);//scanner class to take input from the user
	        int num1,num2;
	        System.out.println("enter two numbers=");
	        num1= sc.nextInt();
	        num2= sc.nextInt();
	        System.out.println("Addition of  two numbers"+(num1+num2));//for addition
	        System.out.println("Subtraction of  two numbers"+(num1-num2));//for subtraction
	        System.out.println("Multiplication of  two numbers"+(num1*num2));//for multiplication
	        System.out.println("Division of  two numbers"+(num1/num2));//for division
	        System.out.println("Mode of  two numbers"+(num1%num2));//for mode

	    }
	}