import java.util.HashMap;

public class hashMapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		print(map);
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("viabhav", 20);
		System.out.println("Size of map is : " + map.size());
		print(map);
		
		if(map.containsKey("vishal")) {
			Integer a = map.get("vishal");
			System.out.println("value for key \"vishal\" is: " + a);
		}
		map.clear();
		print(map);
	}

	public static void print(HashMap<String, Integer> map) {
		if(map.isEmpty())
			System.out.println("map is empty");
		else
			System.out.println(map);
		map.put("hhh", 4444);
		
	}
}
