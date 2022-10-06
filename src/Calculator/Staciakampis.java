package Calculator;

public class Staciakampis {
	private float width;
	private float length;
	
	
	public Staciakampis(float width, float length) throws IllegalArgumentException {
		if(width <= 0 || length <= 0) {
			throw new IllegalArgumentException("Length And Width Has To Be More Than Zero");
		}
		this.width = width;
		this.length = length;
	}
	public Staciakampis() {
		
	}

	public void setWidth(float width) throws IllegalArgumentException {
		if(width <= 0) {
			throw new IllegalArgumentException("Width Has To Be More Than Zero");
		}
		this.width = width;
	}
	public void setLength(float length) {
		if(length <= 0) {
			throw new IllegalArgumentException("Length Has To Be More Than Zero");
		}
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public float getLength() {
		return length;
	}
	public float area() {
		return width * length;
	}
	public float perimeter() {
		return 2 * (width + length);
	}
}
