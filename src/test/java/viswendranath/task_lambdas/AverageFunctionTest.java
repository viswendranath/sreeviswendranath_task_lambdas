package viswendranath.task_lambdas;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AverageFunctionTest{

	@Test
	public void averageFunctionTest() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		double avg = CustomUtilities.getAverage(l);
		assertEquals(2.0, avg, 1000);
	}
	
}
