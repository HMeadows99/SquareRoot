import java.util.Scanner;

/**
 * 
 */

/**
 * @author h.meadows
 *Mr. Hardman
 *assignment 4, program 2
 *11/16/2016
 */
public class SquareRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		double userNum;
		double userNumSquareRoot;
		
		do{
			System.out.println("Please enter a number");
			userNum = userInput.nextDouble();
			userNumSquareRoot = Math.sqrt(userNum);
			if(userNum < 0){
				System.out.println("Please enter a positive number");
			}
	
		}while(userNum < 0);
		
		System.out.println("The square root of " + userNum + " is " + userNumSquareRoot);
		
		userInput.close();
	}	
}
