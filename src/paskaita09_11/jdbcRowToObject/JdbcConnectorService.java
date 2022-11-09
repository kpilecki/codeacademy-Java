package paskaita09_11.jdbcRowToObject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectorService {
	private final String databasePath = "jdbc:mysql://localhost:3306/sakila";
	private final String user = "root";
	private final String password = "java";
	private Connection con;
	
	public JdbcConnectorService() {
		createConnection();
	}
	
	protected void finalize() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void createConnection() {
		try {
			con = DriverManager.getConnection( databasePath, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private Statement getStatement() {
		try {
			return con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ResultSet makeGetQuery( String query ) {
		try {
			return getStatement().executeQuery( query );
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public int makeInsertQuery( String query ) {
		try {
			return getStatement().executeUpdate( query );
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public void clearTable( String table ) {
		try {
			getStatement().executeUpdate( "DELETE FROM " + table );
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
