package paskaita03_11.getForecast;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import lombok.Data;

@Data
public class Forecast {
	protected Place place;
	protected String forecastType;
	protected String forecastCreationTimeUtc;
	protected ArrayList<ForecastTimestamp> forecastTimestamps;
    
    public ForecastTimestamp getLowestTemp() {
    	return getFilteredSortedByTempStream( false )
    			.findFirst()
    			.orElse( null ); 
    }
    
    public ForecastTimestamp getHighestTemp() {
    	return getFilteredSortedByTempStream( true )
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
    	int hour = LocalDateTime.now().getHour();
    	return getFilteredByDayStream()
    	    	.filter( v -> Integer.parseInt( v.getForecastTimeUtc().substring( 11,13 )) >= hour )
    	    	.toList();	    	
    }
    
    private Stream<ForecastTimestamp> getFilteredByDayStream(){
    	int day = LocalDateTime.now().getDayOfMonth();
    	return forecastTimestamps.stream()
    			.filter( v -> Integer.parseInt( v.getForecastTimeUtc().substring( 8, 10 )) == day);
    }
    
    private Stream<ForecastTimestamp> getFilteredSortedByTempStream(boolean reversed){
    	return getFilteredByDayStream()
    			.sorted( (a,b) -> a.getAirTemperature() > b.getAirTemperature() ? reversed ? -1 : 1 : reversed ? 1 : -1 );
    }
}
