package paskaita31_10.insults;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://evilinsult.com/generate_insult.php?lang=en&type=json");
			Insult insult = new ObjectMapper().readValue( url , Insult.class );
			
			System.out.println( insult.insult );
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
