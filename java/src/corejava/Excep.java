package corejava;

public class Excep {
	public static void main(String args[]) throws Exception
	{
		try {
			int a=10,b=0;
			int c=a+b;
			System.out.println("c="+c);
			int d=a-b;
			System.out.println("d="+d);
			int f=a/b;
			System.out.println("f="+f);
			int g=a%b;
			System.out.println("g="+g);
		}
		catch(Exception e)
		{
			System.out.println("Do not enter b value zero");
			System.out.println(e);
		}
	
	}
}
