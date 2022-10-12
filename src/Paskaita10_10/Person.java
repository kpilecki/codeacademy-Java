package Paskaita10_10;

import java.util.ArrayList;
import java.util.Objects;

public class Person {
	private String name = "";
	private String surname = "";
	private int ak;
	
	public Person(String vardas, String pavarde, int asmKodas) {
		
		this.name = vardas;
		this.surname = pavarde;
		this.ak = asmKodas;
	}
	
	public Person(int asmKodas) {
		this.ak = asmKodas;
	}
	
	public Person(String name, int ak) {
		this.name = name;
		this.ak = ak;
	}

	public String getVardas() {
		return name;
	}
	public void setVardas(String vardas) {
		this.name = vardas;
	}
	public String getPavarde() {
		return surname;
	}
	public void setPavarde(String pavarde) {
		this.surname = pavarde;
	}
	public int getAsmKodas() {
		return ak;
	}
	public void setAsmKodas(int asmKodas) {
		this.ak = asmKodas;
	}

	@Override
	public String toString() {
		return "(" + name + ", ak=" + ak + ")" ;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ak, surname, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(ak, other.ak) && Objects.equals(surname, other.surname)
				&& Objects.equals(name, other.name);
	}

	public ArrayList<Person> findAllMatchesByName( ArrayList<Person> list){
		ArrayList<Person> temp = new ArrayList<>();
		for( Person a : list ) {
			if( a.getVardas().equals( this.name ) ){
				temp.add( a );
			}
		}
		return temp;
	}
	
	public static ArrayList<Person> findAllByName( ArrayList<Person> list, String vardas ){
		ArrayList<Person> temp = new ArrayList<>();
		for( Person a : list ) {
			if( a.getVardas().equals( vardas ) ){
				temp.add( a );
			}
		}
		return temp;
	}
	
	public static Person searchArrByAsmKodas( ArrayList<Person> list, int asmKodas ){
		
		for( Person a : list ) {
			if( a.getAsmKodas() ==  asmKodas ){
				return a;
			}
		}
		return null;
	}
	
	public static ArrayList<Person> findAllContainValue( ArrayList<Person> list, String value ){
		ArrayList<Person> temp = new ArrayList<>();
		for( Person a : list ) {
			if( a.getVardas().contains(value)
				|| a.getPavarde().contains(value)){
					temp.add( a );
			}
		}
		return temp;
	}
	
	
	

}

