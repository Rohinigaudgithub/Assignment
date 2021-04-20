class Object
{
static int NoOfObject=0;
{
	NoOfObject+=1;
}
Object()
{
}
Object(int n)
{
}
Object(int n,String name)
{
}
Object(int n,float t)
{
}
public static void main(String args[])
{
	Object t1=new Object();
	Object t2=new Object(10);
	Object t3=new Object(10,"rohini");
	Object t4=new Object(10,12.5f);
	System.out.println("Total no of object are created in the clase"+Object.NoOfObject);
}
}