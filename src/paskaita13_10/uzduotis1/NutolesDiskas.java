package paskaita13_10.uzduotis1;

import java.util.ArrayList;

public class NutolesDiskas implements Saugykla{
	ArrayList<Info> list = new ArrayList<>();

	@Override
	public void saugotiInfo(Info object) {
		list.add( object );
		System.out.println( "Issaugota i nutolusi diska");
	}

	@Override
	public Info rastiInfo(int id) {
		for( Info el : list) {
			if( el.getId() == id ) {
				System.out.println( "Rasta  nutolusiame diske pagal id" );
				return el;
			}
		}
		System.out.println( "Nerasta  nutolusiame diske pagal id" );
		return null;
	}

	@Override
	public Info rastiInfo(String zodis) {
		for( Info el : list ) {
			if( el.getTekstas().contains( zodis ) ) {
				System.out.println( "Rasta nutolusiame diske pagal zodi" );
				return el;
			}
		}
		System.out.println( "Nerasta nutolusiame diske pagal zodi" );
		return null;
	}
}
