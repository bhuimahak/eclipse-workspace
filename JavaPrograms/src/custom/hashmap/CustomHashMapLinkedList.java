package custom.hashmap;

import java.util.Arrays;

public class CustomHashMapLinkedList<K, V> {

	private Entry<K, V>[] buckets;

	private static final int noOfBuckets = 16;

	public CustomHashMapLinkedList() {
		buckets = new Entry[noOfBuckets];
	}

	public void put(K key, V value) {
		int hashCode;
		if (key == null) {
			hashCode = 0;
		} else {
			hashCode = key.hashCode();
		}
		int bucketNo = hash(hashCode);

		if (buckets[bucketNo] == null) { // buckets[bucketNo] is head node of the link list
			Entry<K, V> obj = new Entry<K, V>(key, value);
			buckets[bucketNo] = obj;

		} else {
			boolean foundKey = false;
			Entry<K, V> node = buckets[bucketNo];

			while (node != null) {
				K entKey = node.getKey();
				if (entKey == null) {
					if (key == null) {
						node.setValue(value);
						foundKey = true;
					} else {
						// do nothing;
					}
				} else {
					if (entKey.equals(key)) {
						foundKey = true;
						node.setValue(value);
					}

				}
				node = node.next;
			}

			if (foundKey == false) {
				Entry<K, V> obj = new Entry<K, V>(key, value);

				node = buckets[bucketNo]; // buckets[bucketNo] is headnode of
											// the link list
				while (node.next != null) {
					node = node.next;
				}
				node.next = obj;
			}
		}
	}

	public V get(String key) {
		int hashCode;
		if (key == null) {
			hashCode = 0;
		} else {
			hashCode = key.hashCode();
		}
		int bucketNo = hash(hashCode);
		if (buckets[bucketNo] == null) {
			return null;
		} else {
			Entry<K, V> node = buckets[bucketNo];
			while (node != null) {
				K entKey = node.getKey();
				if (entKey == null) {
					if (key == null) {
						return node.getValue();
					}
				} else {
					if (entKey.equals(key)) {
						return node.getValue();
					}

				}
				node = node.next;
			}
			return null;
		}

	}

	public int hash(int hashCode) {
		hashCode = Math.abs(hashCode);
		int bucket = hashCode % noOfBuckets;
		return bucket;
	}

	@Override
	public String toString() {
		return "CustomHashMapLinkedList [buckets=" + Arrays.toString(buckets) + "]";
	}

	public class Entry<T, S> {
		private T key;
		private S value;
		private Entry<T, S> next;

		private Entry(T key, S value) {
			this.key = key;
			this.value = value;
			this.next = null;
		}

		public T getKey() {
			return key;
		}

		public S getValue() {
			return value;
		}

		private void setValue(S value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return "Entry [key=" + key + ", value=" + value + ", next=" + next + "]";
		}
	}
}
