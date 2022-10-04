
public enum UOM {
	
	KILOMETER(1000.0f, "km"),
	METER(1.0f, "m"),
	DECIMETER(0.1f, "dm"),
	CENTIMETER(0.01f, "cm"),
	MILIMETER(0.001f, "mm");
	
	
	final float daugiklis;
	final String galune;
	
	UOM(float n, String s){
		daugiklis = n;
		galune = s;
		
	}
	
	public float convert(float meters) {
		return meters / daugiklis;
	}
	
	public String convertAndToString(float meters) {
		return (meters / daugiklis) + galune;
	}
	
	
	
	


}
