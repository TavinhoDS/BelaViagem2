package belaviagem.dao;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class MySqlConnection {

	public Connection getConnection() {
		Connection conn = null;
			
			try {
				Class.forName("com.mysql.jdbc.Driver");		
			}catch(Exception e) {
				e.printStackTrace();
			}
			try {
				conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/BelaViagem", "root", "@Otavio15");
				
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
			
			return conn;
	}
}
