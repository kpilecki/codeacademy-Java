package paskaita25_10.storage;

import java.util.ArrayList;

import paskaita25_10.interfaces.Item;
import paskaita25_10.interfaces.Slot;

public abstract class AbstractSlot implements Slot<Item>{
	protected ArrayList<Item> items = new ArrayList<>();
	private int size;
	
	protected void setSize( int size ) {
		this.size = size;
	}
	
	@Override
	public abstract boolean addItem (Item item );
	
	@Override
	public int getSize() {
		return this.size;
	}

	@Override
	public boolean hasEmtySpace() {
		return items.size() < size ? true : false;
	}

	@Override
	public Item getFirstItem() {
		return items.size() > 0 ? items.get( 0 ) : null;
	}

	@Override
	public Item getItemByIndex(int index) {
		return items.size() >= index ? items.get( index ) : null;
	}

}
