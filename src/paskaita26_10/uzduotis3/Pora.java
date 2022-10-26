package paskaita26_10.uzduotis3;

public class Pora <K,V>{
	protected K key;
	protected V value;
	
	public Pora( K key, V value ) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "[" + key + ", " + value + "]";
	}
	
	

}
