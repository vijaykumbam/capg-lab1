/**
 * 
 */
package com.capg.vijay.lab4;
import java.util.Scanner;
/**
 * @author a
 *
 */
public class Cubes {
	static int count=0;
	void getCubeMethod(int input) //54
	{
		System.out.println("i am in getCubeMethod");
		while(input>0) {       //54
			int temp = input%10;  //4
			int cube  = temp*temp*temp;//64
			count= count+cube;//64+0;
			input = input/10;//54/10=5;
		}	
		System.out.println("the sum of cubes"+count);
	}
}
