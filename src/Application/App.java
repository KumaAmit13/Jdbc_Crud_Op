import java.sql.SQLException;
import java.util.Scanner;

public class App 

{
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		System.out.println("Employee mangement ");
		System.out.println("1 = Create , 2 = Update , 3 = Delete , 4 = select");
		Scanner s1 = new Scanner(System.in);
		int switchcase=s1.nextInt();
		switch(switchcase)
		{
		case 1:
		{
		
		System.out.println("Enter your Employee Id : ");
		int id=s1.nextInt();
		System.out.println("Enter your CTC ");
		int ctc=s1.nextInt();
		System.out.println("Enter your Full name ");
		String name=s1.next();
		System.out.println("");
		System.out.println("Enter your Office Email ID ");
		String email=s1.next();
		
		EmployyeData employyedata=new EmployyeData(id, name, email, ctc);
		System.out.println(employyedata.getId());
		EmpDAO e1=new EmpDAO();
		e1.Insert(employyedata);
		break;
		}
		case 2:
		{
			System.out.println("Enter your Employee Id : ");
			int id=s1.nextInt();
			System.out.println("Enter your correct name : ");
			String name=s1.next();
			EmpDAO e1=new EmpDAO();
			e1.update(id, name);
		   break;
		}
		case 3:
		{
			System.out.println("Enter your Employee Id : ");
			int id=s1.nextInt();
			EmpDAO e1=new EmpDAO();
			e1.delete(id);
			break;

		}
		case 4:
		{
			EmpDAO e1=new EmpDAO();
			e1.select();
			break;
		}
		default :
		{
			System.out.println("Enter a worng number try angian");
			break;
		}

		}
		s1.close();
			}
}
