package paskaita26_10.uzduotis1;

import java.util.List;

public interface ListBox <E>{
	
	
	void addElements( E[] values );
	
	void addElement( E value );
	
	List<E> getElements();
}
