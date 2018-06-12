package corejava;

public class Inter implements itr,itr2 {
public void Add()
{
	System.out.println("this is add pgm");
}
public void Sub()
{
	System.out.println("this is sub pgm");
}
public static void main(string[] args) {
	Inter i=new Inter();
	i.Add();
	i.Sub();
}
}
