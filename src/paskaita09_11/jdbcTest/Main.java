package paskaita09_11.jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	final static String connectionString = "jdbc:mysql://localhost:3306/sakila";
	static  Connection con;
	
	public static void main(String[] args) {
		read();

	}
	
	static Statement getStatement( Connection con ) throws ClassNotFoundException, SQLException {
		//Load SQL Server Driver
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        
        //Create connection to database
        con = DriverManager.getConnection( connectionString, "root", "java");
        
        // return statement from connection
        return con.createStatement();
	}
	
	static void read() {
		try {
			Statement stat = getStatement( con );
			
			String query = "SELECT * FROM city LIMIT 10";
			
			ResultSet result = stat.executeQuery( query );
			
			while( result.next()) {
				int city_id = result.getInt( 1 );
				String city = result.getString( "city" );
				
				System.out.println( "ID: " + city_id + " " + city );
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} 
	}

}
