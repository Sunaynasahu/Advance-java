package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestSelect {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root");
	Statement stmt= conn.createStatement();
	ResultSet rs= stmt.executeQuery("select * from marksheet ");
	while(rs.next()) {
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		//System.out.println(rs.getInt(3));
		//System.out.println(rs.getInt(4));
		//System.out.println(rs.getInt(5));
		//System.out.println(rs.getInt(6));
	}
		
	}

}
