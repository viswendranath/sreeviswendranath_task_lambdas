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
		return strs.stream().filter(CustomUtilities::isPallindrome).collect(Collectors.toList());
	}
	
	public static boolean isPallindrome(String s){
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		return sb.toString().equals(s);
	}
}
