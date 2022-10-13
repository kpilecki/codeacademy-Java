package paskaita12_10;

public class PoliceCar implements IsEmergency, LandVehicle{
	private String name = "";
	private int maxPassengers = 0;
	private int maxSpeed = 0;
	private int numWheels = 0;

	@Override
	public void soundSiren() {
		System.out.println( "Police car has sounded it's siren" );
	}
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName( String name ) {
		this.name = name;
		
	}

	@Override
	public int getMaxPassengers() {
		return this.maxPassengers;
	}

	@Override
	public void setMaxPassengers( int passengers ) {
		this.maxPassengers = passengers;
		
	}

	@Override
	public int getMaxSpeed() {
		return this.maxSpeed;
	}

	@Override
	public void setMaxSpeed( int maxSpeed ) {
		this.maxSpeed = maxSpeed;
		
	}

	@Override
	public int getNumWheels() {
		return this.numWheels;
	}

	@Override
	public void setNumWheels( int numWheels ) {
		this.numWheels = numWheels;
	}

	@Override
	public void drive() {
		System.out.println( "Police car is driving" );
		
	}

}
