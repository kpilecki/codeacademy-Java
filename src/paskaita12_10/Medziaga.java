package paskaita12_10;

import java.util.ArrayList;

public class Medziaga {

	public static void interfacesPrint() {
		ArrayList<Vehicle> list = new ArrayList<>();
		list.add( new Jeep() );
		list.add( new Hovercraft() );
		list.add( new Frigate() );
		
		list.forEach( v -> {
			if( v instanceof Jeep ) {
				Jeep jeep = (Jeep)v;
				jeep.soundHorn();
				jeep.drive();
			} else if( v instanceof Hovercraft ) {
				Hovercraft hovercraft = (Hovercraft)v;
				hovercraft.enterLand();
				hovercraft.enterSea();
				hovercraft.drive();
				hovercraft.launch();
				hovercraft.defMethod(); // default method inherited either from LandVehicle or SeaVessel
			} else if( v instanceof Frigate ) {
				Frigate frigate = (Frigate)v;
				frigate.fireGun();
				frigate.launch();
			}
		});
		
		ArrayList<PoliceCar> policeCarList = new ArrayList<>();
		policeCarList.add( new PoliceCar() );
		policeCarList.add( new PoliceCar() );
		
		policeCarList.forEach( car -> {
			car.drive();
			car.soundSiren();
			});
	}
}
