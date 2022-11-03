package paskaita03_11.getForecast;

import lombok.Data;

@Data
public class Place {
	protected String code;
	protected String name;
	protected String administrativeDivision;
	protected String country;
	protected String countryCode;
	protected Coordinates coordinates;
}
