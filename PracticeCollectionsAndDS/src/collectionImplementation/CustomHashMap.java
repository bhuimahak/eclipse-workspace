package collectionImplementation;

import java.util.ArrayList;
import java.util.List;

//create a custom hash map using arraylist

public class CustomHashMap<K, V> {

	private static final int noOfBuckets = 20;
	List<List<Entry>> buckets;
	int hashCode;

	public CustomHashMap() {
		for (int i = 0; i < noOfBuckets; i++) {
			buckets = new ArrayList<List<Entry>>();
			buckets.add(new ArrayList<Entry>());
		}
	}

	public void put(K key, V value) {
		int hashCode;
		hashCode = key.hashCode();
		int bucketNo = hash(hashCode);
		List<Entry> bucket = buckets.get(bucketNo);
		if (bucket == null) {
			bucket = new ArrayList<Entry>();
			bucket.add(new Entry(key, value));
		} else {
			boolean foundKey = false;
			for (Entry e : bucket) {
				K entryKey = e.getKey();
				if (entryKey == null) {
					if (key == null) {
						e.setValue(value);
						foundKey = true;
					}
				} else if (entryKey.equals(key)) {
					e.setValue(value);
					foundKey = true;
				}
			}
			if (foundKey = false) {
				bucket.add(new Entry(key, value));
			}
		}
	}

	public V get(K key) {
		int hashCode;
		if (key == null) {
			hashCode = 0;
		} else {
			hashCode = key.hashCode();
		}
		int bucketNo = hash(hashCode);
		List<Entry> bucket = buckets.get(bucketNo);
		if (bucket == null) {
			return null;
		} else {
			for (Entry entryObject : bucket) {
				K entryKey = entryObject.getKey();
				if (entryKey == null) {
					if (key == null) {
						return entryObject.getValue();
					}
				} else if (entryKey.equals(entryObject.getKey())) {
					return entryObject.getValue();
					// foundKey = true;
				}
			}
		}
		return null;
	}

	// returns bucket number depending upon the hash code
	public int hash(int hashCode) {
		return (Math.abs(hashCode)) % noOfBuckets;
	}

	class Entry {

		private K key;
		private V value;

		public Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}

		public K getKey() {
			return this.key;
		}

		public V getValue() {
			return this.value;
		}

		public void setValue(V value) {
			this.value = value;
		}
	}
}
