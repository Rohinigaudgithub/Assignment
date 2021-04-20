import java.util.Scanner;
public class SalaryDemo {
	public static void main(String args[])
	{
		double basic=0,hra,da,insurance,pf,gross,net;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic Salary");
		double basic1 = sc.nextDouble();
		hra = 0.2 * basic1;
		System.out.println("Total HRA of Basic Salary");
		System.out.println(hra);
		da = 0.1 * basic1;
		System.out.println("Total DA of Basic Salary");
		System.out.println(da);
		insurance = 0.15 * basic1;
		System.out.println("Total Insurance of Basic Salary");
		System.out.println(insurance);
		pf = 0.25 * basic1;
		System.out.println("Total PF of Basic Salary");
		System.out.println(pf);
	
		gross = basic1+hra+da+pf+insurance;
		System.out.println("Total Gross Salary");
		System.out.println(gross);
		net = gross-pf-insurance;
		System.out.println("Total On Hand Salary");
		System.out.println(net);
	}
}
