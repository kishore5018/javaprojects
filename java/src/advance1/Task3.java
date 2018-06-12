package advance1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Scanner;
public class Task3 {
public static void Insert(Connection conn)
{
	String Username = null;
	String Password = null;
	
		try {
			PreparedStatement pstmt=conn.prepareStatement("select * from admin");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				System.out.println("UserName:::"+rs.getString("Username"));
				System.out.println("PassWord:::"+rs.getString("Password"));
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter digit::");
				int value=sc.nextInt();
				switch(value)
				{
				case 1:
				{
				
				System.out.println("Enter username1:::");
				String Username1=sc.next();
				System.out.println("Enter password1:::");
				String Password1=sc.next();
				PreparedStatement pst=conn.prepareStatement("select *from Admin1");
				
				ResultSet rst=pstmt.executeQuery();
				while(rst.next()){
					System.out.println("UserName:::"+rs.getString("username1"));
					System.out.println("PassWord:::"+rs.getString("Password1"));
					
				    
				    HashSet hs=new HashSet();
					hs.add(rst.getString(Username1));
						hs.add(rst.getString(Password1));
					
			
					
				if(hs.contains(Username1)&&hs.contains(Password1))
				{
				System.out.println("Enter Subject1 marks::::");
				int Sub1=sc.nextInt();
				System.out.println("Enter Subj2 marks:::");
				int Sub2=sc.nextInt();
				System.out.println("Enter sub3 marks:::");
				int Sub3=sc.nextInt();
				System.out.println("Enter sub4 marks:::");
				int Sub4=sc.nextInt();
				System.out.println("Enter sub5 marks:::");
				int Sub5=sc.nextInt();
				System.out.println("Enter sub6 marks::");
				int Sub6=sc.nextInt();
				int Total=(Sub1+Sub2+Sub3+Sub4+Sub5+Sub6);
				System.out.println("total="+Total);
				Float Percentage=(float) (Total/6);
				System.out.println("percentage="+Percentage);
				PreparedStatement pstms=conn.prepareStatement("insert into admin1(Sub1,sub2,sub3,sub4,sub5,sub6,Total,Percentage)values(?,?,?,?,?,?,?,?");
			
				pstms.setInt(1, Sub1);
				pstms.setInt(2, Sub2);
				pstms.setInt(3, Sub3);
				pstms.setInt(4, Sub4);
				pstms.setInt(5, Sub5);
				pstms.setInt(6, Sub6);
				pstms.setInt(7, Total);
				pstms.setFloat(8, Percentage);
				
				int i=pst.executeUpdate();
				if(i==1){
					System.out.println("Insert Success");
				}else{
					System.out.println("Insert Not Success");
				}
			}else
			{
				System.out.println("wrong details");
			}
				}
				}
				}
			}
		}
				
			
		
			catch(Exception e)
		{
			System.out.println(e);
		}




}

}
		

	
	
	

