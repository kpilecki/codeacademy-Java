package pirmasJavaProjektas;
public class AstuntaPaskaitaUzduotys {

	public static void uzd1() {
		StringBuilder w1 = new StringBuilder("Liepa");
		StringBuilder w2 = new StringBuilder("Antradienis");

		System.out.println(w1);
		System.out.println(w2);

		w1.append(w2);

		System.out.println(w1);

		w1.reverse();

		System.out.println(w1);

		w1.delete(0, 5)
			.delete(4, 6)
			.delete(5, 7)
			.deleteCharAt(w1.length() - 1);

		System.out.println(w1);

		w1.replace(3, w1.length(), "2018");

		System.out.println(w1);

		w1.insert(3, "om ");

		System.out.println(w1);

		w1.delete(0, 7)
			.delete(2, w1.length())
			.reverse();

		System.out.println(w1);
	}

	public static boolean uzd2(String in) {
		StringBuilder strB = new StringBuilder(in.toLowerCase());

		return in.toLowerCase().equals(strB.reverse().toString()) ? true : false;
	}

}
