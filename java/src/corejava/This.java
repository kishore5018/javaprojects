package corejava;

public class This {
int a=10;
public void Add()
{
	int b=20;
	System.out.println(this.a);
}
public static void main(string[] args) {
	This t=new This();
	t.Add();
	
}
}
