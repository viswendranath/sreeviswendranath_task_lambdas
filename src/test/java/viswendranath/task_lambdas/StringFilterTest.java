package viswendranath.task_lambdas;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class StringFilterTest {

	
	@Test
	public void stringFilterTest1() {
		List<String> names = new ArrayList<String>();
		names.add("avinash");
		names.add("avi");
		names.add("viswendra");
		names.add("nani");
		names.add("chintu");
		names.add("avs");
		
		List<String> filteredStrings = CustomUtilities.getFilteredStrings(names);
		assertEquals(Arrays.asList(new String[] {"avi","avs"}), filteredStrings);
	}
	
	@Test
	public void stringFilterTest2() {
		// Test empty list
		assertEquals(new ArrayList<String>(), CustomUtilities.getFilteredStrings(new ArrayList<String>()));
	}
}
