package CurdOperations;
import java.sql.*;
import java.util.Scanner;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;
public class insertingValues {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the data :");
	String name=s.nextLine();
	String add=s.nextLine();
	int  id=s.nextInt();
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("loded");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitels","root","M1racle@123");
		PreparedStatement p=c.prepareStatement("insert into Nurse values(?,?,?)");
		p.setInt(1, id);
		p.setString(2,name);
		p.setString(3, add);
		int a=p.executeUpdate();
		System.out.println(a);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}
