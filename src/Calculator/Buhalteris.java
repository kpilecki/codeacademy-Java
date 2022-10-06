package Calculator;

public class Buhalteris {

	// float sk = 3428.45f
	public String floatToWords(float sk) {
		String temp = "";
		int tukst = (int) (sk / 1000);
		int simt = (int) (sk / 100) - tukst * 10;
		int des = (int) (sk / 10) - simt * 10 - tukst * 100;
		int vien = (int) sk - des * 10 - simt * 100 - tukst * 1000;
		//int cent = (int)((sk - (float)((int)sk)  )*100);
		int cent = (int)(sk * 100) - (int)sk * 100;

		System.out.println(tukst);
		System.out.println(simt);
		System.out.println(des);
		System.out.println(vien);
		System.out.println(cent);

		if (tukst > 0) {
			temp += getDigit(tukst).substring(0, 1).toUpperCase()
					+ getDigit(tukst).substring(1) 
					+ " tukstanciai, ";
		}
		
		if (simt > 0) {
			if (tukst > 0) {
				temp += getDigit(simt) + " simtai, ";
			} else {
				temp += getDigit(simt).substring(0, 1).toUpperCase()
						+ getDigit(simt).substring(1) 
						+ " simtai, ";
			}
		}
		
		if (des > 0) {
			if(simt > 0 || tukst > 0) {
				temp += getDesimtys(des) + " ";
			} else {
				temp += getDesimtys(des).substring(0, 1).toUpperCase() 
						+getDesimtys(des).substring(1)
						+ " ";
			}

		}
		
		if (vien > 0) {
			if(des > 0 || tukst > 0 || simt > 0) {
				temp += getDigit(vien) + " eurai";
			} else {
				temp += getDigit(vien).substring(0, 1).toUpperCase() 
						+ getDigit(vien).substring(1) 
						+ " eurai";
			}
		}
		
		

		// "pvz. Trys tukstanciai, keturi simtai, dvidesimt astuoni eurai ir 45 ct."
		return temp;
	}

	String getDigit(int d) {
		// 1 - 10

		switch (d) {
		case 1:
			return "vienas";
		case 2:
			return "du";
		case 3:
			return "trys";
		case 4:
			return "keturi";
		case 5:
			return "penki";
		case 6:
			return "sesi";
		case 7:
			return "septyni";
		case 8:
			return "astuoni";
		case 9:
			return "devyni";
		case 10:
			return "desimt";

		default:
			return "";
		}
	}

	String getDesimtys(int d) {
		String n = "desimt";
		switch (d) {
		case 1:
			return n;
		case 2:
			return "dvi" + n;
		case 3:
			return "tris" + n;
		case 4:
			return "keturias" + n;
		case 5:
			return "penkias" + n;
		case 6:
			return "sesias" + n;
		case 7:
			return "septynias" + n;
		case 8:
			return "astuonias" + n;
		case 9:
			return "devynias" + n;
	
		default:
			return "";
		}
	}
}
