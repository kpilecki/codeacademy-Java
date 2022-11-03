package paskaita03_11.getForecast;

import lombok.Data;

@Data
public class ForecastTimestamp {
	protected String forecastTimeUtc;
	protected double airTemperature;
	protected int windSpeed;
	protected int windGust;
	protected int windDirection;
	protected int cloudCover;
	protected int seaLevelPressure;
	protected int relativeHumidity;
	protected double totalPrecipitation;
	protected String conditionCode;
}
