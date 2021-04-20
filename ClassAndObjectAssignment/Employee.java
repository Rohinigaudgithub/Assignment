class Employee
{
	int EmpNo;
	String EmpName;
	String EmpDepartment;
	int EmpSalary;
	
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.EmpNo = 101;
        e1.EmpName = "Rohini";
        e1.EmpDepartment = "Sales Department";
		e1.EmpSalary=15000;

        Employee e2 = new Employee();
        e2.EmpNo = 102;
        e2.EmpName = "Priyanka";
        e2.EmpDepartment = "Account Department";
		e2.EmpSalary=25000;

        System.out.println("Employee No: " + e1.EmpNo);
        System.out.println("Employee Name: " + e1.EmpName);
        System.out.println("Employee Department: " + e1.EmpDepartment);
		System.out.println("Employee Salary: " + e1.EmpSalary);
        System.out.println("Employee No: " + e2.EmpNo);
        System.out.println("Employee Name: " + e2.EmpName);
        System.out.println("Employee Department: " + e2.EmpDepartment);
		System.out.println("Employee Salary: " + e2.EmpSalary);
        

    }
}
