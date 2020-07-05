package viswendranath.task_lambdas;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PallindromeFilterTest {

	@Test
	public void pallindromeTest() {
		List<String> strs = new ArrayList<String>();
		strs.add("abc");
		strs.add("abab");
		strs.add("baab");
		strs.add("cbbbbc");
		strs.add("abcba");
		strs.add("abababa");
		
		List<String> fstrs = CustomUtilities.getPallindromeStrings(strs);
		assertEquals(Arrays.asList(new String[] {"baab","cbbbbc", "abcba", "abababa"}), fstrs);
	}
}
