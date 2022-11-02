package paskaita31_10.jsonParsing;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParsing {
	
	public static void readingJson() {
		String json = "{\r\n"
				+ "\"code\": \"vilnius\",\r\n"
				+ "\"name\": \"Vilnius\",\r\n"
				+ "\"administrativeDivision\": \"Vilniaus miesto savivaldybė\",\r\n"
				+ "\"country\": \"Lietuva\",\r\n"
				+ "\"countryCode\": \"LT\",\r\n"
				+ "\"coordinates\": {\r\n"
				+ "\"latitude\": 54.687046,\r\n"
				+ "\"longitude\": 25.282911\r\n"
				+ "}\r\n"
				+ "}";
		Place parsedPlace = Utils.jsonToPlace( json );
		
		System.out.println( parsedPlace );
	}
	
	public static void readingJsonFromURL() throws IOException {
		URL url = new URL("https://api.meteo.lt/v1/places");
		ArrayList<Place> places = new ArrayList<>();
		
		JsonNode node = get( url );
		List<String> cities = node.findValuesAsText( "code" );
		
//		for( String city : cities) {
//			places.add( new ObjectMapper().readValue( new URL("https://api.meteo.lt/v1/places/" + city ), Place.class));
//		}
		
		cities.stream().limit(10).forEach( city -> {
			try {
				places.add( new ObjectMapper().readValue( new URL("https://api.meteo.lt/v1/places/" + city ), Place.class));
			} catch (StreamReadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DatabindException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		places.forEach( System.out::println);
	}
	
	public static List<String> getCities( String searchTerm ){
		ArrayList<Place> places = new ArrayList<>();
		
		try {
			URL url = new URL("https://api.meteo.lt/v1/places");
			JsonNode node = get( url );
			List<String> cities = node.findValuesAsText( "code" )
					.stream()
					.filter( v -> v.contains( searchTerm ))
					.toList();
			return cities;
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static JsonNode get(URL url) throws IOException {
		
	    ObjectMapper mapper = new ObjectMapper();
	    return mapper.readTree(url);
	}
	


}
