package paskaita27_10.uzduotis2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = Arrays
				.asList( 3, 6, 7, 15, 2, 1, 9, 8, 19, 4, 5, 12 );
		List<Locale> locales = Arrays.asList( Locale.getAvailableLocales() );
		
		System.out.println( moreThan( list , 5 ));
		
		System.out.println( list
				.stream()
				.map( v -> "Number " + v )
				.toList() );
		
		
		Map<String, HashSet<Locale>> groupedLocalesByCountry = locales
				.stream()
				.collect( Collectors.groupingBy( v -> v.getCountry() , Collectors.toCollection( HashSet::new)) );
		
		System.out.println( groupedLocalesByCountry.get( "LT" ));
		
		
		
		Map<Boolean, List<Locale>> groupedLocalesByEnOrNot = locales
				.stream()
				.collect( Collectors.partitioningBy( v -> v.getLanguage().equals( "en") ));
		
		System.out.println( groupedLocalesByEnOrNot.get( true ) );
		
		
		Stream<Integer> streamIterated = Stream.iterate(2, n -> n + 2 ).limit(20);
		System.out.println( streamIterated.toList() ); 
		
		Stream<Double> streamGenerated = Stream.generate( Math::random ).limit( 100 );
		

	}
	
	public static  List<Integer> moreThan(List<Integer> list, int num ){
		return list.stream()
				.filter( v -> v.compareTo( num ) > 0 )
				.toList();
	}
	

}
