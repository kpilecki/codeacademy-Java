package paskaita26_10.uzduotis1;

import java.util.ArrayList;
import java.util.List;

public class StringListBox implements ListBox<String>{
	ArrayList<String> list = new ArrayList<>();

	@Override
	public void addElements(String[] values) {
		for( String str : values ) {
			if( str != null ) {
				list.add( str );
			}
		}
	}

	@Override
	public void addElement(String value) {
		if( value != null ) {
			list.add( value );
		}
	}

	@Override
	public List<String> getElements() {
		return list;
	}

}
