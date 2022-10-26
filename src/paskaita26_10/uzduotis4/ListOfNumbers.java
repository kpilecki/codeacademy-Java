package paskaita26_10.uzduotis4;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ListOfNumbers {
	protected ArrayList<Double> numbers = new ArrayList<>();
	
	public void addNumber( Double number ) {
		numbers.add( number );
	}
	
	public double getAverage() {
		return numbers.stream()
				.collect( Collectors.averagingDouble( Double::doubleValue ))
				.doubleValue();
	}

}
