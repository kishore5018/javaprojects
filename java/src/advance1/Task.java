package advance1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Task {
	
		
public static void main(String[] args) throws Exception{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","manusha","manusha");

	Task1.insert(conn);
	//Task1.fetch(conn);
	//Task1.update(conn);
	//Task1.delete(conn);
}
}
