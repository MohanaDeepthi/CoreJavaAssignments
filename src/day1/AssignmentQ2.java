package day1;
import java.util.*;

public class AssignmentQ2 {
	
public static void main(String args[]){
		
		System.out.println("Please enter Numbers to add");
		int firstNum=0;
		int secNum=0;
		int outputNum=0;
		@SuppressWarnings("resource")
		Scanner inpScan = new Scanner(System.in);
		try{
		firstNum=inpScan.nextInt();
		secNum=inpScan.nextInt();
		outputNum=addIterative(firstNum,secNum);
		System.out.println("Sum of given numbers :"+outputNum);
		}catch(InputMismatchException exception){
			exception.printStackTrace();
		}
		
		
	}
	
	public static int addIterative(int firstNum, int secondNum){ 
        while (secondNum != 0){
            int carry = (firstNum & secondNum) ; 
          
            firstNum = firstNum ^secondNum; //SUM of two bits is A XOR B
          
            secondNum = carry << 1; //shifts carry to 1 bit to calculate sum
        }
        return firstNum;
    }
	
}



