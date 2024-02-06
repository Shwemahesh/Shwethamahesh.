class Sample2
{
int x=10;
}
class Demo2 extends Sample2
{
void disp()
{
System.out.println("its disp");
}
}
class Tester2 extends Demo2
{
	void cool()
	{
		System.out.println("its cool");
}
}
class Mainclass2 
{
public static void main(String[] args)
{
	Demo2 d2=new Demo2();
	System.out.println(d2.x);
	d2 disp();
Tester2 t2=new Tester2();
System.out.println(t2.x);
t2.cool();

}
}
