package paskaita31_10.jsonParsing;

import java.util.ArrayList;

public class Forecast {
    public Place place;
    public String forecastType;
    public String forecastCreationTimeUtc;
    public ArrayList<ForecastTimestamp> forecastTimestamps;
}
