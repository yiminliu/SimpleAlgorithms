package IntegerArrayAlgorithm;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;


public class Common {

	public int findMax(int[] array){
		int max = array[0];
		for(int i=1; i<array.length; i++){
		     if(array[i] > max)
		    	max = array[i]; 
		}
		return max;
	}
	
	public int findMin(int[] array){
		int min = array[0];
		for(int i=1; i<array.length; i++){
		     if(array[i] < min)
		    	min = array[i]; 
		}
		return min;
	}
	
	public int getMedian(int[] array){
		int n = array.length;
		if(n % 2 == 0)
		   return (array[n/2] + array[n/2 - 1])/2;
		else
		   return array[n/2];
	}
	
	//given a sequence of numbers from 0 to n in an array, but one number is missing
	public int findMissingNumber(int[] array){
        int n = array.length + 1;  
		return (n * (n+1)/2) - ((n-1) * n/2);   
	}
	
	public int findFirstDplicate(int[] array){
		for(int i=0; i<array.length-1; i++){
			for(int j=1; j<array.length; j++){
		     	if(array[i] == array[j])
  			       return array[i];	
			} 	
		}
		return -1;
	}
	
	public Map<Integer, Integer> findDuplicats(int[] array){
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length; j++){
			    if(array[i] == array[j])
			       map.put(array[i], map.get(array[i]) == null ? 1 : map.get(array[i]) + 1);	
	 	    }
	    }
		return map;
	}	
	
	Map<Integer, Integer> findFrequency(int[] array){
	    Map<Integer, Integer> map = new HashMap<>();
	    for(int i=0; i<array.length; i++){
	        map.put(array[i], map.get(array[i]) == null ? 1 : map.get(array[i]) + 1);	
	    }
	    return map;
	}
	
	public Set<Integer> findCommonFromTwoArray(int[] a, int[] b){
		Set<Integer> setA = new HashSet(Arrays.asList(a));
		Set<Integer> setB = new HashSet(Arrays.asList(b));
		setB.retainAll(setA);
		return setB;
	}
	
	public int[] findTopIntegers(int[] array, int k){
		Arrays.sort(array);
		return Arrays.copyOfRange(array, k,  array.length-1);
	}
	
	public void reverse(int[] array){
		int low = 0;
		int high = array.length -1;
		while(low <= high){
		    int temp = array[low];
		    array[low] = array[high];
		    array[high] = temp;
		    low++;
		    high--;
		}
	}
	public int[] createIntArray(int arraySize){
		int seed = 47;
		int range = 50;
		Random rand = new Random(seed);
		int[] array = new int[arraySize];
		for(int i=0; i<arraySize; i++){
			array[i] = rand.nextInt(range);
		}
		return array;
	}
	
	
}
