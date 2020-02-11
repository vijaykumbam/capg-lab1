/**
 * 
 */
package com.capg.vijay.lab1.exec2;
import java.util.*;
/**
 * @author a
 *
 */
public class CalculateDifference {

	/**
	 * @param args
	 */
	static int calculateDifference(int n) {
		int sqofNumber = (n*(n+1)*(2*n+1))/6;
		System.out.println(sqofNumber);
		
		int numofSq= ((n*(n+1))/2)*((n*(n+1))/2);
		System.out.println(numofSq);
		
		int caldiff =  sqofNumber - numofSq;
		System.out.println(caldiff);
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		calculateDifference(n);
	}

}
