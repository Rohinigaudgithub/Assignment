import java.util.Scanner;
public class Person
{
String FirstName;
String LastName;
Person(String FirstName,String LastName)
{
	this.FirstName=FirstName;
	this.LastName=LastName;
}
public String toString()
{
	//return String.format(FirstName+LastName);
	return FirstName+" "+LastName;
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the First name");
	String FirstName=sc.nextLine();
	System.out.println("Enter the Last name");
	String LastName=sc.nextLine();
	Person name=new Person(FirstName,LastName);
	System.out.println(name);
}
}