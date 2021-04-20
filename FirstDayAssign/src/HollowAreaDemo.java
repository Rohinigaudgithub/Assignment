import java.util.Scanner;
public class HollowAreaDemo {
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Ënter the outer Radius of ball");
	double outerRadius = sc.nextDouble();
	System.out.println("Ënter the inner Radius of ball");
	double innerRadius = sc.nextDouble();
	double hollowarea=calculateHollowArea(outerRadius, innerRadius);
	
}
	public static double calculateHollowArea(double outerRadius, double innerRadius)
	{
		double hollowarea=0;
		
		hollowarea=(4.0/3.0)*3.14*(outerRadius*outerRadius*outerRadius)-(4.0/3.0)*3.14*(innerRadius*innerRadius*innerRadius);
		
		System.out.format("Hollow area of ball : %.2f", hollowarea);
		//System.out.println(hollowarea);
		return innerRadius;
		
	}
	
}
