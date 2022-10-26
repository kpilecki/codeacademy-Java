package paskaita25_10.storage;

import paskaita25_10.interfaces.Item;

public class SpecialLargeSlot extends AbstractSlot{
	
	public SpecialLargeSlot() {
		super.setSize( SlotSizes.LARGE_SLOT_SIZE );
	}
	@Override
	public boolean addItem(Item item) {
		return items.add( item );
	}

}
