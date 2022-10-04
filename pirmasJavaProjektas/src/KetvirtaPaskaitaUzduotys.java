
public class KetvirtaPaskaitaUzduotys {
	
	public static String cleanUp(String in) {
		
		return in.replaceAll("\\s+", " ").trim();

	}
	public static String cleanUp2(String in) {
		
		in = in.trim();
		while(in.contains("  ")) {
			in = in.replace("  " , " ");
		}
		return in;

	}
	
	public static boolean check(int[] arr) {
		for(int a : arr) {
			System.out.println("Sukas Ciklas");
			if(a % 5 == 0) {
				return true;
			}
		}
		return false;
	}
}
