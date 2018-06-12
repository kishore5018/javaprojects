package corejava;

public class Hash {
int a=10,b=20;


public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + a;
	result = prime * result + b;
	return result;
}


public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Hash other = (Hash) obj;
	if (a != other.a)
		return false;
	if (b != other.b)
		return false;
	return true;
}
public static void main(String[] args) {
	String str="hai";
	String str1="hello";
	System.out.println(str.hashCode());
	System.out.println(str1.hashCode());
	Hash h=new Hash();
	Hash h1=new Hash();
	System.out.println(h.a);
	System.out.println(h1.b);
	System.out.println(h.hashCode());
	System.out.println(h1.hashCode());
	
}
}
