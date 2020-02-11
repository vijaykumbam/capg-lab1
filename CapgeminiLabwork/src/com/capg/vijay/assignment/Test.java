package com.capg.vijay.assignment;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of ids you want");
		Scanner sc = new Scanner(System.in);
		int noOfId = sc.nextInt();
		UniqueId obj = new GenerateIdClass(noOfId);
		//obj.generateId(22);
		//System.out.println(obj.generateId(noOfId));
	}

}
