package paskaita27_10.medziaga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		String[] arr = {"Sausis", "Vasaris", "Kovas", "Balandis", "Geguze"};
		ArrayList<String> zodziai = new ArrayList<>( Arrays.asList( arr ));
		
		zodziai.forEach( new User() );

	}
	
	
}
@FunctionalInterface
	interface ShortToByte{
		byte convert(Short n);
	}
class User implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println( t );
	}
	
}