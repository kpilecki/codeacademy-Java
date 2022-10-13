package paskaita13_10_Biudzetas;

import java.time.LocalDate;

public class PajamuIrasas extends Irasas{
	String pozymis = "";
	LocalDate data = LocalDate.now();
	
	public PajamuIrasas() {}

	public String getPozymis() {
		return pozymis;
	}
	public void setPozymis(String pozymis) {
		this.pozymis = pozymis;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return  data 
				+ " | " + suma 
				+ " | " + kategorijosIndeksas
				+ " | " + pozymis 
				+ " | " + papildomaInfo;
	}
	
	
	
}
