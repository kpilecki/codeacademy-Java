package pirmasJavaProjektas;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class AstuntaPaskaita {
	
	public static void dateTime() {
		LocalDateTime dabar = LocalDateTime.now();
		LocalDate siandien = dabar.toLocalDate();
		
		LocalDate zalgirioMusis = LocalDate.of(1410, 7, 15);
		LocalDate kaledos = LocalDate.of(2022, 12, 25);
		
		LocalDate endWW2 = LocalDate.of(1945, 9, 2);
		
		if(zalgirioMusis.isBefore(dabar.toLocalDate())) {
			System.out.println("Ruosk Kalavijus");
		} else {
			System.out.println("Tai jau istorija");
		}
		
		int rez = dabar.toLocalDate().compareTo(kaledos);
		
		System.out.println(rez);
		
		var difference = kaledos.minusYears(siandien.getYear())
				.minusMonths(siandien.getMonthValue())
				.minusDays(siandien.getDayOfMonth());
		
		System.out.println(difference);
		
		System.out.println(kaledos.toEpochDay() - siandien.toEpochDay());
		
		System.out.println(siandien.until(kaledos));
		
		System.out.println("WW2 ended " 
				+ (siandien.getYear() - endWW2.getYear()) 
				+ " Years Ago");
		
		System.out.println("WW2 ended "
				+ (siandien.getMonthValue() - endWW2.getMonthValue() 
						+ 12 * (siandien.getYear() - endWW2.getYear()))  
				+ " Months Ago");
		
		System.out.println("WW2 ended " 
				+ (siandien.toEpochDay() - endWW2.toEpochDay()) 
				+ " Days Ago");
		
		System.out.println("WW2 has ended on " + endWW2 + " it happened " 
				+ (siandien.getDayOfMonth() - endWW2.getDayOfMonth())
				+ " days "
				+ (siandien.getMonthValue() - endWW2.getMonthValue())
				+ " month "
				+ (siandien.getYear() - endWW2.getYear())
				+ " years ago");
			
		siandien.datesUntil(kaledos).forEach(v -> {
			System.out.println(v.toEpochDay() - siandien.toEpochDay());
		});
		
		Period timePassed = endWW2.until(siandien);
		
		
			
		
		
		
	}

	public static void stringBuilderPrint() {
		
		String str = "Some String";
		
		StringBuilder strB = new StringBuilder("Some String StringBuilder");	
		
		System.out.println(strB);
		
		strB.reverse(); // mutates object
		
		System.out.println(strB);
		
		System.out.println(strB.length());
		
		System.out.println(strB.indexOf("ed", 7)); // second arg from where to search
		
		System.out.println(strB.lastIndexOf("ir"));
		
		System.out.println(strB.toString());
		
		strB.delete(3, 7); // mutates object
		
		System.out.println(strB);
	}
}
