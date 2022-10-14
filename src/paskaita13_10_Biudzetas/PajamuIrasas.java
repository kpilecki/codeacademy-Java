package paskaita13_10_Biudzetas;

import java.time.LocalDate;

public class PajamuIrasas extends Irasas{
	private String pozymis = "";
	private LocalDate data = LocalDate.now();

	public String getPozymis() {
		return pozymis;
	}
	
	public void setPozymis( String pozymis ) {
		if( pozymis != null ) {
			this.pozymis = pozymis;
		}
	}

	public LocalDate getData() {
		return data;
	}

	public void setData( LocalDate data ) {
		if( data != null ) {
			this.data = data;
		}
	}

	@Override
	public String toString() {
		return  "[" + super.getId() + "] | "
				+ data 
				+ " | " + suma 
				+ " | " + kategorijosIndeksas
				+ " | " + pozymis 
				+ " | " + papildomaInfo;
	}
}
