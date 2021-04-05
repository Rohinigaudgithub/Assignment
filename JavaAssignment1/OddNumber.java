class OddNumber
{
public static void main(String args[])
{
	int n=200;
	System.out.println("Prints all the odd numbers between 1 and 200");
	for(int i=0;i<=n;i++)
	{
		if(i%2!=0)
			System.out.println(i+"");
	}
}
}