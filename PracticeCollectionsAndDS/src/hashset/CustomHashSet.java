package hashset;

import java.util.ArrayList;
import java.util.List;

public class CustomHashSet<K> {

	private static final int noOfBuckets = 20;
	// List<List<K>> buckets; y can't we use this?

	List<List<K>> buckets;

	public CustomHashSet() {
		buckets = new ArrayList<List<K>>();
		for (int i = 0; i < noOfBuckets; i++) {
			buckets.add(new ArrayList<K>());
		}
	}

	public boolean add(K element) {
		boolean isElementAdded = true;
		int hashcode;
		if (element == null) {
			hashcode = 0;
		} else {
			hashcode = element.hashCode();
		}
		int bucketNo = hash(hashcode);
		List<K> bucket = buckets.get(bucketNo);
		for (K entryObj : bucket) {
			if (entryObj == null && element == null) {
				isElementAdded = false;
			} else if (entryObj != null && entryObj.equals(element)) {
				isElementAdded = false;
			}
		}
		if (isElementAdded == true) {
			bucket.add(element);
		}
		return isElementAdded;
	}

	public List<K> getAllValues() {
		List<K> listToReturn = new ArrayList<K>();
		for (List<K> bucket : buckets) {
			for (K value : bucket) {
				listToReturn.add(value);
			}
		}
		return listToReturn;
	}

	@Override
	public String toString() {
		return "CustomHashSet [Set is=" + buckets + "]";
	}

	private int hash(int hashcode) {
		int bucket = (Math.abs(hashcode)) % noOfBuckets;
		return bucket;
	}

}
