package custom.hashmap;

public class HashMapTest {

	public static void main(String[] args) {
		CustomHashMapArrayList<String, String> map = new CustomHashMapArrayList<>();
		System.out.println(map);
		map.put("mahak", "MAHAK");
		System.out.println(map);
		map.put("arslan", "ARSLAN");
		System.out.println(map);
		map.put("mahak", "BHUI");
		System.out.println(map);
		map.put(null, "NULL");
		System.out.println(map);
		map.put(null, "NULL NULL");
		System.out.println(map);

		System.out.println(map.get("mahak"));
		System.out.println(map.get("arslan"));
		System.out.println(map.get(null));
		System.out.println(map.get("vikram"));

	}

}
