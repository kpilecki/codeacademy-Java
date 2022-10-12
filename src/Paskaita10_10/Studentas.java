package Paskaita10_10;

public class Studentas {

	private String name = "";
	private String surname = "";
	private Integer number = 0;
	private String university = "";
	
	public Studentas() {
		
	}
	public Studentas(String name, String surname, Integer number, String university) {
		this.name = name;
		this.surname = surname;
		this.number = number;
		this.university = university;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	@Override
	public String toString() {
		return "Studentas Vardas: " + name 
				+ ", Pavarde: " + surname 
				+ ", StudentoNumeris: " + number 
				+ ", Universitetas: " + university;
	}
	
	
	
	
}
