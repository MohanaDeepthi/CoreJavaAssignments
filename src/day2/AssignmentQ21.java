package day2;
import java.util.Scanner;
//Write a program to find the highest among the given 3 numbers.
public class AssignmentQ21 {

	public static void main(String args[]){
		
      int firstNum, secondNum, thirdNum;
      System.out.println("Enter three integers ");
      Scanner in = new Scanner(System.in);
 
      firstNum = in.nextInt();
      secondNum = in.nextInt();
      thirdNum = in.nextInt();
 
      if ( firstNum > secondNum && firstNum > thirdNum )
         System.out.println("First number is largest."+firstNum);
      else if ( secondNum > firstNum && secondNum > thirdNum )
         System.out.println("Second number is largest.");
      else if ( thirdNum > firstNum && thirdNum > secondNum )
         System.out.println("Third number is largest."+secondNum);
      else   
         System.out.println("Entered numbers are not distinct."+thirdNum);
      
      in.close();
   }
}