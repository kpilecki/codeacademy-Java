package paskaita26_10.generics;

public class Box <T>{
	private T object;
	
	public Box() {}

	public Box(T object) {
		super();
		this.object = object;
	}

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
	
	
}
