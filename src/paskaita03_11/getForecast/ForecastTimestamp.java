package paskaita03_11.getForecast;

import lombok.Getter;

@Getter
public class ForecastTimestamp {
	public String forecastTimeUtc;
	public double airTemperature;
	public int windSpeed;
	public int windGust;
	public int windDirection;
	public int cloudCover;
	public int seaLevelPressure;
	public int relativeHumidity;
	public double totalPrecipitation;
	public String conditionCode;
}
