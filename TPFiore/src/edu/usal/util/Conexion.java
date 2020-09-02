package edu.usal.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import edu.usal.util.PropertiesUtil;
public class Conexion {
	
	public static Connection getConnection() {
		
		Connection con=null;
		
		try {
			
			Class.forName(PropertiesUtil.getDriver());
		}catch(ClassNotFoundException e) {
		
	}
		try {
			con=DriverManager.getConnection(PropertiesUtil.getUrl(),PropertiesUtil.getUser(),PropertiesUtil.getPassword());
		
		}catch (SQLException e) {
			e.printStackTrace();
		}
       
		return con;
}
}
