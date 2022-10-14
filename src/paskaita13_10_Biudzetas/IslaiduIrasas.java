package paskaita13_10_Biudzetas;

import java.time.LocalDateTime;

public class IslaiduIrasas extends Irasas{
	private String atsiskaitymoBudas = "";
	private String bankoKortele = "";
	private LocalDateTime data = LocalDateTime.now();

	public String getAtsiskaitymoBudas() {
		return atsiskaitymoBudas;
	}
	
	public void setAtsiskaitymoBudas( String atsiskaitymoBudas ) {
		if( atsiskaitymoBudas != null ) {
			this.atsiskaitymoBudas = atsiskaitymoBudas;
		}
	}
	
	public String getBankoKortele() {
		return bankoKortele;
	}
	
	public void setBankoKortele( String bankoKortele ) {
		if( bankoKortele != null ) {
			this.bankoKortele = bankoKortele;
		}
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData( LocalDateTime data ) {
		if( data != null ) {
			this.data = data;
		}
	}

	@Override
	public String toString() {
		return 	"[" + super.getId() + "] | "
				+ data.toString().substring( 0, 16 ).replace( "T", " " )
				+ " | " + suma 
				+ " | " + atsiskaitymoBudas 
				+ " | " + bankoKortele 
				+ " | " + kategorijosIndeksas 
				+ " | "+ papildomaInfo;
	}
	
	
	
	
}
