package paskaita11_10_Uzduotis2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

public abstract class Asmuo {
	String vardas;
	String pavarde;
	
	@Override
	public String toString() {
		return "Asmuo vardas: " + vardas + ", pavarde: " + pavarde;
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
		return Objects.equals(pavarde, other.pavarde) && Objects.equals(vardas, other.vardas);
	}

	public abstract void spausdinkInformacija();

}
