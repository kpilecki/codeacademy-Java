package paskaita25_10_Exceptions;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UzduotisLocalDate {
	private static Scanner sc = new Scanner( System.in );
	
	public LocalDate getLocalDate() {
		int year = 0;
		int month = 0;
		int day = 0;
		
		while( year < 1 || year > 2022 ) {
			System.out.print("Enter year: ");
			year = getUserInput( "Year", 2022 );
		}
		while( month < 1 || month > 12 ) {
			System.out.print( "Enter month: ");
			month = getUserInput( "Month", 12 );
		}
		
		LocalDate temp = LocalDate.of( year, month, 1 );
		long maxDays = temp.plusMonths(1).toEpochDay() - temp.toEpochDay();
		
		
		while( day < 1 || day > maxDays ) {
			System.out.println( "Enter day: ");
			day = getUserInput( "Day" , (int)maxDays);
		}
		
		return LocalDate.of(year, month, day);
		
		
	}
	
	
	private int getUserInput( String prefix , int maxValue ) {
		int temp = 0;
		while(true) {
			System.out.println( prefix + " has to be a number from 1 to " + maxValue );
			try {
				temp = sc.nextInt();
				return temp;
			} catch ( InputMismatchException e ) {
				System.out.println( "Input can only accept numbers" );
				sc.nextLine();
			}
		}
	}
}
