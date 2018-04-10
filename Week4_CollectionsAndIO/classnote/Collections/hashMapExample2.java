import java.util.HashMap;

public class hashMapExample2 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("viabhav", 20);
		System.out.println("Size of map is : " + map.size());
		
		for(Integer num: map.values())
			System.out.println(num);
		
		for(String key: map.keySet())
			System.out.println(key);
		
		// A taste of Lambda
		map.forEach((keys, values) -> {//sshhh...
			System.out.println(keys + " = " + values);
		});
	}
}

