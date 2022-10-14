package paskaita11_10.uzduotis;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Vaisius> arr = new ArrayList<>();
		arr.add( new Vaisius() );
		arr.add( new EgzotinisVaisius() );
		arr.add( new Ananasas() );
		arr.add( new Mangas() );
		arr.add( new LietuviskasVaisius() );
		arr.add( new Kriause() );
		arr.add( new Obuolys() );
		arr.add( new Alyvinis() );
		arr.add( new Antaninis() );
		
		arr.forEach( el -> {
			el.kasEsu();
		});
	}
}
