package paskaita03_11.getForecast;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

public class WeatherApp {
	private final String GET_PLACES_URL = "https://api.meteo.lt/v1/places/";
	protected WeatherAppUI ui = new WeatherAppUI();
	
	public void run() {
		Set<String> placeNames = retrieveAllPlaces();
		String userResponse;
		
		while( true ) {
			userResponse = ui.getUserInput( Messages.GET_CITY_FROM_USER_MSG );
			
			if( placeNames.contains( userResponse.toLowerCase())) {
				if( !runForecast( userResponse )) {
					return;
				}
			} else if( userResponse.equalsIgnoreCase( "Q" )){
				ui.printExitMessage();
				return;
			} else {
				ui.printCityNotFound();
			}
		}
	}
	
	private Set<String> retrieveAllPlaces(){
		try {
			URL url = new URL( GET_PLACES_URL );
			List<Place> placeArr =  Arrays.asList( new ObjectMapper().readValue( url, Place[].class ));
			return placeArr.stream()
					.map( v -> v.getCode())
					.collect( Collectors.toSet() );
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private boolean runForecast( String name ) {
		try {
			URL url = new URL( GET_PLACES_URL 
						+ name 
						+ "/forecasts/long-term");
			Forecast forecast = new ObjectMapper().readValue( url , Forecast.class );
			String userInput;
			
			while( true ) {
				ui.printForecastMenu();
				userInput = ui.getUserInput("");
				
				switch( userInput ) {
				case "1":
					ui.printCurrentPrediction( forecast );
					break;
				case "2":
					ui.printTemperatureForecast( forecast );
					break;
				case "3":
					ui.printMinAndMaxForToday( forecast );
					break;
				case "4":
					ui.printWindDirection( forecast );
					break;
				case "P": case "p":
					return true;
				case "Q": case "q":
					return false;
				}
			}
		}  catch (Exception e) {
			return true;
		}
			
	}
}
