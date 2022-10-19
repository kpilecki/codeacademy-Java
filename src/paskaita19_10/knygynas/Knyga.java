package paskaita19_10.knygynas;

public class Knyga implements Comparable<Knyga>{
	private String pavadinimas;
	private String autorius;
	private float kaina;
	public Knyga(String pavadinimas, String autorius, float kaina) {
		super();
		this.pavadinimas = pavadinimas;
		this.autorius = autorius;
		this.kaina = kaina;
	}
	public String getPavadinimas() {
		return pavadinimas;
	}
	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}
	public String getAutorius() {
		return autorius;
	}
	public void setAutorius(String autorius) {
		this.autorius = autorius;
	}
	public float getKaina() {
		return kaina;
	}
	public void setKaina(float kaina) {
		this.kaina = kaina;
	}
	@Override
	public String toString() {
		return pavadinimas + ", " + autorius + ", " + kaina ;
	}
	@Override
	public int compareTo(Knyga o) {
		return  (int)(this.kaina * 100) - (int)(o.kaina * 100);
	}
	
	
	
	
	
	
	
}
