package paskaita09_11.jdbcRowToObject;

import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ActorJdbcRepository {
	private JdbcConnectorService con;
	
	public Actor getById( int id ) {
		ResultSet result = con.makeGetQuery( "SELECT * FROM test WHERE id='" + id +"'");
		try {
			if( result.next() ) {
				return Actor.builder()
						.firstName( result.getString( "name" ))
						.lastName( result.getString( "surname" ))
						.movieCount( result.getInt( "movie_count" ))
						.id( result.getInt( "id" ))
						.build();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
