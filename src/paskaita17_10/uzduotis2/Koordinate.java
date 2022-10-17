package paskaita17_10.uzduotis2;

import java.util.Objects;

public class Koordinate {
	private int x;

	public Koordinate(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "Koordinate: " + x;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Koordinate other = (Koordinate) obj;
		return x == other.x;
	}
	
	public int getDistance( Koordinate kord ) {
		return Math.abs( x - kord.getX() );
	}
	
}
