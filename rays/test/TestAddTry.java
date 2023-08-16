package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestAddTry {
	public static void main(String[] args) throws Exception{
		Connection conn = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root");
		 conn.setAutoCommit(false);
	Statement stmt =conn.createStatement();
	int i = stmt.executeUpdate("insert into marksheet values(17,'Rashmi',112,56,87,67)");
	 i= stmt.executeUpdate("insert into marksheet values(18,'Rashmika',114,66,67,47)");
	i = stmt.executeUpdate("insert into marksheet values(19,'Anamika',115,76,81,60)");
	 i= stmt.executeUpdate("insert into marksheet values(19,'Aman',115,36,47,59)");
	

		System.out.println("Data inserted = " + i);
		conn.commit();
		
		
	} catch (Exception e) {
		conn.rollback();
		System.out.println(e);
	
	}
		
	}
		
		
	}


