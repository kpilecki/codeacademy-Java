package paskaita13_10_Biudzetas;

import java.util.Objects;

public class Irasas {
	protected int id;
	protected float suma;
	protected String kategorijosIndeksas = "";
	protected String papildomaInfo = "";
	
	public Irasas() {
		this.id = IdGenerator.getId();
	}
	
	public int getId() {
		return this.id;
	}

	public float getSuma() {
		return suma;
	}
	
	public void setSuma( float suma ) {
		this.suma = suma;
	}
	
	public String getKategorijosIndeksas() {
		return kategorijosIndeksas;
	}
	
	public void setKategorijosIndeksas( String kategorijosIndeksas ) {
		if( kategorijosIndeksas != null ) {
			this.kategorijosIndeksas = kategorijosIndeksas;
		}
	}

	public String getPapildomaInfo() {
		return papildomaInfo;
	}

	public void setPapildomaInfo( String papildomaInfo ) {
		if( papildomaInfo != null ) {
			this.papildomaInfo = papildomaInfo;
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash( id );
	}

	@Override
	public boolean equals( Object obj ) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Irasas other = (Irasas) obj;
		return id == other.id;
	}

	private class IdGenerator{
		private static Integer id;
		
		private IdGenerator() {}
		
		public static int getId() {
			if( id == null ) {
				id = 0;
				return id.intValue();
			} else {
				return ( id += 1 ).intValue();
			}
		}
	}
}
