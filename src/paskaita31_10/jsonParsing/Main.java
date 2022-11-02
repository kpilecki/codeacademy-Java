package paskaita31_10.jsonParsing;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try {
			JsonParsing.readingJsonFromURL();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
