package paskaita19_10.knygynas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Knygynas {
	ArrayList<Knyga> list = new ArrayList<>();
	
	public void addBook( Knyga knyga ) throws IllegalArgumentException {
		if( knyga != null ) {
			list.add( knyga );
		} else {
			throw new IllegalArgumentException( "Knyga negali buti null" );
		}
	}
	
	public Knyga getBookByName( String str ) {
		return list.stream()
				.filter( v -> v.getPavadinimas().contains( str ))
				.findFirst()
				.orElse( null );
	}
	
	public Knyga getBookByAuthor( String str ) {
		return list.stream()
				.filter( v -> v.getAutorius().contains( str ))
				.findFirst()
				.orElse( null );
	}
	
	public ArrayList<Knyga> getBooksByName( String str ){
		return list.stream()
				.filter( v -> v.getPavadinimas().contains( str ))
				.collect( Collectors.toCollection( ArrayList::new ));
	}
	
	public ArrayList<Knyga> getBooksByAuthor( String str ){
		return list.stream()
				.filter( v -> v.getAutorius().contains( str ))
				.collect( Collectors.toCollection( ArrayList::new ));
	}
	
	public ArrayList<Knyga> getAllBooks(){
		return list;
	}
	
	public ArrayList<String> getAllAuthors(){
		return list.stream()
				.map( v -> v.getAutorius() )
				.distinct()
				.collect( Collectors.toCollection( ArrayList::new ) );
	}
	
	public ArrayList<Knyga> getAllBooksSortedAsc(){
		return list.stream()
				.sorted()
				.collect( Collectors.toCollection( ArrayList::new ));
	}
	
	public ArrayList<Knyga> getAllBooksSortedDesc(){
		return list.stream()
				.sorted( Collections.reverseOrder())
				.collect( Collectors.toCollection( ArrayList::new));
	}
	
	public void printKnygynas() {
		list.forEach( System.out::println );
	}

	public void generateDummyData() {
		list.add( new Knyga( "Knyga1", "Autorius1", 14.54f ) );
		list.add( new Knyga( "Knyga2", "Autorius1", 43.54f ) );
		list.add( new Knyga( "Knyga3", "Autorius2", 15.54f ) );
		list.add( new Knyga( "Knyga4", "Autorius2", 13.54f ) );
		
		
	}
	
	public void runInteractive() {
		UserInterface ui = new UserInterface();
		int choice = 0;
		
		while( choice != 7 ) {
			choice = ui.getChoice();
			
			switch(choice) {
			case 1:
				ui.printArray( list, Messages.GET_ALL_BOOKS_MSG);
				break;
			case 2:
				ui.printArray( getAllBooksSortedAsc()
						, Messages.GET_ALL_BOOKS_SORTED_ASC_MSG );
				break;
			case 3:
				ui.printArray( getAllBooksSortedDesc()
						, Messages.GET_ALL_BOOKS_SORTED_DESC_MSG );
				break;
			case 4:
				ui.printArray( getAllAuthors() 
						, Messages.GET_ALL_AUTHORS_MSG );
				break;
			case 5:
				ui.printArray( getBooksByAuthor( 
						ui.getUserInputStr( Messages.GET_BOOKS_BY_AUTHORS_INPUT_MSG)) 
						, Messages.GET_BOOKS_BY_AUTHORS_MSG);
				break;
			case 6:
				ui.printArray( getBooksByName( 
						ui.getUserInputStr( Messages.GET_BOOKS_BY_NAME_INPUT_MSG))
						, Messages.GET_BOOKS_BY_NAME_MSG);
			}
		}
		
		
	}
	

}
