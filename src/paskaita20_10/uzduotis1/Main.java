package paskaita20_10.uzduotis1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		varargsTest( LocalDate.now(), new ManoKlase(), "Labas" );
		varargsTest( LocalDate.now()
				, 5
				, 5.65f
				, new ManoKlase()
				, "SomeString"
				, new ArrayList<String>()
				, new HashMap<Integer,String>() );

	}
	
	@SafeVarargs
	public static <T> void varargsTest( T... objects ) {
		for( T obj : objects ) {
			System.out.println( obj );
		}
	}

}
