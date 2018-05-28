package classNote;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class ForEachExample1 {
	public static void main(String[] args) {
//		List<String> names = new ArrayList<String>();
//		names.add("Luke");
//		names.add("Lance");
//		names.add("Mike");
//		names.add("Carl");
//		names.add("Larry");
		
//		names.forEach((name) -> {
//			System.out.println(name);
//		});
		//same this as above
		// names.forEach(name -> System.out.println(name));
		
//		Map<String, String> myMap = new HashMap<String, String>();
//		myMap.put("1", "uno");
//		myMap.forEach((k,v) -> {
//			System.out.println(v);
//		});
		
		List<Person> people = new ArrayList<Person>();
		Person p1 = new Person();
		p1.setName("Luke");
		p1.setAge(24);
		p1.setEmail("luke@gmail.com");
		people.add(p1);
		
		Person p2 = new Person();
		p2.setName("Mike");
		p2.setAge(30);
		p2.setEmail("mike@gmail.com");
		people.add(p2);
		
		Person p3 = new Person();
		p3.setName("Lance");
		p3.setAge(34);
		p3.setEmail("lance@gmail.com");
		people.add(p3);
		
//		people.forEach((p) -> {
//			System.out.println(p.getName());
//			System.out.println(p.getAge());
//		});
		
//		people.stream().filter((n)->{
//			return n.getName().startsWith("L");
//		}).map((n)->{
//			return n.getName().toUpperCase();
//		}).sorted().forEach((n)->{
//			System.out.println(n);
//		});
//		
		
//		Stream.of("Luke","Lance","Mike", "Bob","Larry","Marry")
//		.map((str)->{
//			// System.out.println(str);
//			return str;
//		}).filter((str)->str.startsWith("L"))
//		.sorted().forEach((str)->{
//			System.out.println(str);
//		});
//		
		IntStream.range(0, people.size()).filter((p)->{
			return people.get(p).getName().startsWith("L");
		}).forEach((p)->{
			System.out.println(people.get(p).getName());
		});
	}
}
