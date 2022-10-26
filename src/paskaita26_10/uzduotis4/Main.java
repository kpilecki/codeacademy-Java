package paskaita26_10.uzduotis4;

public class Main {

	public static void main(String[] args) {
		ListOfNumbers list = new ListOfNumbers();
		list.addNumber( 10d );
		list.addNumber( 20d );
		
		ListOfNumbers list2 = new ListOfNumbers();
		list.addNumber( 10d );
		list.addNumber( 20d );
		list.addNumber( 30d );
		
		ListOfNumbers list3 = new ListOfNumbers();
		list.addNumber( 10d );
		
		System.out.println( findWithMaxAverage( list, list2, list3 ).getAverage() );

	}
	
	public static ListOfNumbers findWithMaxAverage( ListOfNumbers...list ) {
		double[] arrOfAverageValues = new double[ list.length ];
		int currMaxIndex = 0;
		
		for( int i = 0; i < list.length; i++ ) {
			arrOfAverageValues[i] = list[ i ].getAverage();
		}
		for( int i = 0; i < arrOfAverageValues.length; i++) {
			if( arrOfAverageValues[ i ] > arrOfAverageValues[ currMaxIndex ]) {
				currMaxIndex = i;
			}
		}
		return list[ currMaxIndex ];
		
	}

}
