package advance1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Crud {

	public static void insert() {

		try{
			System.out.println("Insert Operation");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the UserName::::::");
			String username=sc.next();
			System.out.println("Enter the PassWord::::::");
			String password=sc.next();
			System.out.println("Enter the Email:::::::::");
			String email=sc.next();
			System.out.println("Enter the Id::::::::::::");
			int id=sc.nextInt();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","manusha","manusha");
			PreparedStatement pstmt=conn.prepareStatement("insert into emp (username,password,email,id) values(?,?,?,?)");
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			pstmt.setString(3, email);
			pstmt.setInt(4, id);
			int i=pstmt.executeUpdate();
			if(i==1){
				System.out.println("Insert Success");
			}else{
				System.out.println("Insert Not Success");
			}
			
			
			
			
		}catch(Exception e){
			System.out.println(e);
		}
		

	
		
		
	}

}
