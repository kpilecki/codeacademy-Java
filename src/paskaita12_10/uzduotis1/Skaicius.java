package paskaita12_10.uzduotis1;

import java.util.ArrayList;
import java.util.stream.Collectors;

public abstract class Skaicius {
  protected ArrayList<Integer> arr = new ArrayList<>();
  
  public abstract void generuok();
  
  public long suma() {
//		long sum = 0;
//		
//		for( int num : arr ) {
//			sum += num;
//		}
//		
//		return sum;
		return arr.stream().collect( Collectors.summingLong( v -> v ));
	}
  
  public void printArr() {
	  arr.forEach( num -> {
		  System.out.println( num );
	  });
  }
}
