package paskaita31_10.jsonParsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Utils {
	
	public static Place jsonToPlace( String json ) {
		ObjectMapper om = new ObjectMapper();
		try {
			Place place = om.readValue( json , Place.class );
			return place;
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
		}
		return null;
	}

}
