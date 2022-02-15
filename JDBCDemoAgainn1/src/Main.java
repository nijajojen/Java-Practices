import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws SQLException {
		Connection conObj=null;
		try {
			conObj = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javaDb","root","password");
		/*String id="1";
		
		Statement statementObj= conObj.createStatement();
		statementObj.executeUpdate("update user set phone_no='2222222222' where id= "+id);
		*/
			
			/*String id="1 or 1=1";
			String phone_no="4444444444";
			Statement statementObj= conObj.createStatement();
			statementObj.executeUpdate("update user set phone_no= "+phone_no+" where id="+id );
			*/
			
			PreparedStatement statementObj= conObj.prepareStatement("select * from user");
			ResultSet result=  statementObj.executeQuery();
			while(result.next()) {
				System.out.println(result.getInt("id")+ " "+result.getString("name"));
			}
			
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			conObj.close();
		}
		
}
}
