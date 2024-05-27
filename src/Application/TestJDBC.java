
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swing", "root", "root");
		String query = "SELECT * FROM emp WHERE emp_id = ?";
		PreparedStatement preparedStatement = con.prepareStatement(query);
		//String statment="select* from emp WHERE emp_name = 'Sumit';";
		preparedStatement.setInt(1, 1);  
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
		    int empId = resultSet.getInt("emp_id");
		    String empName = resultSet.getString("emp_name");
		    // ... process results
		    System.out.println(empName);
		}

	}

}
