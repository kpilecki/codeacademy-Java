package paskaita12_10;

public interface LandVehicle extends Vehicle {

	int getNumWheels();
	void setNumWheels( int numWheels );
	void drive();
	default void defMethod() {
		System.out.println( "This is default method in LandVehicle" );
	}
	
}
