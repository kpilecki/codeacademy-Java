package paskaita13_10_Uzduotis1;

import java.util.HashMap;

public class DuomenuBaze implements Saugykla{
	HashMap<Integer, Info> db = new HashMap<>();
	
	@Override
	public void saugotiInfo( Info object ) {
		if( db.containsKey( object.getId() )) {
			throw new IllegalArgumentException( "Object with this ID already exists" );
		}
		db.put( object.getId(), object );
		System.out.println( "Issaugota i duomenu baze" );
	}
	@Override
	public Info rastiInfo( int id ) {
		if( db.containsKey( id )) {
			System.out.println( "Rasta duomenu bazeje pagal id" );
			return db.get( id );
		} else {
			System.out.println( "Nerasta duomenu bazeje pagal id" );
			return null;
		}
		
	}
	@Override
	public Info rastiInfo( String zodis ) {
		
		for( Info item : db.values()) {
			if( item.arYraTekste( zodis )) {
				System.out.println( "Rasta duomenu bazeje pagal zodi" );
				return item;
			}
		}
		System.out.println( "Nerasta duomenu bazeje pagal zodi");
		return null;
	}
}
