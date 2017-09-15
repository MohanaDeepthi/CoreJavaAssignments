package day1;
import java.util.*;
public class AssignmentQ4 {
	
	public static void main(String args[]){
		//six variables as one of each byte, short, int, long, float and double
		byte byteVar;
		short shortVar;
		int intVar;
		long longVar;
		float floatVar;
		double doubleVar;
		Scanner userInput=new Scanner(System.in);
		try{
			System.out.println("Enter Value : Byte ");
			byteVar=userInput.nextByte();
			System.out.println("Enter Value : short ");
			shortVar=userInput.nextShort();
			intVar=byteVar+shortVar;
			System.out.println("Sum of byte and short is "+intVar);
			longVar=intVar+shortVar;
			System.out.println("Sum of short and int is "+longVar);
			floatVar=(float)(longVar+intVar);
			System.out.println("Sum of long and int is "+floatVar);
			doubleVar=(double)(floatVar+longVar);
			System.out.println("Sum of long and float is "+doubleVar);
			
			
		}
		catch(NumberFormatException e){
			e.printStackTrace();
		}
		finally{
			userInput.close();
		}
		
		
	}

}
