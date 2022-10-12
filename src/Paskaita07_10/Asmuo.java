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
		return Objects.hash(asmKodas, pavarde, vardas);
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
		return Objects.equals(asmKodas, other.asmKodas) && Objects.equals(pavarde, other.pavarde)
				&& Objects.equals(vardas, other.vardas);
	}

	public ArrayList<Asmuo> findAllMatchesByName( ArrayList<Asmuo> list){
		ArrayList<Asmuo> temp = new ArrayList<>();
		for( Asmuo a : list ) {
			if( a.getVardas().equals( this.vardas ) ){
				temp.add( a );
			}
		}
		return temp;
	}
	
	public static ArrayList<Asmuo> findAllByName( ArrayList<Asmuo> list, String vardas ){
		ArrayList<Asmuo> temp = new ArrayList<>();
		for( Asmuo a : list ) {
			if( a.getVardas().equals( vardas ) ){
				temp.add( a );
			}
		}
		return temp;
	}
	
	public static Asmuo searchArrByAsmKodas( ArrayList<Asmuo> list, String asmKodas ){
		
		for( Asmuo a : list ) {
			if( a.getAsmKodas().equals( asmKodas ) ){
				return a;
			}
		}
		return null;
	}
	
	public static ArrayList<Asmuo> findAllContainValue( ArrayList<Asmuo> list, String value ){
		ArrayList<Asmuo> temp = new ArrayList<>();
		for( Asmuo a : list ) {
			if( a.getVardas().contains(value)
				|| a.getPavarde().contains(value)
				|| a.getAsmKodas().contains(value)){
					temp.add( a );
			}
		}
		return temp;
	}
	
	
	

}
