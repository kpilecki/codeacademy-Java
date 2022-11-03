package paskaita03_11.getForecast;

import java.util.List;
import java.util.Scanner;

public class WeatherAppUI {
	protected final static Scanner sc = new Scanner( System.in );

	public String getUserInput( String msg ) {
		System.out.println( msg );
		return sc.nextLine() ;
	}

	public void printExitMessage() {
		System.out.println( Messages.EXIT_MSG );
	}

	public void printCityNotFound() {
		System.out.println( Messages.CITY_NOT_FOUND_ERR_MSG );
	}

	public void printForecastMenu() {
		System.out.println( Messages.FORECAST_MENU_MSG );
		
	}

	public void printCurrentPrediction( Forecast forecast ) {
		Translations translation = new Translations();
		ForecastTimestamp forecastTimestamp = forecast.getCurrentForecast();
		
		System.out.println( Messages.NOW_MSG 
				+ translation.translate( forecastTimestamp.getConditionCode() ) 
				+ "\n");
		
	}

	public void printTemperatureForecast( Forecast forecast ) {
		List<ForecastTimestamp> timestamps = forecast.getAllTodaysTimestamps();
		timestamps.forEach( v -> {
			System.out.println( v.getForecastTimeUtc().substring( 11, 13 ) 
					+ Messages.HOUR_MSG 
					+ v.getAirTemperature() 
					+ "C" );
		});
		
	}

	public void printMinAndMaxForToday( Forecast forecast ) {
		
		ForecastTimestamp minTemp = forecast.getLowestTemp();
		System.out.println( Messages.MIN_MSG + minTemp.getForecastTimeUtc().substring( 11, 13 ) 
				+ Messages.HOUR_MSG  
				+ minTemp.getAirTemperature() 
				+ "C" );
		
		ForecastTimestamp maxTemp = forecast.getHighestTemp();
		System.out.println( Messages.MAX_MSG + maxTemp.getForecastTimeUtc().substring( 11, 13 ) 
				+ Messages.HOUR_MSG  
				+ maxTemp.getAirTemperature() 
				+ "C" );
		
	}

	public void printWindDirection( Forecast forecast ) {
		System.out.println( Messages.WIND_DIRECTION_MSG
					+ translateWindDirection( forecast.getCurrentForecast().getWindDirection() ));
		
	}
	
	private String translateWindDirection( int deg ) {
				
		return  deg > 350 || deg < 10 ? Messages.WIND_DIRECTION_NORTH : 
			 	deg >= 10 && deg <= 80 ? Messages.WIND_DIRECTION_NORTH_EAST :
			 	deg > 80 && deg < 100 ? Messages.WIND_DIRECTION_EAST :
			 	deg >= 100 && deg <= 170 ? Messages.WIND_DIRECTION_SOUTH_EAST :
			 	deg > 170 && deg < 190 ? Messages.WIND_DIRECTION_SOUTH :
			 	deg >= 190 && deg <= 260 ? Messages.WIND_DIRECTION_SOUTH_WEST :
			 	deg > 260 && deg < 280 ? Messages.WIND_DIRECTION_WEST :
			 	deg >= 280 && deg <= 350 ? Messages.WIND_DIRECTION_NORTH_WEST :
			 	"";
	}
}
