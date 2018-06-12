package corejava;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Dis {
public static void main(String[] args) throws IOException {
	FileInputStream f=new FileInputStream("D:/manu.txt");
	DataInputStream d=new DataInputStream(f);
	System.out.println(d.readInt());
	System.out.println(d.readShort());
	
}
}
