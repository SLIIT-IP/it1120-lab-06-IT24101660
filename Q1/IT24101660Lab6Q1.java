import java.util.Scanner;
public class IT24101660Lab6Q1{
 public static void main (String []args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the number:");
	int number = input.nextInt();
	System.out.println(" ");
	
	double square = Math.pow(number,2);
	System.out.println("The square of "+number+" is :"+square);
	
	double squareRoot = Math.sqrt(number);
	System.out.print("The square Root of"+number+" is :"+squareRoot);
 }
}