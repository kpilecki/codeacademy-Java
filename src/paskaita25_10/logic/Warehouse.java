package paskaita25_10.logic;

import java.util.ArrayList;
import java.util.Collection;

import paskaita25_10.interfaces.Item;

public class Warehouse <T extends Item>{
	ArrayList<T> items = new ArrayList<>();
	
	public void addItem( T item ){
		items.add( item );
	}
	public void removeItem( T item ) {
		items.remove( item );
	}
	public void removeItemByIndex( int index ) {
		items.remove( index );
	}
	public T getFirstItem() {
		return items.size() > 0 ? items.get(0) : null ;
	}
	public T getItemByIndex( int index ) {
		return items.size() >= index ? items.get( index ) : null;
	}
	public Collection<T> getAllItems(){
		return items;
	}
}
