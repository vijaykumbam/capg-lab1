package com.capg.vijay.assignment.StringObjectMethod;

import java.util.Scanner;

public class GenerateClass {

	public static UniqueId[] generateIdMethod(int size)
	{
		UniqueId[] uniqueIdReference=new UniqueId[size];
		for(int index=0;index<size;index++)
		{
			uniqueIdReference[index]=new UniqueId();
		}
		int holder =1;
		for(char i=65;i<size;i++)
		{
			String id = i + Integer.toString(holder);
			uniqueIdReference[holder-1].setId(id);
			holder++;
		}
		return uniqueIdReference;
	}
}
