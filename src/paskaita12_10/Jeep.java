package paskaita12_10;

public class Jeep implements LandVehicle{
	private String name = "";
	private int maxPassengers = 0;
	private int maxSpeed = 0;
	private int numWheels = 0;
	
	public void soundHorn() {
		System.out.println( "Jeep has sounded it's horn" );
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
		System.out.println( "Jeep is driving" );
		
	}
}
