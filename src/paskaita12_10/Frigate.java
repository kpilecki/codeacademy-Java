package paskaita12_10;

public class Frigate implements SeaVessel{
	private String name = "";
	private int maxPassengers = 0;
	private int maxSpeed = 0;
	private int displacement = 0;
	
	public void fireGun() {
		System.out.println( "Frigate fired it's gun" );
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
	public void launch() {
		System.out.println( "Frigate has been launched" );
	}
}
