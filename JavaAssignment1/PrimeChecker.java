import java.util.Scanner;
class PrimeChecker
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int num=sc.nextInt();
	int sum=checkPrime(num);
	System.out.println(sum);
}
private static int checkPrime(int num)
{
	int rev = 0; 
      int rem;
	  int temp=num;
      while(num>0)
	  {    
        rem = num%10; 		
        rev = rev*10 + rem;  
        num = num/10; 
      } 
	  if(temp==rev)
	  {
		  System.out.println("Number is Palindrome");
	  }
	  else 
	  {
		  System.out.println("Number is not Palindrome");
	  }
        
      return rev; 
    } 
}