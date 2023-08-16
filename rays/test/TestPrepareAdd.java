package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestPrepareAdd {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root");
	PreparedStatement ps =	conn.prepareStatement("insert into marksheet values(16,'rakhi',116,98,95,92)");
	//PreparedStatement ps =	conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
	
//	ps.setInt(1, 17);
//	ps.setString(2,"janki");
//	ps.setInt(3, 117);
//	ps.setInt(4, 78);
//	ps.setInt(5, 57);
//	ps.setInt(6, 77);

	int i =ps.executeUpdate();
	System.out.println("Data inserted " + i);
	
		
		
	}

}
