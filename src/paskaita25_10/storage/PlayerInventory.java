package paskaita25_10.storage;

import java.util.ArrayList;

import paskaita25_10.interfaces.Inventory;
import paskaita25_10.interfaces.Item;
import paskaita25_10.interfaces.Slot;

public class PlayerInventory implements Inventory<Slot<Item>>{
	private ArrayList<Slot<Item>> slots = new ArrayList<>();
	
	@Override
	public boolean addSlot(Slot<Item> slot) {
		return slots.add( slot );
	}

	@Override
	public boolean removeSlotByIndex(int index) {
		try {
			slots.remove( index );
		} catch ( IndexOutOfBoundsException e ) {
			return false;
		}
		return true;
	}

	@Override
	public Slot<Item> getSlotByIndex(int index) {
		
		return slots.size() >= index ? slots.get( index ) : null;
	}

}
