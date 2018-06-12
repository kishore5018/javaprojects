package corejava;

import java.util.Scanner;

public class scanner {
	public static void main(string[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		System.out.println("enter b value");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println(c);
	}

}
