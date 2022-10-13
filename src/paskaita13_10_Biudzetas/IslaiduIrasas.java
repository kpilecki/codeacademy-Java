package paskaita13_10_Biudzetas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class IslaiduIrasas extends Irasas{
	String atsiskaitymoBudas = "";
	String bankoKortele = "";
	LocalDateTime data = LocalDateTime.now();
	
	public IslaiduIrasas() {}

	public String getAtsiskaitymoBudas() {
		return atsiskaitymoBudas;
	}
	public void setAtsiskaitymoBudas(String atsiskaitymoBudas) {
		this.atsiskaitymoBudas = atsiskaitymoBudas;
	}
	public String getBankoKortele() {
		return bankoKortele;
	}
	public void setBankoKortele(String bankoKortele) {
		this.bankoKortele = bankoKortele;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	@Override
	public String toString() {
		
		return 	data.toString().substring( 0, 16 ).replace( "T", " " )
				+ " | " + suma 
				+ " | " + atsiskaitymoBudas 
				+ " | " + bankoKortele 
				+ " | " + kategorijosIndeksas 
				+ " | "+ papildomaInfo;
	}
	
	
	
	
}
