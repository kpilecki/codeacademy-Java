package paskaita13_10_Biudzetas;

import java.time.LocalDateTime;

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
	
	
	
}
