class Sample1
{
int x=10;
}
class Demo1 extends Sample1
{
void disp()
{
System.out.println("its disp");
}
}
class Tester1 extends Demo1
{
	void cool()
	{
		System.out.println("its cool");
}
}
class Mainclass1 
{
public static void main(String[] args)
{
Tester1 t1=new Tester1();
System.out.println(t1.x);
t1.cool();
t1.disp();
}
}
