package StringAlgorithm;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Common {

	public String reverse(String origString){
		StringBuilder sb = new StringBuilder();
		for(int i=origString.length() -1; i>0; i--){
			sb.append(origString.charAt(i));
		}
		return sb.toString();
	}
	
	public boolean containDuplicate(String[] stringArray){
		List<String> list = Arrays.asList(stringArray);
		Set<String> set = new HashSet<>(list);
		return list.size() == set.size();
	}
	
	public String findFirstDuplicate(String[] strings){
		Set<String> set = new HashSet<>();
	    for(int i=0; i<strings.length; i++){
		    if(!set.add(strings[i]))
		       return strings[i]; 
	    }	
	    return null;
    }
	
	public String[] removeDuplicates(String[] strings){
		Set<String> set = new HashSet<>(Arrays.asList(strings));
		return (String[])set.toArray();
	}
	
	public boolean isSameCombination(String s1, String s2){
		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();
        return charArray1.equals(charArray2);		
	}
	public boolean isPalindrome(String string){
		String reverse = new StringBuilder(string).reverse().toString();
		return string.equals(reverse);
	}
	
	public void sortStrings(String[] strings){
		Arrays.sort(strings, String.CASE_INSENSITIVE_ORDER);
	}
	
	public void sortString(String string){
		Arrays.sort(string.toCharArray());
	}
	
}
