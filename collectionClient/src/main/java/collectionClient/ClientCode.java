package collectionClient;

import custom.hashmap.CustomHashMapArrayList;

public class ClientCode {

	public static void main(String[] args) {
		CustomHashMapArrayList<String, String> customMap = new CustomHashMapArrayList<>();

		customMap.put("Mahak", "Bhui");
		customMap.put("Arslan", "Qadri");

		String valueOfMahak = customMap.get("Mahak");
		String valueOfArslan = customMap.get("Arslan");
		System.out.println("Values for key1 and key2 are: " + valueOfMahak + " " + valueOfArslan);
	}
}
