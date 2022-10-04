
public enum Diena {

	PIRMADIENIS(false),
	ANTRADIENIS(false),
	TRECIADIENIS(false),
	KETVIRTADIENIS(false),
	PENKTADIENIS(false),
	SESTADIENIS(true),
	SEKMADIENIS(true);
	
	final boolean savaitgalis;
	
	
	Diena(boolean laisva){
		savaitgalis = laisva;
		
	}
	
	public Diena numToEnum(int num) {
		switch(num) {
		case 1:
			return PIRMADIENIS;
		case 2:
			return ANTRADIENIS;
		case 3:
			return TRECIADIENIS;
		case 4:
			return KETVIRTADIENIS;
		case 5:
			return PENKTADIENIS;
		case 6:
			return SESTADIENIS;
		case 7:
			return SEKMADIENIS;
		default:
			return null;
		}
	}
	
	public Diena numToEnumV2(int num) {
		Diena[] temp = Diena.values();
		if(num < 1 || num > temp.length) {
			throw new IllegalArgumentException("Values can only be in the range of 1 to 7");
		}
		return temp[num - 1];
		
	}
	
	
	
}
