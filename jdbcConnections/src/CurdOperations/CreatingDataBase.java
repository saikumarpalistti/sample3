package CurdOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class excep extends Throwable
{
  excep(String s)
  {
	  super(s);
  }
}
public class CreatingDataBase {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("loaded");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","M1racle@123");
		System.out.println("connected");
		Statement s=c.createStatement();
		boolean a=s.execute("create database hospitels");
		
		System.out.println("sucess");
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
}
}
