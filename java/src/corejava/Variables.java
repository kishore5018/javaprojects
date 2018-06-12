package corejava;

public class Variables {
	int a=20;
	static int b=30;
	public int Add()
	{
		int c=10;
		return c;
		
	}
	public static void main(string args[])
	{
		Variables v=new Variables();
		System.out.println(v.a);
		System.out.println(b);
		System.out.println(v.Add());
	}

}
