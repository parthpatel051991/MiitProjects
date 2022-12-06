package com.miit.JDBC;

import java.sql.*;

public class DbConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/photo_store";
		String uname = "root";
		String pass = "rootpassword";
		String query ="select name from customers where id=5;";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		rs.next();
		String name=rs.getString("name");
		
		System.out.println(name);
		
		st.close();
		con.close();
		
	}

}
