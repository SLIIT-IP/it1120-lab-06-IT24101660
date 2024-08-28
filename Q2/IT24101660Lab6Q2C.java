import java.util.Scanner;
public class IT24101660Lab6Q2C{
  public static void main (String[]args){
	  Scanner input = new Scanner (System.in);
	  int[] numbers = new int[10];  
        int number= 0; 
		int sum = 0;

        System.out.println("Please enter 10 numbers:");

       
        while (number < 10) {
            System.out.print("Enter number " + (number + 1) + ": ");
            numbers[number] = input.nextInt();
			sum += numbers[number];
           number=number+1; 
		   
        }

   System.out.println(" ");
        System.out.println("The numbers you entered are:");
        number = 0;  
        while (number < 10) {
            System.out.println(numbers[number] + " ");
            number=number+1;  
        }
		System.out.println(" ");
		
		double average = sum/10;
		System.out.println("Sum of the numbers:"+sum);
		System.out.println("Average of the numbers:"+average);
  }
}