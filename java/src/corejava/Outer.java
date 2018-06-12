package corejava;

public class Outer {
int a=10;
public class Inner
{
	public void Display()
	{
	System.out.println(a);
	
}}
public static void main(String[] args) {
	

	Outer o=new Outer();
	Outer.Inner i=o.new Inner();
	i.Display();
}
}

