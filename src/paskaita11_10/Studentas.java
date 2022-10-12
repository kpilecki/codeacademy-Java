package paskaita11_10;

public class Studentas extends Asmuo{
	protected String studentoPazymejimoNr;

	public Studentas(String vardas, String pavarde, 
				String asmensKodas, String studentoPazymejimoNr) {
		super(vardas, pavarde, asmensKodas);
		this.studentoPazymejimoNr = studentoPazymejimoNr;
	}

	public Studentas() {
		// TODO Auto-generated constructor stub
	}

	public String getStudentoPazymejimoNr() {
		return studentoPazymejimoNr;
	}

	public void setStudentoPazymejimoNr(String studentoPazymejimoNr) {
		this.studentoPazymejimoNr = studentoPazymejimoNr;
	}

	@Override
	public String toString() {
		return "Studentas [studentoPazymejimoNr=" + studentoPazymejimoNr 
				+ ", vardas=" + vardas 
				+ ", pavarde=" + pavarde
				+ ", asmensKodas=" + asmensKodas + "]";
	}
	
	@Override
	public void pasisveikinti() {
		System.out.println( "Sveiki as esu Studentas");
	}
	
	

}
