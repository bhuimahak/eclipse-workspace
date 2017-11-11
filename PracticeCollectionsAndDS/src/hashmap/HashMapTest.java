package hashmap;


public class HashMapTest {

	public static void main(String[] args) {
		CustomHashMap<String, String> map = new CustomHashMap<>();
		
		map.put("A", "1");
		System.out.println(map);
		map.put("A", "2");
		System.out.println(map);
		map.put(null,"2");
		System.out.println(map);

		String value = map.get(null);
		System.out.println(value);

	}

}
