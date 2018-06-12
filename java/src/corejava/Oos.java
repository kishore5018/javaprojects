package corejava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Oos implements Serializable{
 String getUsername() {
		return Username;
	}
	private void setUsername(String username) {
		Username = username;
	}
	String getPassword() {
		return Password;
	}
	private void setPassword(String password) {
		Password = password;
	}
	String getEmail() {
		return Email;
	}
	private void setEmail(String email) {
		Email = email;
	}
private String Username;
private String Password;
 private String Email;
public static void main(String args[]) throws IOException
{
	Oos o=new Oos();
	o.setUsername("manu");
	o.setEmail("manusha.mukkamala@gmail.com");
	o.setPassword("123");
	FileOutputStream f=new FileOutputStream("d:/manu.txt");
	ObjectOutputStream oo=new ObjectOutputStream(f);
	oo.writeObject(o);
}
	
}