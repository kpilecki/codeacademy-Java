package paskaita13_10_Biudzetas;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Biudzetas {
	PajamuIrasas[] pajamos = new PajamuIrasas[100];
	IslaiduIrasas[] islaidos = new IslaiduIrasas[100];
	int pajamosCounter = 0;
	int islaidosCounter = 0;
	
	public Biudzetas() {}
	
	public void pridePajamuIrasa( PajamuIrasas irasas ) {
		if( pajamosCounter < pajamos.length ) {
			pajamos[ pajamosCounter ] = irasas;
			pajamosCounter++;
		} else {
			throw new IndexOutOfBoundsException( "Pajamu sarasas pilnas");
		}
	}
	public void pridetiIslaiduIrasa( IslaiduIrasas irasas ) {
		if( islaidosCounter < islaidos.length ) {
			islaidos[ islaidosCounter ] = irasas;
			islaidosCounter++;
		} else {
			throw new IndexOutOfBoundsException( "Islaidu sarasas pilnas");
		}
	}
	public PajamuIrasas gautiPajamuIrasa( String kategorija, LocalDate data,
					 String pozymis, String papildomaInfo) {
		
		for( int i = 0; i <= pajamosCounter; i++) {
			PajamuIrasas temp = pajamos[ i ];
			
			if( temp.getKategorijosIndeksas().equals( kategorija ) 
					&& temp.getData().equals( data ) 
					&& ( temp.getPozymis().contains( pozymis ) 
						|| temp.getPapildomaInfo().contains( papildomaInfo ))) {
				return temp;
			}
		}
		return null;
	}
	public IslaiduIrasas gautiIslaiduIrasa( String kategorija, LocalDateTime data,
				String atsiskaitymoBudas, String bankoKortele) {
		
		for( int i = 0; i <= islaidosCounter; i++) {
			IslaiduIrasas temp = islaidos[ i ];
			
			if( temp.getKategorijosIndeksas().equals( kategorija ) 
					&& temp.getData().equals( data ) 
					&& ( temp.getAtsiskaitymoBudas().contains( atsiskaitymoBudas ))
						|| temp.getBankoKortele().contains( bankoKortele )) {
				return temp;
			}
		}
		return null;
	}
	public double gautiPajamuSuma() {
		double sum = 0;
		
		for(int i = 0; i < pajamosCounter; i++ ) {
			sum += pajamos[ i ].getSuma(); 
		}
		return sum;
	}
	public double gautiIslaiduSuma() {
		double sum = 0;
		
		for(int i = 0; i < islaidosCounter; i++ ) {
			sum += islaidos[i].getSuma();
		}
		return sum;
	}

	
}
