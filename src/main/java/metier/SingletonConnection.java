package metier;


import java.sql.Connection;
import java.sql.DriverManager;

//Singleton c'est design patern
//ca pour faire la connexion a la bdd
public class SingletonConnection {
	private static Connection connection;
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection= DriverManager.getConnection
					("jdbc:mysql://localhost:3306/DB_MVC_CAT","root","");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
			
	}

	public static Connection getConnection() {
		return connection;
	}	
}