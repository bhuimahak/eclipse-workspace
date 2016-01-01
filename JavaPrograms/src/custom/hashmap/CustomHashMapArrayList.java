package custom.hashmap;

import java.util.List;
import java.util.ArrayList;


//HashMap using Arraylist of Arraylist
public class CustomHashMapArrayList <K,V> {
	 //List<Entry>[] arr = new List[5]; //optional --using array
	// of arraylist

	// instance variables of this class
	static final int numberOfBuckets = 16;
	List<List<Entry>> buckets;

	public CustomHashMapArrayList() {
		buckets = new ArrayList<List<Entry>>();
		for (int i = 0; i < numberOfBuckets; i++) {
			buckets.add(new ArrayList<Entry>());
		}
	}

	// Logic to put entry object in the bucket
	public void put(K key, V value) {
		int hashCode;
		if (key == null) {
			hashCode = 0;
		} else {
			hashCode = key.hashCode();
		}
		int bucketNo = hash(hashCode);
		List<Entry> bucket = buckets.get(bucketNo);
		if (bucket == null) {
			bucket = new ArrayList<Entry>();
			Entry obj = new Entry(key, value);
			bucket.add(obj);
		} else {
			boolean foundKey = false;
			for (Entry entryObj : bucket) {
				K entKey = entryObj.getKey();
				if (entKey == null) {
					if (key == null) {
						entryObj.setValue(value);
						foundKey = true;
					}
				} else if (entKey.equals(key)) {
					entryObj.setValue(value);
					foundKey = true;
				}
			} // end for loop
			if (foundKey == false) {
				Entry obj = new Entry(key, value);
				bucket.add(obj);
			}

		}// end else loop

	}// end put method

	public V get(K key) { //get value of the passed key
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
			for (Entry entryObj : bucket) {
				K entKey = entryObj.getKey();
				if (entKey == null) {
					if (key == null) {
						return entryObj.getValue();
					}
				} else {
					if (entKey.equals(key)) {
						return entryObj.getValue();
					}
				}
				// if ((entKey == key) || (entKey.equals(key))) {
				// return entryObj.getValue();
				// }
			}
			return null;
		}
	}

	private int hash(int hashCode) {
		hashCode = Math.abs(hashCode);
		int bucketNo = (hashCode % numberOfBuckets);
		return bucketNo;
	}

	@Override
	public String toString() {
		return "CustomHashMap {buckets=" + buckets + "}";
	}

	// inner class
	public class Entry {

		private K key;
		private V value;

		private Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}

		public K getKey() {
			return key;
		}

		public V getValue() {
			return value;
		}

		private void setValue(V value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return "Entry {key=" + key + ", value=" + value + "}";
		}
	}

}
