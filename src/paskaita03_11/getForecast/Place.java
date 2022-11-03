package paskaita03_11.getForecast;

import lombok.Getter;

@Getter
public class Place {
	public String code;
	public String name;
	public String administrativeDivision;
    public String country;
    public String countryCode;
    public Coordinates coordinates;
}
