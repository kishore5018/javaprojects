package corejava;

public class Super1 extends Super {
public void Sub()
{
	System.out.println(super.a);
	super.Add();
	System.out.println("this is sub method");
}
public static void main(string[] args) {
	Super1 i=new Super1();
	i.Sub();
}
}
