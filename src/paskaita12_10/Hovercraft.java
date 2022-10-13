package paskaita12_10;

public class Hovercraft implements LandVehicle, SeaVessel{
	private String name = "";
	private int maxPassengers = 0;
	private int maxSpeed = 0;
	private int displacement = 0;
	private int numWheels = 0;
	
	public void defMethod() {
		LandVehicle.super.defMethod();
	}
	
	public void enterLand() {
		System.out.println( "Hovercraft has entered land" );
	}
	public void enterSea() {
		System.out.println( "Hovercraft has entered sea" );
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
	public int getDisplacement() {
		return this.displacement;
	}

	@Override
	public void setDisplacement( int displacement ) {
		this.displacement = displacement;
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
	public void launch() {
		System.out.println( "Hovercraft has lauched" );
	}
	@Override
	public void drive() {
		System.out.println( "Hovercraft is driving" );
	}
}
