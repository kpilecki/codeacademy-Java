package paskaita11_10;

import java.util.Collection;
import java.util.Map;

public class Calculator extends BasicCalculator{

	public int sudaugint(int a, int b) {
		return a * b;
	}
	
	public float dalinti(int a, int b) {
		return (float)a / b;
	}
	
	@Override
	public int prideti(int a, int b) {
		int rez = super.prideti(a, b);
		System.out.println("Sudeties veiksmas " + rez);
		return rez;
	}
	
	public void spausdink(Collection<Asmuo> list) {
		list.forEach( el -> {
			el.pasisveikinti();
		});
	}
	public void spausdink(Map<Integer,Asmuo> map) {
		map.keySet().forEach( key -> {
			map.get(key).pasisveikinti();
		});
	}
}
