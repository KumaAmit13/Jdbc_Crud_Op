import java.sql.*;
public class Student {

	public void CreateDatabase() throws ClassNotFoundException, SQLException 
	{
		// TODO Auto-generated method stub
		//load Drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
		//connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
		//satemanet
		Statement smt=con.createStatement();
		//quary
		String quary="Create database Test123";
		smt.executeUpdate(quary);
		System.out.println("create suuecssfully");
		

	}

	public void createTable() throws ClassNotFoundException, SQLException {
				
		
	}

	public void Createdata() throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		//connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Test12", "root", "root");
		//satemanet
		String quary="insert into student(SId, SName, SEmail) values(?,?,?)";

		PreparedStatement psmt=con.prepareStatement(quary);
		psmt.setInt(1, 11);
		psmt.setString(2, "Amit kumar");
		psmt.setString(3, "Amitkumar@gmail.com");

		//quarynsert
				psmt.executeUpdate();
		System.out.println("data insertedd create suuecssfully");
		
	}

	public void readdata() throws ClassNotFoundException, SQLException 
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Test12", "root", "root");
		//statemanet
		String quary="Select * from student";

		Statement smt=con.createStatement();
		
		//quarynsert
				ResultSet rs = smt.executeQuery(quary);
				while(rs.next())
				{
					System.out.println(" id = "+ rs.getInt(1));
					System.out.println(" name = "+ rs.getString(2));
					System.out.println(" email = "+ rs.getString(3));
					System.out.println("  ");
				}
		System.out.println("data read  suuecssfully");
	}

	public void updateData() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Test12", "root", "root");
		//satemanet
		String quary="update student set SId = ? where SName = ?";

		PreparedStatement psmt=con.prepareStatement(quary);
		psmt.setInt(1, 1);
		psmt.setString(2, "Amit");
		//psmt.setString(3, "Amitkumar@gmail.com");

		//quarynsert
				int x=psmt.executeUpdate();
		System.out.println("data insertedd create suuecssfully"+x);		
	}

}
