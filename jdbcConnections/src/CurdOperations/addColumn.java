package CurdOperations;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Scanner;
public class addColumn {
public static void main(String[] args) {
	try {
//		Scanner s=new Scanner(System.in);
//		String table=s.next();
//		String column=s.next();
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("loaded");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitels","root","M1racle@123");
		System.out.println("connected");
		PreparedStatement p=c.prepareStatement("alter table Nurse add column address varchar(30)");
//	        p.setString(1, table);
//	        p.setString(2, column);
	       int a=p.executeUpdate();
	       System.out.println(a);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}
