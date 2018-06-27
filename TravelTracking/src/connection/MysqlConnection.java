package connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class MysqlConnection {

	public Connection DBConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			
			System.out.println("Mysql Diriver bulunamad� hatas� !"+e);

		}
		  Connection connection = null;
		
		try {
			connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/traveltracking", "root", "kadirsen");
			System.out.println("Ba�lant� ba�ar�l� bir �ekilde sa�land�.");
			return connection;
		} catch (SQLException e) {
			System.out.println("Veri taban�na ba�lanamad�  !"+e);
			
		}
		return connection;
		
	}
}
