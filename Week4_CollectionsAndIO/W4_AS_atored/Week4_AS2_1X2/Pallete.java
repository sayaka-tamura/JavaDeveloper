package Week4_AS2_1X2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Pallete {
	
	private Map<Integer, String> pallete = null;
	
	public Pallete(){
		pallete = new HashMap<Integer, String>();
	}
	
	public void put(int i, String string) {
		pallete.put(i, string);
	}
	
	public void changePallete(int i, String s) {
		if(pallete.containsKey(i)) {
			String newColor = pallete.get(i);
			pallete.put(i, newColor);
		} else 
			pallete.put(i, s);
	}
	
	// #2-1
	public void printPallete() {
		for(Map.Entry<Integer, String> entry : pallete.entrySet()) {
			System.out.format("%-2d | %14s\n", entry.getKey(), entry.getValue());
		}
	}
	
	// #2-2
	public void iterator() {
		Iterator<Map.Entry<Integer, String>> iterator = pallete.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			System.out.format("%-2d | %14s\n", entry.getKey(), entry.getValue());
		}
	}

}
