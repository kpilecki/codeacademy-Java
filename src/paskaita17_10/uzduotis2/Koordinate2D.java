package paskaita17_10.uzduotis2;

import java.util.Objects;

public class Koordinate2D extends Koordinate{
	private int y;

	public Koordinate2D(int x, int y) {
		super(x);
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Koordinate2D: " + super.getX() + ", " + y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(y);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Koordinate2D other = (Koordinate2D) obj;
		return y == other.y;
	}
	
	public int getDistance( Koordinate2D kord ) {
		return (int) Math.sqrt( 
				(Math.pow( kord.getX() - super.getX() , 2) 
						+ Math.pow( y - kord.getY() , 2 )));
	}
}
