class Test2
{
 public static void main(String [] args)
 {
 int x= 0;
 int y= 0;
 for (int z = 0; z < 5; z++)//z=0,z=1,z=2,z=3,z=4
 {
 if (( ++x > 2 ) && (++y > 2)) //it return true when both condition are true x=1,y=0  x=2,y=0 x=3,y=1  x=4,y=2 x=5,y=3   
 {
 x++;  //x=6,y=3
 }
 }
 System.out.println(x + " " + y);
 }
}
