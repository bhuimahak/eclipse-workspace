package collectionImplementation;

import java.util.ArrayList;
import java.util.List;

public class CustomHashSet<K> {

	private static final int noOfBuckets = 20;
	// List<List<K>> buckets; y can't we use this?

	List<List<Entry>> buckets;

	public CustomHashSet() {
		buckets = new ArrayList<List<Entry>>();
		for (int i = 0; i < noOfBuckets; i++) {
			buckets.add(new ArrayList<Entry>());
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
		List<Entry> bucket = buckets.get(bucketNo);
		for (Entry entryObj : bucket) {
			K entryElement = entryObj.getElement();
			if (entryElement == null && element == null) {
				isElementAdded = false;
			} else if (entryElement != null && entryElement.equals(element)) {
				isElementAdded = false;
			}
		}
		if (isElementAdded == true) {
			bucket.add(new Entry(element));
		}
		return isElementAdded;
	}

	@Override
	public String toString() {
		return "CustomHashSet [Set is=" + buckets + "]";
	}

	private int hash(int hashcode) {
		int bucket = (Math.abs(hashcode)) % noOfBuckets;
		return bucket;
	}

	class Entry {
		private K element;

		public Entry(K element) {
			this.element = element;
		}

		public K getElement() {
			return element;
		}

	}

}
