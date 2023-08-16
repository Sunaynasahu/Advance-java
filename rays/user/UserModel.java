package in.co.rays.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserModel {
	
	public void add(UserBean bean) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn =	DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root");
	PreparedStatement ps = conn.prepareStatement("insert into user  values(?,?,?,?,?,?,?)")	;
	ps.setInt(1, nextPk());
	//ps.setInt(1,bean.getId());
	ps.setString(2,bean.getFirstname());
	ps.setString(3, bean.getLastname());
	ps.setString(4, bean.getLoginId());
	ps.setString(5, bean.getPassword());
	ps.setDate(6, new java.sql.Date(bean.getDob().getTime()));
	ps.setString(7,bean.getAddress());
	
int i =	ps.executeUpdate();
System.out.println("Data inserted = " + i);


		
	}
	public Integer nextPk()throws Exception{
		int pk=0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root");
		PreparedStatement ps = conn.prepareStatement("Select max(id) from user");
	ResultSet rs  =	ps.executeQuery();
	while(rs.next()) {
		pk =rs.getInt(1);
		
	   }
		
		
		return pk+1 ;
		}
	
	public void update(UserBean bean)throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root");
		PreparedStatement ps = conn.prepareStatement("update user set First_name =?, last_name =?, login_id =?, password =?, dob=?,address=? where id=?");
		ps.setString(1,bean.getFirstname());
		ps.setString(2, bean.getLastname());
		ps.setString(3, bean.getLoginId());
		ps.setString(4, bean.getPassword());
		ps.setDate(5, new java.sql.Date(bean.getDob().getTime()));
		ps.setString(6,bean.getAddress());
        ps.setInt(7,bean.getId ());
        
        int i =ps.executeUpdate();
        System.out.println("Data updated = " + i);
		
	}
	public UserBean findByPk(int id) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root");
		PreparedStatement ps =conn.prepareStatement("select * from user where id=?");
		ps.setInt(1, id);
		ResultSet rs =ps.executeQuery();
		UserBean bean= null;
		while(rs.next()) {
			bean =new UserBean();
			bean.setId(rs.getInt(1));
			bean.setFirstname(rs.getString(2));
			bean.setLastname(rs.getString(3));
			bean.setLoginId(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setDob(rs.getDate(6));
			bean.setAddress(rs.getString(7));
			
		}
		
		return bean;
		
	}


}