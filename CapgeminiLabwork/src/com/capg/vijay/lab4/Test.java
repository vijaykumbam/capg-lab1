/**
 * 
 */
package com.capg.vijay.lab4;
/**
 * @author a
 *
 */
import java.util.*;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cubes obj = new Cubes();
		System.out.println("enter the number to make cube");
		Scanner sc= new Scanner(System.in);
		int input = sc.nextInt();
		int userInput = sc.nextInt();
		obj.getCubeMethod(input);
		
		
		SumOfCubes obj1 = new SumOfCubes();
		obj1.cubeMethod(userInput);
	}

}

