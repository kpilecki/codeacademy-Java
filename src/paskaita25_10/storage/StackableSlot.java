package paskaita25_10.storage;

import paskaita25_10.interfaces.Item;
import paskaita25_10.interfaces.Stackable;

public abstract class StackableSlot extends AbstractSlot{

	@Override
	public boolean addItem(Item item) {
		return item instanceof Stackable ? super.items.add( item ) : false;
	}

}
