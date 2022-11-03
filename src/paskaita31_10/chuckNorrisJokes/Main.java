package paskaita31_10.chuckNorrisJokes;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Main {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://api.chucknorris.io/jokes/random");
			Joke joke = new ObjectMapper().readValue( url , Joke.class );
			System.out.println( joke.value );
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
