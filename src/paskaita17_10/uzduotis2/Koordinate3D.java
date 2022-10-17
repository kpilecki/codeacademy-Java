package paskaita17_10.uzduotis2;

import java.util.Objects;

public class Koordinate3D extends Koordinate2D{
	private int z;

	public Koordinate3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Koordinate3D: " + super.getX() + ", " + super.getY() + ", " + z;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(z);
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
		Koordinate3D other = (Koordinate3D) obj;
		return z == other.z;
	}
	
	public int getDistance( Koordinate3D kord ) {
		return (int) Math.sqrt( 
				(Math.pow( kord.getX() - super.getX() , 2) 
						+ Math.pow( super.getY() - kord.getY() , 2 )
						+ Math.pow( z - kord.getZ(), 2 )));
	}
	
}
