package paskaita31_10.jsonParsing;


public class Place{
	
    public String code;
    public String name;
    public String administrativeDivision;
    public String country;
    public String countryCode;
    public Coordinates coordinates;
	@Override
	public String toString() {
		return "Place [code=" + code + ", name=" + name + ", administrativeDivision=" + administrativeDivision
				+ ", country=" + country + ", countryCode=" + countryCode + ", coordinates=" + coordinates + "]";
	}
    
    
}
