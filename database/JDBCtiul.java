package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCtiul {
	
	public static Connection getConnection () {
		Connection c = null ;
		try {         
		String url = "jdbc:mySQL://localhost:3306/taikhoan";	
		String user ="root";
		String pass = "" ;
		c = DriverManager.getConnection(url, user, pass);
		
		} catch (Exception e) {
		e.printStackTrace();
		}
		return c ;
	}

}
