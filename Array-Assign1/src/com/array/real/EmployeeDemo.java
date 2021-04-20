package com.array.real;

public class EmployeeDemo
{
	public static void main(String[] args)
	{
		Employee objArray[]=new Employee[3];
		
		for(int i=0;i<objArray.length;i++)
		{
			//System.out.println(objArray[i]+ "");
			objArray[i]=new Employee();
			objArray[i].input();
		}
		for(int i=0;i<objArray.length;i++)
		{
			objArray[i]=new Employee();
			objArray[i].output();
		}
	}

}
