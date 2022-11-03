package paskaita03_11.getForecast;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Forecast {
	public Place place;
	public String forecastType;
	public String forecastCreationTimeUtc;
	public ArrayList<ForecastTimestamp> forecastTimestamps;
    
    public ForecastTimestamp getLowestTemp() {
    	int day = LocalDateTime.now().getDayOfMonth();
    	return forecastTimestamps.stream()
    			.filter( v -> Integer.parseInt( v.getForecastTimeUtc().substring( 8, 10 )) == day)
    			.sorted( (a,b) -> a.getAirTemperature() > b.getAirTemperature() ? 1 : -1 )
    			.findFirst()
    			.orElse( null ); 
    }
    
    public ForecastTimestamp getHighestTemp() {
    	int day = LocalDateTime.now().getDayOfMonth();
    	return forecastTimestamps.stream()
    			.filter( v -> Integer.parseInt( v.getForecastTimeUtc().substring( 8, 10 )) == day)
    			.sorted( (a,b) -> a.getAirTemperature() > b.getAirTemperature() ? -1 : 1 )
    			.findFirst()
    			.orElse( null ); 
    }
    
    public ForecastTimestamp getCurrentForecast() {
    	String currHour = String.valueOf( LocalDateTime.now().getHour() ) ;
    	return forecastTimestamps.stream()
	    	.filter( v -> v.getForecastTimeUtc().substring( 11,13 ).equals( currHour ))
	    	.findAny()
	    	.orElse( null );
    }
    
    public List<ForecastTimestamp> getAllTodaysTimestamps(){
    	int day = LocalDateTime.now().getDayOfMonth();
    	int hour = LocalDateTime.now().getHour();
    	return forecastTimestamps.stream()
    	    	.filter( v -> Integer.parseInt( v.getForecastTimeUtc().substring( 11,13 )) >= hour 
    	    	&& Integer.parseInt( v.getForecastTimeUtc().substring( 8, 10 )) == day )
    	    	.toList();
    	    	
    }
}
