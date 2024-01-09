package CurdOperations;
import java.sql.*;
import java.util.Scanner;
class ecee extends Throwable
{ ecee(String s)
	{
	super(s);
	}
	}
public class updatingValues {
public static void main(String[] args) throws ClassNotFoundException, SQLException{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the table name :");
	String tab=s.nextLine();
	System.out.println("enter the changes :");
	String add=s.nextLine();
	int id=s.nextInt();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("loaded");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitels","root","M1racle@123");
		System.out.println("connected");
		PreparedStatement ps=c.prepareStatement("update "+tab+" set address=? where nurseId=?");
//		ps.setString(1,tab);
		ps.setString(1, add);
		ps.setInt(2, id);
		int a=ps.executeUpdate();
		if(a>0) System.out.println(a);
		else throw new ecee("not upadated try agian");
	} catch (ecee e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}
