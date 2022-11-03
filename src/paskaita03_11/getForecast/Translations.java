package paskaita03_11.getForecast;

import java.util.HashMap;

public class Translations {
	private static HashMap<String,String> map = new HashMap<>();
	
	public Translations() {
		map.put("clear", "giedra");
		map.put("isolated-clouds", "mažai debesuota");
		map.put("scattered-clouds", "debesuota su pragiedruliais");
		map.put("overcast", "debesuota");
		map.put("light-rain", "nedidelis lietus");
		map.put("moderate-rain", "lietus");
		map.put("heavy-rain", "smarkus lietus");
		map.put("sleet", "šlapdriba");
		map.put("light-snow", "nedidelis sniegas");
		map.put("moderate-snow", "sniegas");
		map.put("heavy-snow", "smarkus sniegas");
		map.put("fog", "rūkas");
		map.put("na", "oro sąlygos nenustatytos");
	}
	
	public String translate( String in ) {
		return map.get( in );
	}
}
