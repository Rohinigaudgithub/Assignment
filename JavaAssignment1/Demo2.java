class Demo2
{
public static void main(String[] args) {
int j = 10;
switch (1) {
case 20:
j += 1; //10+1=11
case 40:
j += 2; // 11+2=13
case 0:
j += 4; //13+4=17
}
default:
j += 3; //13+3=16
System.out.print(j);
}
}