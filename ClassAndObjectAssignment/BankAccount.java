import java.util.Scanner;
class BankAccount
{
	int AccNo;
	float Balance;
	String AccountType,Name;
	void details(int an, float b, String at, String n)
	{
		AccNo=an;
		Balance=b;
		AccountType=at;
		Name=n;
	}
	void show()
	{
		System.out.println(AccNo+" "+Balance+" "+AccountType+" "+Name);
	}
	void deposit(float b)
	{
		Balance+=b;
		System.out.println("Deposit Value"+b);
	}
	void withdrawl(float b)
	{
		if(Balance<b)
			System.out.println("Insufficient balance");
		else
			Balance-=b;
		System.out.println("Withdrawl Amount"+b);
	}
	void checkBalance()
	{
		System.out.println("Balance is "+Balance);
	}
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);
		BankAccount t1=new BankAccount();
		t1.details(12584,15000,"saving","Rahul");
		t1.show();
		t1.deposit(10000);
		t1.checkBalance();
		t1.withdrawl(5000);
		t1.checkBalance();
	}
}