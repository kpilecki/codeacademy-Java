package paskaita26_10.uzduotis1;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractListBox <T>{
	private ArrayList<T> list = new ArrayList<>();

	public void addElements(T[] values) {
		for( T val : values ) {
			if( val != null ) {
				list.add( val );
			}
		}
	}

	public void addElement(T value) {
		if( value != null) {
			list.add( value );
		}
	}

	public List<T> getElements() {
		return list;
	}

	public String toString() {
		return list.toString();
	}

}
