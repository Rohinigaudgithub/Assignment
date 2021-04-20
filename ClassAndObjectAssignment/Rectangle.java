import java.util.Scanner;
class Rectangle
{
	double length=1;
	double breath=1;
	
	double area()
	{
		return (length*breath);
	}
	public double getLength()
	{
		return length;
	}
	public void setLength(double length)
	{
		this.length=length;
	}
	public double getBreath()
	{
		return breath;
	}
	public void setBreath(double breath)
	{
		this.breath=breath;
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length");
	double len=sc.nextDouble();
	System.out.println("Enter the breath");
	double bre=sc.nextDouble();
	Rectangle t1=new Rectangle();
	t1.setLength(len);
	t1.setBreath(bre);
	System.out.println("Area of Rectangle is"+t1.area());	
}
}
 
