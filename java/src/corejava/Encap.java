package corejava;

public class Encap {
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

private String username;
private String password;

public static void main(String args[])
{
	Encap e=new Encap();
	e.setId(123);
	e.setUsername("manusha.mukkamala@gmail.com");
	e.setPassword("1234");
	System.out.println(e.getId());
	System.out.println(e.getUsername());
	System.out.println(e.getPassword());
}
}
