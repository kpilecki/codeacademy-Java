package paskaita04_11.uzduotis1;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

import paskaita03_11.getForecast.Forecast;

public class ForecastGetter implements Runnable{
	private final String GET_URL = "https://api.meteo.lt/v1/places/vilnius/forecasts/long-term";
	
	@Override
	public void run() {
		try {
			URL url = new URL( GET_URL );
			Forecast forecast = new ObjectMapper().readValue( url , Forecast.class );
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
