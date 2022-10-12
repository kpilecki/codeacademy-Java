package paskaita11_10_Uzduotis4;

public class Apskritimas extends Figura{

	@Override
	public float gautiPlota(int ilgis) {
		
		return 3.14f * ilgis * ilgis;
	}

	@Override
	public float gautiPerimetra(int ilgis) {
		
		return 2 * 3.14f * ilgis;
	}

}
