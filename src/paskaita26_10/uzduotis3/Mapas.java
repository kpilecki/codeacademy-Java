package paskaita26_10.uzduotis3;

import java.util.ArrayList;
import java.util.HashSet;

public class Mapas <K,V>{
	protected ArrayList< Pora<K,V> > sarasasPoru = new ArrayList<>();
	protected HashSet<K> currentKeys = new HashSet<>(); 
	
	public boolean ideti(K key, V value ) {
		if( currentKeys.contains( key )) {
			return false;
		}
		sarasasPoru.add( new Pora<K,V>( key, value ));
		currentKeys.add( key );
		return true;
	}
	
	public V gauti( K key ) {
		return sarasasPoru.stream()
				.filter( v -> v.getKey() == key )
				.map( v -> v.getValue())
				.findAny()
				.orElse( null );
	}

}
