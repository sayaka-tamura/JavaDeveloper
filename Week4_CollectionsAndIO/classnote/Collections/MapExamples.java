import java.util.HashMap;
import java.util.Map;

public class MapExamples {
	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("Zara", "8");
		m1.put("Mahnaz", "31");
		m1.put("Ayan", "12");
		m1.put("Daisy", "14");
		System.out.print("\nMap Elements: ");
		System.out.print(m1);
		System.out.println();
		
		for(Map.Entry<String, String> i : m1.entrySet())
			System.out.println(i.getKey() + " = " + i.getValue());
	}
}
