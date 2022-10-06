package Paskaita06_10;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Medziaga {
	public static void stringFormat() {
		
		String name = "Petras";
		String surname = "Petraitis";
		int year = 1977;
		float height = 1.90f;
		
		System.out.format(Locale.US,
				"Asmens %s %s, gimusio %dm., ugis yra %.2fm.%n"
				, name, surname, year, height);
				
		System.out.println(String.format(Locale.US,
				"Asmens %s %s, gimusio %dm., ugis yra %.2fm."
				, name, surname, year, height));
		
		System.out.printf(Locale.US,
				"Asmens %s %s, gimusio %dm., ugis yra %.2gm.\n"
				, name, surname, year, height);
		
		LocalDateTime dabar = LocalDateTime.now();
		System.out.format("The date is:%ta %tb %td %tT %tS %tY", dabar,dabar,dabar,dabar,dabar,dabar);
		
	}

	public static void regexMedziaga() {
		
		 Pattern pattern = Pattern.compile("mano");
		    Matcher matcher = pattern.matcher("Mano batai buvo du");
		    boolean matchFound = matcher.find();
		    if(matchFound) {
		      System.out.println("Match found");
		    } else {
		      System.out.println("Match not found");
		    }
	}

	public static void collectionsMedziaga() {
		ArrayList<Integer> intArr = new ArrayList<>();
		HashSet<Integer> intSet = new HashSet<>();
		HashMap<Integer,String> intMap = new HashMap<>();
		
		ArrayList<String> strArr = new ArrayList<>();
		strArr.add("Ford");
		strArr.add("BMW");
		strArr.add("Tesla");
		strArr.add("Honda");
		
		strArr.set(3, strArr.get(3) + " Nice");
		
		
		boolean arPavyko = strArr.remove("BMW"); // returns boolean
		String deletedString = strArr.remove(0); // returns deleted object
		
		if(strArr.contains("Honda")) {
			System.out.println("Honda yra sarase");
		}
		
		System.out.printf("Sarase yra %d nariu\n", strArr.size());
		
		System.out.println(strArr);
		
		for(String s : strArr) {
			if(s.contains("Tesla")) {
				System.out.println("Tesla Found");
			} else {
				System.out.println("Tesla Not Found");
			}
			
		}
		
		
		
		
	}
}
