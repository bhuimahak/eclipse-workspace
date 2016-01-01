package custom.hashset;

import java.util.List;
import java.util.ArrayList;

public class CustomHashSet {

	static final int numberOfbucktes = 14;
	List<List<String>> buckets;

	public CustomHashSet() {
		buckets = new ArrayList<List<String>>();
		for (int i = 0; i < numberOfbucktes; i++) {
			List<String> myList = new ArrayList<String>();
			buckets.add(myList);
		}
	}

	public void add(String value) {
		boolean foundElement = false;
		int hashValue;
		if (value == null) {
			hashValue = 0;

		} else {
			hashValue = value.hashCode();
		}

		int bucketNo = hash(hashValue);
		List<String> bucket = buckets.get(bucketNo);
		for (String existingObj : bucket) {
			if (existingObj != null) {
				if (existingObj.equals(value)) {
					foundElement = true;
					break;
				}
				else {
					// Do nothing
				}
			} 
			else {
				if (value == null) {
					foundElement = true;
					break;
				}
			}
		}
		if (foundElement == false) {
			bucket.add(value);
		}
		

	}

	public int hash(int hashCode) {
		int bucket = (Math.abs(hashCode)) % numberOfbucktes;
		return bucket;
	}

	@Override
	public String toString() {
		return ("Set is" + buckets);
	}
	
}
