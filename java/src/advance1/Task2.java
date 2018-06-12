package advance1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Task2 {

	public static void update(Connection conn) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter username that is to be updated:::");
			String Un=sc.next();
			//System.out.println("Enter password to update:::");
			//String Password=sc.next();
			//System.out.println("Enter Email to update:::");
			//String Email=sc.next();
			//System.out.println("Enter Id to update:::");
			//int Id=sc.nextInt();
			PreparedStatement pst=conn.prepareStatement("select *from emp");
			ResultSet rs=pst.executeQuery();
			HashSet<String> hs=new HashSet<>();
			while(rs.next())
			{
				hs.add(rs.getString("Username"));
				hs.add(rs.getString("password"));
				hs.add(rs.getString("Email"));
				//hs.add(rs.getInt(Id));
			
			}
			if(hs.contains(Un)) 
			{
			System.out.println("Record found");
			
			System.out.println("Enter username to update:::");
			String User=sc.next();
			System.out.println("Enter password to update:::");
			String Password=sc.next();
			System.out.println("Enter Email to update:::");
			String Email=sc.next();
			System.out.println("Enter id to update:::");
			int Id=sc.nextInt();
			PreparedStatement pstm=conn.prepareStatement("update emp  set Username=?,password=?,Email=?,Id=? where Username=?"  );
			pstm.setString(1,User);
			pstm.setString(2, Password);
			pstm.setString(3, Email);
			pstm.setInt(4, Id);
			pstm.setString(5, Un);
			
			int i=pstm.executeUpdate();
			if(i==1)
			{
				System.out.println("update success");
			}
			else
			{
				System.out.println("update not success");
			}
		}
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}

	private static Object setInt(int i, int id) {
		// TODO Auto-generated method stub
		return null;
	}
		
	}


