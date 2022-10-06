package Calculator;

public class Kvadratas extends Staciakampis {
	
	public Kvadratas(float width) {
		new Staciakampis(width, width);
	}
	public float getWidth() {
		return super.getWidth();
	}
	public float area() {
		return super.area();
	}
	public float perimeter() {
		return super.getWidth() * 4;
	}
}
