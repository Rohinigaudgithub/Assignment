import java.util.Scanner;
class NumberManipulator
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int num=sc.nextInt();
	
	int rev=reverseNumber(num);
	System.out.println("reversed number is "+rev);
	
	int sum=calculateSum(rev);
	System.out.println("sum of the number is "+sum);
	}
	static int reverseNumber(int num)
	{
		int rev = 0; // reversed number 
      int rem;   // remainder 
        
      while(num>0)
	  { 
           
        rem = num%10; 		
        rev = (rev*10) + rem;  
        num = num/10; 
      } 
        
      return rev; //3
    } 
	static int calculateSum(int number)
	{
		int sum=0,rem;
		while(number!=0)
		{
			rem=number%10;
			sum=sum+rem;
			number=number/10;
		}
		
		return sum;
	}
	
}
/*
3*100 + 2*10 + 1*1 =321
Method Name calculateSum
Method Description Calculates the sum of digits of three digit number
Argument int number
Return Type int – Sum of the digits of the number
Logic Separate the digits of the number and add the digits
to get the sum
*/






/*22.Create a class that contains methods for reversing a three digit number and the other for finding the
sum of digits of a three digit number.
Class Name NumberManipulator
Method Name reverseNumber
Method Description Reverses a Three digit number
Argument int number
Return Type int – Reverse of the number
Logic Digits can be separated as shown
123 %10=3 First Digit    512%10= 2
123/10=12				512/10=51
12%10=2 Second Digit	51%10=1
12/10= 1 Third Digit	51/10=5
Now the number should be reversed to 321 for
which we can multiply each digit by the place
value and add it
3*100 + 2*10 + 1*1 =321
Method Name calculateSum
Method Description Calculates the sum of digits of three digit number
Argument int number
Return Type int – Sum of the digits of the number
Logic Separate the digits of the number and add the digits
to get the sum*/
