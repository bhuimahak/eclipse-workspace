package mail.util;

import java.util.HashMap;
import java.util.Map;

public class RandomString {

	public static void main(String[] args) {
		String str = "Domain=abc;username=bhui;name=mahak";
		String[] pairs = str.split(";");
		Map<String, String> keyValueMap = new HashMap<>();
		for(String pair : pairs) {
			System.out.println(pair);
			String[] keyValue = pair.split("=");
			keyValueMap.put(keyValue[0], keyValue[1]);
		}
		System.out.println(keyValueMap);
	}

}
