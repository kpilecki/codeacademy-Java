package paskaita09_11.jdbcRowToObject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeoutException;


public class JdbcConnectorService {
	protected final String databasePath = "jdbc:mysql://localhost:3306/sakila";
	protected final String user = "root";
	protected final String password = "java";
	protected Connection con;
	
	public JdbcConnectorService() throws TimeoutException {
		createConnection();
	}
	
	protected void finalize() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void createConnection() throws TimeoutException {
		int tries = 0;
		while( tries++ < 10 && con == null ) {
			try {
				con = DriverManager.getConnection( databasePath, user, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if( con == null ) {
			throw new TimeoutException( "Can't connect to the database ");
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
			return -1;
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
