/**
 * 
 */
package com.capg.vijay.lab1.exec3;
import java.util.*;
/**
 * @author a
 *
 */
public class IncreasingNumber {

	/**
	 * @param args
	 */
	static boolean checkNumber(int number){
		
		while(number>0)
		{
			int precedingNumber = number%10;
			number = number/10;
			if(precedingNumber <= number%10) {
				
				return false;}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
	System.out.println(checkNumber(number));
		
	}

}
