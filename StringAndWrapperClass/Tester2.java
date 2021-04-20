public class Tester2 
{
public static void main(String[] args) 
{
System.out.print("1");
try 
{
return;
} 
catch (Exception e) 
{
System.out.print("2");
} 
finally 
{
System.out.print("3");
}
System.out.print("4");
}
}
