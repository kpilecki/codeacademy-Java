package paskaita09_11.jdbcRowToObject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Actor> actors = new ArrayList<>();
		String query = "SELECT * FROM actors_movie_count";
		
		ResultSet results = new JdbcConnector().makeQuery( query );
		
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

	}

}
