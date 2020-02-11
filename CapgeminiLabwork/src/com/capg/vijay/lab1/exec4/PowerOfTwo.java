/**
 * 
 */
package com.capg.vijay.lab1.exec4;
import java.io.*;
/**
 * @author a
 *
 */
public class PowerOfTwo {

	/**
	 * @param args
	 */
	static boolean checkNumber(int n) {
		if(n==0)
		{
			return false;
		}
		while(n!=1) {
			if(n%2 !=0)
				return false;
			n = n/2;
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(checkNumber(8)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
		if(checkNumber(10)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
	}

}
