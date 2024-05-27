import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpDAO 
{
	DBC con=new DBC();

	public void Insert(EmployyeData ed) throws SQLException, ClassNotFoundException
	{
		DBC con=new DBC();
		Connection can=con.DB();
		
		PreparedStatement st = can.prepareStatement(Quarry.insert);
		//st.executeUpdate();
		System.out.println();
		
		st.setInt(1, ed.getId());
		st.setString(2 , ed.getName());
		st.setString(3, ed.getEmail());
		st.setInt(4, ed.getCtc());
		int i =st.executeUpdate();
		if(i!=0)
		{
			System.out.println(i+" data suceesfully insetred ");
		}
	}
	public void update(int id,String name) throws ClassNotFoundException, SQLException
	{
		DBC con = new DBC();
		Connection can =con.DB();
		PreparedStatement pst=can.prepareStatement(Quarry.update);
		pst.setString(1, name);
		pst.setInt(2, id);
		int resulte=pst.executeUpdate();
		if(resulte !=0 )
		{
			System.out.println(resulte+" data Update");
		}
		
	}
	public void delete(int id) throws ClassNotFoundException, SQLException
	{
		Connection can=con.DB();
		PreparedStatement pst=can.prepareStatement(Quarry.delete);
		pst.setInt(1, id);
		int i=pst.executeUpdate();
		if(i!=0)
		{
			System.out.println(i+" data suceesfully delete ");
		}
		can.close();
		
	}
	public void select() throws ClassNotFoundException, SQLException
	{
		Connection can = con.DB();
	Statement pst = can.createStatement();
	ResultSet st=pst.executeQuery(Quarry.select);
	while(st.next())
	{
	  int id=st.getInt(1);
	  String name=st.getString(2);
	  String email=st.getString(3);
	  int ctc=st.getInt(4);
	  System.out.println(id+"\n"+name+"\n"+email+"\n"+ctc);
	}
	}

}
