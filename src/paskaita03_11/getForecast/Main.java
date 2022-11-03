package paskaita03_11.getForecast;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;


public class Main {

	public static void main(String[] args) {
//		try {
//			URL url = new URL("https://api.meteo.lt/v1/places/kernave/forecasts/long-term");
//			Forecast forecast = new ObjectMapper().readValue( url , Forecast.class );
//			
//			ForecastTimestamp minTemp = forecast.getLowestTemp();
//			System.out.println( minTemp.getForecastTimeUtc() + " " + minTemp.getAirTemperature() );
//			
//			ForecastTimestamp maxTemp = forecast.getHighestTemp();
//			System.out.println( maxTemp.getForecastTimeUtc() + " " + maxTemp.getAirTemperature() );
//			
//			
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		new WeatherApp().run();

	}

}
