public class Tester1 {
public static void main(String[] args) 
{ 
String str = "java";
StringBuffer sb = new StringBuffer("java"); 
sb.insert(9, "programming"); 
str.concat("exercise");
if (sb.length() < 6 || str.equals("java")) 
{ 
System.out.print(sb);
}
sb.delete(2, 7); 
System.out.print(sb);
}
}
