package corejava;

public class Cons {
public void Cons()
{
	System.out.println("constructor");
}
public void Add()
{
	System.out.println("instance method");
}
public static void Sub()
{
	System.out.println("static method");
}
public static void main(string[] args) {
	Sub();
	Cons c=new Cons();
	c.Add();
}
}
