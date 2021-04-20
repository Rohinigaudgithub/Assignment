import java.util.Scanner;
class Employee2
{
public static void main(String args[])
{
	int empNo;
	String empName;
	String department;
	double salary;
	Employee[] array=new Employee[10];
	Scanner sc=new Scanner(System.in);
	for(int i=1;i<array.length;i++)
	{
	System.out.println("Enter the Employee No");
	empNo=sc.nextInt();sc.nextLine();
	
	System.out.println("Enter the Employee Name");
	empName=sc.nextLine();
	
	System.out.println("Enter the Employee Department");
	department=sc.nextLine();
	
	System.out.println("Enter the Employee Salary");
	salary=sc.nextDouble();
	}
	for(int i=1;i<array.length;i++)
	{
	
	System.out.println(empNo);
	System.out.println(empName);
	System.out.println(department);
	System.out.println(salary);
		
	}
}
}