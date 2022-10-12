package paskaita11_10_Uzduotis4;

public class Kvadratas extends Figura{

	@Override
	public float gautiPlota(int ilgis) {
		
		return ilgis * (float)ilgis;
	}

	@Override
	public float gautiPerimetra(int ilgis) {
		
		return 4f * ilgis;
	}

}
