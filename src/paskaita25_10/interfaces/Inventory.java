package paskaita25_10.interfaces;

public interface Inventory < T extends Slot<?> >{
	
	boolean addSlot( T slot );
	boolean removeSlotByIndex( int index );
	T getSlotByIndex( int index );
}
