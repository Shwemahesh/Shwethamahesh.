class Sample
{
int x=10;
}
class Demo extends Sample
{
void disp()
{
System.out.println("its disp");
}
}
class Mainclass 
{
public static void main(String[] args)
{
Demo d1=new Demo();
System.out.println(d1.x);
d1.disp();
}
}
