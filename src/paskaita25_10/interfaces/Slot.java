package paskaita25_10.interfaces;

public interface Slot <T extends Item>{

	int getSize();
	boolean hasEmtySpace();
	boolean addItem (T item );
	T getFirstItem();
	T getItemByIndex( int index );
	
}
