package custom.hashmap;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class customHashMapLinkedList_Test {

	public static CustomHashMapLinkedList<String, String> map = new CustomHashMapLinkedList<>();

	String key;
	String value;

	public customHashMapLinkedList_Test(String key, String value) {
		this.key = key;
		this.value = value;
	}

	@Parameters
	public static List<Object[]> getData() {
		List<Object[]> dataList = new ArrayList<>();

		Object[] data1 = { "Mahak", "Bhui" };
		dataList.add(data1);

		Object[] data2 = { "Vikram", "Jeet" };
		dataList.add(data2);
		
		Object[] data3 = { "Mahak", "Singh" };
		dataList.add(data3);

		Object[] data4 = { null, "Zero" };
		dataList.add(data4);

		return dataList;
	}

	@Test
	public void TestHashMap() {
		map.put(key, value);
		Assert.assertEquals(value, map.get(key));

	}

}
