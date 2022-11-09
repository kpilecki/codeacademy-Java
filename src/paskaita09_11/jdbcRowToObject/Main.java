package paskaita09_11.jdbcRowToObject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;

public class Main {

	public static void main(String[] args) {
		ArrayList<Actor> actors = new ArrayList<>();
		String query = "SELECT * FROM actors_movie_count";
		JdbcConnectorService connector;
		
		try {
			connector = new JdbcConnectorService();
			
			ResultSet results = connector.makeGetQuery( query );
			
			try {
				while( results.next() ) {
					actors.add( Actor.builder()
							.firstName( results.getString( "name" ))
							.lastName( results.getString( "surname" ))
							.movieCount( results.getInt( "movie_count"))
							.build());
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			actors.forEach( System.out::println );
			
			int id = 1;
			connector.clearTable( "test" );
			
			for( var actor : actors ) {
				connector.makeInsertQuery( "INSERT INTO test (id, name, surname, movie_count)"
						+ "VALUES ("
						+ "'"
						+ id++
						+ "'"
						+", "
						+ actor 
						+");");
			}
			
		} catch (TimeoutException e1) {
			
			e1.printStackTrace();
		}
	}

}
