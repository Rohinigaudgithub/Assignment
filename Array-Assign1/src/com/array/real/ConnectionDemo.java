package com.array.real;

import java.util.Scanner;

public class ConnectionDemo {
	public static Connection[]array;
	public static void main(String[] args) {
		System.out.println("ConnectionDemo.main()");
		 array=new Connection[3];
		int custId=0;
		int customerId=0;
		//scanner class object
		Scanner sc=new Scanner(System.in);		
		for (int i = 0; i <array.length; i++) {
			System.out.print("Enter connection id\t: ");
			 custId=sc.nextInt();
			System.out.print("Enter customer id\t: ");
			customerId=sc.nextInt();	
			System.out.print("Enter Customer Email \t: ");
			String email=sc.nextLine();sc.nextLine();
			System.out.print("Enter Customer balance\t: ");
			double balance=sc.nextDouble();  
			//Connection array[i]=new Connection(custId,customerId,email,balance);
			array[i]=new Connection(custId,customerId,email,balance);
			
		}//for
		System.out.println("Enter the customer id you want to know the average");
		int x=sc.nextInt();
		
		System.out.println(getAverageBalance(array,x));
	}//main
	
	public static double getAverageBalance(Connection con[], int custmerId) {
		//b.logic
		double avg=0.0;
		int count=0;
		for (int i = 0; i < 3; i++)
		{
		
		if(con[i].getCustomerid()==custmerId)	
				
		{
		avg=avg+con[i].getBalance();
		count++;
		}
		}
		avg=avg/count;
		
		
		
		return avg;
				
	}
	
}//class
