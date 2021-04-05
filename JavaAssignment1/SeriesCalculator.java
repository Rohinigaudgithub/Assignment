import java.util.Scanner;
class SeriesCalculator
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the First Term");
	int a=sc.nextInt();
	System.out.println("Enter the Common Difference");
	int d=sc.nextInt();
	System.out.println("Enter the Number of Terms");
	int n=sc.nextInt();
	int sum=calculateSum(a,d,n);
	System.out.println(sum);
}
private static int calculateSum(int a, int d, int n)
	{
	int sum=(n / 2) * (2 * a + (n - 1) * d);
	return sum;
	}
}

/*Create a class that can calculate the sum of the first n numbers of the following series
1+3+5+7+9+11……. and return the sum
Class Name SeriesCalculator
Method Name calculateSum
Method Description Calculates the sum of first n numbers
Argument int n
Return Type int – Sum
Logic Calculate the sum of the series which represents a
arithmetic progression using the formula
Sum=(n/2)*[2*a + (n-1)*d]
Where n- number of terms
 a-First term of the series (Here 1)
 d-common difference (Here 2)
*/