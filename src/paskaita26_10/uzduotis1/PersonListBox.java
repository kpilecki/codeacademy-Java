package paskaita26_10.uzduotis1;

import java.util.ArrayList;
import java.util.List;

public class PersonListBox <T extends Person> implements ListBox<T>{
	private ArrayList<T> list = new ArrayList<>();

	@Override
	public void addElements(T[] values) {
		for( T val : values ) {
			if( val != null ) {
				list.add( val );
			}
		}
	}

	@Override
	public void addElement(T value) {
		if( value != null) {
			list.add( value );
		}
	}

	@Override
	public List<T> getElements() {
		return list;
	}

	@Override
	public String toString() {
		return list.toString();
	}
	
	

}
