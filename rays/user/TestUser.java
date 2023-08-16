package in.co.rays.user;

import java.text.SimpleDateFormat;

public class TestUser {
	public static void main(String[] args) throws Exception {
		//testAdd();
		testUpdate();
		
	}

	private static void testUpdate() throws Exception {
		String dob = "1998-07-15";
		 SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
			UserBean bean = new UserBean ();
			bean.setId(1);
			bean.setFirstname("Tanya");
			bean.setLastname("shakya");
			bean.setLoginId("tanya123@gmail.com");
			bean.setPassword("3214");
			bean.setDob(sdf.parse(dob));
			bean.setAddress("Bhopal");
			
					
			
			UserModel model = new UserModel();
			model.update(bean);
		
	}

	private static void testAdd() throws Exception {
		String dob = "1996-04-11";
	 SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
		
	UserBean bean = new UserBean();
	//bean.setId(1);
	bean.setFirstname("shantanu");
	bean.setLastname("shakya");
	bean.setLoginId("shan1232@gmail.com");
	bean.setPassword("1234");
	bean.setDob(sdf.parse(dob));
	bean.setAddress("Bhopal");
	
	
	UserModel model=new UserModel();
	model.add(bean);
	
	
		
	}

}
