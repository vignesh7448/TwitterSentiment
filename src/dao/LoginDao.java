package dao;

import java.sql.*;

import bean.UserBean;

public class LoginDao {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public UserBean login(String un, String pass) {

		UserBean bean = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/twitter", "root", "admin");
			ps = con.prepareStatement("select * from user where email=? and password=?");
			ps.setString(1, un);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			if (rs.next()) {
				bean = new UserBean();
				bean.setName(rs.getString("name"));
				bean.setEmail(rs.getString("email"));
				bean.setValid(true);
				return bean;

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return new UserBean();
	}

	public boolean register(UserBean bean) {
		boolean f = false;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/twitter", "root", "admin");
			ps = con.prepareStatement("insert into user values (?,?,?)");
			ps.setString(1, bean.getName());
			ps.setString(2, bean.getEmail());
			ps.setString(3, bean.getPassword());
			int i = ps.executeUpdate();

			if (i > 0) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
