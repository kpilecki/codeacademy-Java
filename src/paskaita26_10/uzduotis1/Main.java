package paskaita26_10.uzduotis1;


public class Main {

	public static void main(String[] args) {
		StringListBox strBox = new StringListBox();
		strBox.addElement( "Vilnius" );
		strBox.addElement( "Kaunas" );
		System.out.println( strBox.getElements() );
		
		PersonListBox<Person> persBox = new PersonListBox<>();
		persBox.addElement( new Person( "Jonas", "Jonaitis") );
		persBox.addElement( new ExtendedPerson( "Petras", "Petraitis", 34 ) );
		System.out.println( persBox );
		
		PersonListBoxFromAbstract persBoxFromAbst = new PersonListBoxFromAbstract();
		persBoxFromAbst.addElement( new Person( "Jonas", "Jonaitis") );
		persBoxFromAbst.addElement( new ExtendedPerson( "Petras", "Petraitis", 34 ) );
		persBoxFromAbst.printListBox();
		
		Utils.printArray( new Integer[] {1, 2, 3, 4} );
		Utils.printArray( new String[] { "one", "two", "three" } );
		
		Utils.printArray2( 1, 2, 3, 4 );
		Utils.printArray2( "one", "two", "three");
		
		
	}


}
