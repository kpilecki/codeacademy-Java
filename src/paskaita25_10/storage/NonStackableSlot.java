package paskaita25_10.storage;

import paskaita25_10.interfaces.Item;
import paskaita25_10.interfaces.Stackable;

public abstract class NonStackableSlot extends AbstractSlot{

	@Override
	public boolean addItem(Item item) {
		return item instanceof Stackable ? false : super.items.add( item );
	}
	
}
