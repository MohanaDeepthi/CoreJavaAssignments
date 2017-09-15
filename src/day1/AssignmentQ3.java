package day1;
import java.util.Scanner;

public class AssignmentQ3 {
	
	public static void main(String args[]){
		System.out.println("Please enter two byte numbers !!");
		byte byteNum1,byteNum2;
		Scanner userInput=new Scanner(System.in);
		try{
						
			byteNum1=userInput.nextByte();
			byteNum2=userInput.nextByte();
			
			System.out.println("Bitwise AND Result  :"+(byteNum1&byteNum2));
			boolean myBool1 = (byteNum1!=0);
			boolean myBool2= (byteNum2!=0);
			System.out.println("Logical AND Result :"+((myBool1)&&(myBool2)));
				
		
		}
		catch(NumberFormatException e){
			e.printStackTrace();
		}
		finally{
			userInput.close();
		}
		
		
	}
	

}
