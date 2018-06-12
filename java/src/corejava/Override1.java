package corejava;

public class Override1 extends Override {
public void Add(int a,int b)
{
	System.out.println(a+" "+b);
}
public static void main(string[] args) {
	Override1 o=new Override1();
	o.Add(2,3);
	o.Add(5, 6);
}
}
