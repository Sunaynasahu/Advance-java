package in.co.rays.test;

import java.util.ResourceBundle;

public class TestBundle {
	public static void main(String[] args) {
		ResourceBundle rb =ResourceBundle.getBundle("in.co.rays.bundle.app");
		System.out.println(rb.getString("driver"));
		System.out.println(rb.getString("url"));
		System.out.println(rb.getString("user"));
	System.out.println(rb.getString("password"));	
	System.out.println(rb.getString("initial"));
	System.out.println(rb.getString("acquire"));
	System.out.println(rb.getString("maximum"));
	
	}

}
