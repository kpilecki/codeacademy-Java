package paskaita13_10_Biudzetas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Biudzetas {
	ArrayList<PajamuIrasas> pajamos = new ArrayList<>();
	ArrayList<IslaiduIrasas> islaidos = new ArrayList<>();
	
	public Biudzetas() {}
	
	public void pridePajamuIrasa( PajamuIrasas irasas ) {
		if( irasas != null ) {
			pajamos.add( irasas );
		}
	}
	
	public void pridetiIslaiduIrasa( IslaiduIrasas irasas ) {
		if( irasas != null ) {
			islaidos.add( irasas );
		}
	}
	
	public PajamuIrasas gautiPajamuIrasa( String kategorija, LocalDate data,
					 String pozymis, String papildomaInfo) {
		
		for( PajamuIrasas temp : pajamos ) {

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
		
		for( IslaiduIrasas temp : islaidos ) {
			
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
		
		for( PajamuIrasas el : pajamos ) {
			sum += el.getSuma(); 
		}
		return sum;
	}
	
	public double gautiIslaiduSuma() {
		double sum = 0;
		
		for(IslaiduIrasas el : islaidos ) {
			sum += el.getSuma();
		}
		return sum;
	}
	
	public double balansas() {
		return gautiPajamuSuma() - gautiIslaiduSuma();
	}
	
	public ArrayList<PajamuIrasas> gautiPajamuSarasa(){
		return pajamos;
	}
	
	public ArrayList<IslaiduIrasas> gautiIslaiduSarasa(){
		return islaidos;
	}

	
}
