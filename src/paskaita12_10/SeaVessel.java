package paskaita12_10;

public interface SeaVessel extends Vehicle{

	int getDisplacement();
	void setDisplacement( int displacement );
	void launch();
	default void defMethod() {
		System.out.println( "This is default method in SeaVessel" );
	}
}
