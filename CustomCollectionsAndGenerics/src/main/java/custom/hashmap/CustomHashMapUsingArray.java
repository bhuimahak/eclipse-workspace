package custom.hashmap;

import java.util.ArrayList;
import java.util.List;

public class CustomHashMapUsingArray {
	static final int numberOfBuckets = 16;

	List<Entry>[] buckets;

	@SuppressWarnings("unchecked")
	public CustomHashMapUsingArray() {
		buckets = (List<Entry>[])new List[numberOfBuckets];
		for (int i = 0; i < numberOfBuckets; i++) {
			buckets[i] =  new ArrayList<Entry>();	
		}
	}

	public void put(String key, String value) {
		int hashCode;
		//boolean foundKey = false;
		if (key == null) {
			hashCode = 0;
		}
		else{
			hashCode = key.hashCode();
		}
		int bucketNo = hash(hashCode);
		List<Entry> bucket = buckets[bucketNo];
		for(Entry existingObj : bucket){
			if(existingObj != null){
				String entKey = existingObj.getKey();
				if(entKey == null){
					
				}
			}
		}	
		
	}
	
	public int hash(int hashCode){
		int bucket = (Math.abs(hashCode)) % numberOfBuckets;
		return bucket;
	}
	
	public class Entry{
		private String key;
		private String value;
		
		public Entry(String key, String value){
			this.key = key;
			this.value = value;
			}
		public String getValue(){
			return this.value;
			
		}
		public String getKey(){
			return key;
			
		}
	}
}
