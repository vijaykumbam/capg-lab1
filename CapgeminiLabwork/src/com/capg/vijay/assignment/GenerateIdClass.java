package com.capg.vijay.assignment;

public class GenerateIdClass extends UniqueId{
	int userarr[];
	public GenerateIdClass(int id) {
		
		// TODO Auto-generated constructor stub
		if(id>0)
		{
			userarr = new int[id];
			generateId(id);
		}
		else
		{
			System.out.println("Sry id's can't be created because size is below zero");
		}
	}
	
	
	static String[] generateId(int id)
	{
		System.out.println("i am in geneid method");
		String getid[] = new String[id];
		for(int i=0;i<id;i++)
		{
			getid[i] = "A"+i;
			//id = getid[i];
			
			System.out.println("The id of "+i+" is :"+getid[i]);
		}
		return getid;
	}
	

}
