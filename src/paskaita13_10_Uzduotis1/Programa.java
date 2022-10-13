package paskaita13_10_Uzduotis1;

public class Programa {

	public static void main(String[] args) {
		DuomenuBaze db = new DuomenuBaze();
		saugoti( db, new Info( 1, "Pirmas" ) );
		saugoti( db, new Info( 2, "Antras" ) );
		saugoti( db, new Info( 3, "Trecias" ) );
		
		rastiPagalId( db, 1 );
		rastiPagalId( db, 4 );
		
		rastiPagalZodi( db, "Ant" );
		rastiPagalZodi( db, "Penkt" );
		
		NutolesDiskas nd = new NutolesDiskas();
		saugoti( nd, new Info( 4, "Ketvirtas" ) );
		saugoti( nd, new Info( 5, "Penktas" ) );
		saugoti( nd, new Info( 6, "Sestas" ) );
		
		rastiPagalId( nd, 5 );
		rastiPagalId( nd, 1 );

		rastiPagalZodi( nd, "Pen" );
		rastiPagalZodi( nd, "Ant" );
		

	}
	
	static void saugoti( Saugykla db, Info el ) {
		db.saugotiInfo( el );
	}
	static void rastiPagalId( Saugykla db, int id ) {
		System.out.println( db.rastiInfo( id ) );
	}
	static void rastiPagalZodi( Saugykla db, String zodis ) {
		System.out.println( db.rastiInfo( zodis ) );
	}

}
