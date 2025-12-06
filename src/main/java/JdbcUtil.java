import java.sql.*;

public class JdbcUtil {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
			}
		System.out.println("Driver is Registered");
		}
	public static Connection getDBConnection() throws SQLException{
		String url="jdbc:mysql://localhost:3306/MySQL80";
		String userName ="root";
		String password="sai123";
		
		return DriverManager.getConnection(url, userName, password);
	}
	
	public static void closeResource(Connection connect, Statement stmt) throws SQLException
	{
		if(connect!=null) {
			connect.close();
		}
		if(stmt!=null) {
			stmt.close();
		}
	}

}
