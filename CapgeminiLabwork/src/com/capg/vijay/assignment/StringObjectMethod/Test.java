package com.capg.vijay.assignment.StringObjectMethod;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int size  = sc.nextInt();
		if(size<26)
		{
			UniqueId [] uniqueIdReference = generateIdMethod(size);
			for(int i=0;i<size;i++)
			{
				System.out.println(uniqueIdReference[i].getId());
			}
		}
		else
		{
			System.out.println("limit exceded");
		}
	}

	private static UniqueId[] generateIdMethod(int size) {
		// TODO Auto-generated method stub
		return null;
	}

}
