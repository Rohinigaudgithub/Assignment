import java.util.Scanner;
class Calculator
{	
void calculateSum(int number1,int number2)
{
	System.out.print("Sum of two number is :- ");
	System.out.println(number1+number2);
}
void calculateDifference(int number1 , int number2)
{
	System.out.print("Difference of two number is :- ");
	System.out.println(number1-number2);
}
public static void main(String args[])
{
	Calculator dd = new Calculator();
	dd.calculateSum(10,20);
	dd.calculateDifference(30,20);	
}
}