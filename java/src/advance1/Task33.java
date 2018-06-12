package advance1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Task33 {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","manusha","manusha");

	Task3.Insert(conn);
	}
}
