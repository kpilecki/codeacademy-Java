package Paskaita06_10;

import java.util.ArrayList;
import java.util.Scanner;

public class UzduotysArrayList {
	public static void uzduotis1() {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> strList = new ArrayList<>();
		
		while( true ) {
			System.out.println("Please Enter word to add");
			String temp = sc.nextLine();
			
			if( temp.length() == 0 ) {
				break;
			}
			if( strList.size() == 5 ) {
				strList.clear();
			}
			if( strList.contains(temp) ) {
				System.out.println("This word already exists");
				continue;
			} else {
				strList.add(temp);
			}
		}
		System.out.println(strList);
		sc.close();
	}
	
	public static void uzduotis2(ArrayList<String> strList) {
		String temp = "";
		
		for( String s : strList ) {
			if( temp.length() < s.length() ) {
				temp = s;
			}
		}
		System.out.println(temp);	
	}
	
	public static ArrayList<String> uzduotis3(ArrayList<String> strList) {
		ArrayList<String> tempList = new ArrayList<>();
		
		for(String s : strList) {
			if( !tempList.contains( s )) {
				tempList.add(s);
			}
		}
		return tempList;
	}
	
	 
}
