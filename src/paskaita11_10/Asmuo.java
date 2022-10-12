package paskaita11_10;

public class Asmuo {
	protected String vardas;
	protected String pavarde;
	protected String asmensKodas;
	public Asmuo(String vardas, String pavarde, String asmensKodas) {
		this.vardas = vardas;
		this.pavarde = pavarde;
		this.asmensKodas = asmensKodas;
	}
	public Asmuo() {
		// TODO Auto-generated constructor stub
	}
	public String getVardas() {
		return vardas;
	}
	public void setVardas(String vardas) {
		this.vardas = vardas;
	}
	public String getPavarde() {
		return pavarde;
	}
	public void setPavarde(String pavarde) {
		this.pavarde = pavarde;
	}
	public String getAsmensKodas() {
		return asmensKodas;
	}
	public void setAsmensKodas(String asmensKodas) {
		this.asmensKodas = asmensKodas;
	}
	@Override
	public String toString() {
		return "Asmuo [vardas=" + vardas 
				+ ", pavarde=" + pavarde 
				+ ", asmensKodas=" + asmensKodas + "]";
	}
	
	public void pasisveikinti() {
		System.out.println( "Sveiki as esu asmuo");
	}
	
	
}
