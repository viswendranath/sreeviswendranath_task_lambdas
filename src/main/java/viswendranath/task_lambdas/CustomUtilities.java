package viswendranath.task_lambdas;

import java.util.*;
import java.util.stream.Collectors;

public class CustomUtilities {
	
	private CustomUtilities() {}
	
	public static double getAverage(List<Integer> numbersList) {
		double avg;
		
		avg = numbersList.stream().reduce(0, (sum, val)-> sum+val);
		avg /= numbersList.size();
		
		return avg;
	}
	
	public static List<String> getFilteredStrings(List<String> stringsList){
		return stringsList.stream().filter(s -> (s.startsWith("a") && s.length() == 3)).collect(Collectors.toList());
	}
	
	public static List<String> getPallindromeStrings(List<String> strs){
		return strs.stream().filter(s -> {
			StringBuffer sb = new StringBuffer(s);
			sb.reverse();
			if(sb.toString().equals(s))
				return true;
			return false;
		}).collect(Collectors.toList());
	}
}
