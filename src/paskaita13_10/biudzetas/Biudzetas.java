package paskaita13_10.biudzetas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Biudzetas {
	private ArrayList<Irasas> irasai = new ArrayList<>();
	
	public void pridetiIrasa( Irasas irasas ) {
		if( irasas != null) {
			irasai.add( irasas );
		}
	}
	
	public PajamuIrasas gautiPajamuIrasa( String kategorija, LocalDate data,
					 String pozymis, String papildomaInfo ) {
		for( Irasas irasas : irasai ) {
			if( irasas instanceof PajamuIrasas ) {
				PajamuIrasas temp = (PajamuIrasas) irasas;
				
				if( temp.getKategorijosIndeksas().equals( kategorija ) 
						&& temp.getData().equals( data ) 
						&& ( temp.getPozymis().contains( pozymis ) 
							|| temp.getPapildomaInfo().contains( papildomaInfo ))) {
					return temp;
				}
			}
		}
		return null;
	}
	
	public IslaiduIrasas gautiIslaiduIrasa( String kategorija, LocalDateTime data,
				String atsiskaitymoBudas, String bankoKortele ) {
		for( Irasas irasas : irasai ) {
			if( irasas instanceof IslaiduIrasas) {
				IslaiduIrasas temp = (IslaiduIrasas) irasas;
			
				if( temp.getKategorijosIndeksas().equals( kategorija ) 
						&& temp.getData().equals( data ) 
						&& ( temp.getAtsiskaitymoBudas().contains( atsiskaitymoBudas ))
							|| temp.getBankoKortele().contains( bankoKortele )) {
					return temp;
				}
			}
		}
		return null;
	}
	
	public double gautiPajamuSuma() {
		double sum = 0;
		
		for( Irasas el : irasai ) {
			if( el instanceof PajamuIrasas ) {
				sum += el.getSuma(); 
			}
		}
		return sum;
	}
	
	public double gautiIslaiduSuma() {
		double sum = 0;
		
		for(Irasas el : irasai ) {
			if( el instanceof IslaiduIrasas ){
				sum += el.getSuma();
			}
		}
//		TODO Same solution with streams
//		irasai.stream().filter( v -> v instanceof IslaiduIrasas)
//				.map( v -> (IslaiduIrasas) v)
//				.collect( Collectors.toList());
		
		return sum;
	}
	
	public double balansas() {
		return gautiPajamuSuma() - gautiIslaiduSuma();
	}
	
	public ArrayList<PajamuIrasas> gautiPajamuSarasa(){
		ArrayList<PajamuIrasas> temp = new ArrayList<>();
		
		for( Irasas el : irasai ) {
			if( el instanceof PajamuIrasas ) {
				temp.add( (PajamuIrasas) el ); 
			}
		}
		return temp;
	}
	
	public ArrayList<IslaiduIrasas> gautiIslaiduSarasa(){
		ArrayList<IslaiduIrasas> temp = new ArrayList<>();
				
		for( Irasas el : irasai ) {
			if( el instanceof IslaiduIrasas ) {
				temp.add( (IslaiduIrasas) el ); 
			}
		}
		return temp;
	}

	public boolean removeIrasasById( int id ) {
		for( Irasas el : irasai ) {
			if( el.getId() == id ) {
				irasai.remove( el );
				return true;
			}
		}
		return false;
	}
	
	public Irasas getIrasasById( int id ) {
		for( Irasas el : irasai ) {
			if( el.getId() == id ) {
				return el;
			}
		}
		return null;
	}

}
