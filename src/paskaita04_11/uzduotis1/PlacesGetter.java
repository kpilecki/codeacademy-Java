package paskaita04_11.uzduotis1;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.NoArgsConstructor;
import paskaita03_11.getForecast.Place;
@NoArgsConstructor
public class PlacesGetter implements Callable<List<Place>>{
	private final String GET_URL = "https://api.meteo.lt/v1/places/";

	@Override
	public List<Place> call() throws Exception {
		try {
			URL url = new URL( GET_URL );
			List<Place> placeArr =  Arrays.asList( new ObjectMapper().readValue( url, Place[].class ));
			return placeArr;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}


}
