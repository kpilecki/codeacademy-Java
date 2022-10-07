package Paskaita07_10;

import java.util.ArrayList;
import java.util.Objects;

public class Asmuo {
	private String vardas = "";
	private String pavarde = "";
	private String asmKodas;
	
	public Asmuo(String vardas, String pavarde, String asmKodas) {
		
		this.vardas = vardas;
		this.pavarde = pavarde;
		this.asmKodas = asmKodas;
	}
	
	public Asmuo(String asmKodas) {
		this.asmKodas = asmKodas;
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
	public String getAsmKodas() {
		return asmKodas;
	}
	public void setAsmKodas(String asmKodas) {
		this.asmKodas = asmKodas;
	}

	@Override
	public String toString() {
		return vardas + " " + pavarde ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(asmKodas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asmuo other = (Asmuo) obj;
		return Objects.equals(asmKodas, other.asmKodas);
	}
	
	public static ArrayList<Asmuo> searchByName(ArrayList<Asmuo> list, String vardas){
		ArrayList<Asmuo> sarasas = new ArrayList<>();
		ArrayList<Asmuo> temp = new ArrayList<>();
		sarasas.addAll(list);
		
		
		
	}
	
	
	
	
	

}
