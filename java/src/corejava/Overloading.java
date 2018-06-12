package corejava;

public class Overloading {
	public void Add(int a)
	{
		System.out.println(a);
	}
	public void Add(int a,int b)
	{
		System.out.println(a+" "+b);
	}
	public static void main(string[] args) {
		Overloading o=new Overloading();
		o.Add(2);
		o.Add(3,5);
	}
}
