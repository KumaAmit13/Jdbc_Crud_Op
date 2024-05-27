import java.sql.*;


public class TestJDBSC {
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Student st=new Student();
		st.CreateDatabase();
		//st.createTable();
		/* st.Createdata(); */
		//st.readdata();
		//st.updateData();
	}

}
