import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class SeptintaPaskaita {
	
	public static void printMedziaga() {
		
//		int a = Integer.parseInt("1243");
//	
//		int[] arr = {1, 2, 343, 43, 22, 2121, 213, 21};
//		int[] arr2 = arr;
//	
//		Arrays.sort(arr);
//		
//		Utils.printArr(arr);
//		Utils.printArr(arr2);
		
		// ENUMS
//		
//		Diena siandien = Diena.ANTRADIENIS;
//	
//		
//		Diena kazkokiaDiena = Diena.TRECIADIENIS;
//		
//		if(siandien == Diena.ANTRADIENIS) {
//			System.out.println("Siandien Antradienis");
//		}
//		
		LocalDateTime time2 = LocalDateTime.MIN;
		
		System.out.println(time2);
		
		LocalDateTime time = LocalDateTime.now();
		
		time = time.minusHours(3);
		
		
		DateTimeFormatter formateris = DateTimeFormatter.ofPattern("yyyy!!MM!!dd--hh:mm");
		
		System.out.println(time.format(formateris));
		
		
		
	
	}

}
