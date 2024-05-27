import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBC 
{
	static Connection con=null;
	public Connection DB() throws SQLException, ClassNotFoundException
	{
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "root");
		return con;
	}

}
