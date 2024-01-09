package CurdOperations;
import java.sql.*;
import java.util.Scanner;
public class creatingTable {
public static void main(String[] args) {
	try {

  Class.forName("com.mysql.cj.jdbc.Driver");
  System.out.println("Loaded");
  String url="jdbc:mysql://localhost:3306/hospitels";
  String usr="root";
  String password="M1racle@123";
  Connection c=DriverManager.getConnection(url,usr,password);
  System.out.println("connected");
  PreparedStatement s1=c.prepareStatement("create table Nurse(nurseId int,nurseName varchar(29))");

 boolean d= s1.execute();
 System.out.println(d);
}
catch(Exception e) {
	System.out.println(e);
}	
}

}
