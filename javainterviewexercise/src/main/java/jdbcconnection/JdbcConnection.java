package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class JdbcConnection {

	public static void main(String[] args) throws Exception {
		Connection connObj = null;
		try {
			//System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
			connObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","NijaBinoy");
			Statement stmnt = connObj.createStatement();
			ResultSet rs = stmnt.executeQuery("SELECT * FROM sys.User");
			while( rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
			
		}
		
		catch(Exception ex) {
			System.out.println("sql exception or class not found ");
		}
		
		finally {
			if (connObj != null) {
				connObj.close();
			}
		}
	}

}
