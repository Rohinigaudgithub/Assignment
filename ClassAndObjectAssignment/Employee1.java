class Employee1
{
	int empno;
	String name;
	String department;
	int salary[]=new int[10];
	int salary[]={10000,15000,12000,11000,25000,16000,18000,20000,8000,14000};


	public static void main(String args[])
	{
		Employee1 emp=new Employee1();
		emp.accept();
		emp.display();
	}
	
}