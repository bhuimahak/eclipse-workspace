package custom.hashmap;

import junit.framework.Assert;

import org.junit.Test;

public class CustomHashmapTestCase {
	
	@Test
	public void testHashMap(){
		CustomHashMapArrayList<String,String> map = new CustomHashMapArrayList<>();
		map.put("Mahak", "Singh");
		Assert.assertEquals("Singh", map.get("Mahak"));
		
		map.put("Arslan", "Qadri");
		Assert.assertEquals("Qadri", map.get("Arslan"));
		
		map.put("Mahak", "Qadri");
		Assert.assertEquals("Qadri", map.get("Mahak"));
		
		map.put(null, "zero");
		Assert.assertEquals("zero", map.get(null));
	}

}
