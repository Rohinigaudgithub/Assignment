import java.util.Scanner;
class Circle
{
	static double calculateArea(double radius)
	{
        double pi = 3.14,area;
		area = pi * radius * radius;
        return area;
	}
    public static void main(String[] args) 
    {
        double radius;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
		radius = s.nextDouble();
		double areaofcircle=calculateArea(radius);
		System.out.println("Area of Circle is "+areaofcircle);
        
    }            
}


