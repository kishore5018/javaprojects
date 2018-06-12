package advance1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Scanner;

public class Task1 {

	public static void insert(Connection conn) {

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
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
			

			public static void Fetch(Connection conn) 
			{
				try
				{
					PreparedStatement pstmt=conn.prepareStatement("select * from EmpT3");
					ResultSet rs=pstmt.executeQuery();
					while(rs.next()){
						System.out.println("UserName:::"+rs.getString("username"));
						System.out.println("PassWord:::"+rs.getString(2));
						System.out.println("Email::::::"+rs.getString("email"));
						System.out.println("Id:::::::::"+rs.getInt("id"));
					}
					
				}
				catch(Exception e) 
				{
					System.out.println(e);
					
				}
				
				
			}

			public static void Update(Connection conn) 
			{
				try
				{
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter the UserName to Update:::");
					String Username=sc.next();
					PreparedStatement pstmt=conn.prepareStatement("select * from EmpT3");
					ResultSet rs=pstmt.executeQuery();
					HashSet<String> hs=new HashSet<>();
					while(rs.next()){
						hs.add(rs.getString("username"));
					}
					if(hs.contains(Username)){
						System.out.println("Record Found");
						System.out.println("Enter the Details to Update:::");
						System.out.println("Enter the username1:::");
						String username1=sc.next();
					    System.out.println("Enter The password::::");	
						String Password=sc.next();
						System.out.println("Enter the Email::::::");
						String Email=sc.next();
						System.out.println("Enter the Id:::::::::");
						int Id=sc.nextInt();
						PreparedStatement pstmt1=conn.prepareStatement("update EmpT3 set password=?,email=?,id=?where username=?");
						pstmt1.setString(1,Password);
						pstmt1.setString(2,Email);
						pstmt1.setInt(3,Id);
						pstmt1.setString(4, Username);
						
						int i=pstmt1.executeUpdate();
						if(i==1){
							System.out.println("Update Success");
						}else{
							System.out.println("Update Not Success");
						}
						
						
					}else{
						System.out.println("Record Not Found");
					
					}
					
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				
				
			}


			
			}
		
			
			

		
