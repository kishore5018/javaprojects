package corejava;

public class Dynam extends Dynamic {
public void Add(int a)
{
	System.out.println("this is child instance class"+a);
}
public static void Sub(int b)
{
	System.out.println("this is child static class"+b);
}
public static void main(string[] args) {
	Dynam d=new Dynam();
	d.Add(3);
	d.Sub(5);
	Dynamic d1=new Dynamic();
	d1.Add(5);
	d1.Add(7);
	Dynamic d2=new Dynam();
	d2.Add(4);
	d2.Sub(9);
	
}

}

