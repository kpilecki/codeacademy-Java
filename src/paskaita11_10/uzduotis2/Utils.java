package paskaita11_10.uzduotis2;

import java.util.Collection;
import java.util.HashSet;

public class Utils {

	public static boolean checkUnique(Collection<Asmuo> arr ) {
		HashSet<Asmuo> temp = new HashSet<>();
		arr.forEach( v -> {
			temp.add( v );
		});
		if( temp.size() != arr.size() ) {
			return false;
		}
		for( Asmuo asm : arr ) {
			temp.remove( asm );
			for( Asmuo asm2 : temp ) {
				if( asm.equals( asm2 )) {
					return false;
				}
			}
			temp.add( asm );
		}
		
		return true;
	}
}
