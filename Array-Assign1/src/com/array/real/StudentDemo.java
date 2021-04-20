package com.array.real;

import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
		int rollNo;
		String name;
		double marks;
		Student[] array = new Student[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
		System.out.println("Enter the Student Roll No");
		rollNo=sc.nextInt();sc.nextLine();
		System.out.println("Enter the Student Name");
		name=sc.nextLine();
		System.out.println("Enter the Student Marsk");
		marks=sc.nextDouble();
		
		}
	}
	public static Student splitStudentArray(Student[] student)
	{
		return null;
	}

}
