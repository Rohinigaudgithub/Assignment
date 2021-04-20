package com.array.real;
import java.util.Scanner;
public class Employee 
{		
		int empNo;
		String empName;
		String department;
		double salary;
		
   public void input()
   {
	   Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee No");
		this.empNo=sc.nextInt();sc.nextLine();
	
		System.out.println("Enter the Employee Name");
		this.empName=sc.nextLine();
		
		System.out.println("Enter the Employee Department");
		this.department=sc.nextLine();
		
		System.out.println("Enter the Employee Salary");
		this.salary=sc.nextDouble();
	
   }
	public void output()
	{
		System.out.println(empNo);
		System.out.println(empName);
		System.out.println(department);
		System.out.println(salary);
		
   }

}
