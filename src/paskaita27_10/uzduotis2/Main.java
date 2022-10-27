package paskaita27_10.uzduotis2;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = Arrays
				.asList( 3, 6, 7, 15, 2, 1, 9, 8, 19, 4, 5, 12 );
		
		System.out.println( moreThan( list , 5 ));

	}
	
	public static  List<Integer> moreThan(List<Integer> list, int num ){
		return list.stream()
				.filter( v -> v.compareTo( num ) > 0 )
				.toList();
	}
	

}
