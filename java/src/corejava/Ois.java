package corejava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ois {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileInputStream f=new FileInputStream("d:/manu.txt");
	ObjectInputStream d=new ObjectInputStream(f);
	Oos oo=(Oos)d.readObject();
	System.out.println(oo.getUsername());
	System.out.println(oo.getPassword());
	System.out.println(oo.getEmail());
}
}
