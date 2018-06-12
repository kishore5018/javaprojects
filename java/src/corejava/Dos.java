package corejava;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Dos {
	public static void main(String[] args) throws IOException {
		FileOutputStream f=new FileOutputStream("D:/manu.txt");
		DataOutputStream d=new DataOutputStream(f);
		d.writeInt(25);
		d.writeShort(1);
		
	}

}
