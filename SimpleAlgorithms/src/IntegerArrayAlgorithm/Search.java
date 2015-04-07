package IntegerArrayAlgorithm;

public class Search {

	//run time: O(log(n))
	public int binarySearch(int[] array, int key){
		int low = 0;
		int high = array.length -1;
		int mid = (low + high)/2;
		while(low < high){
			mid =(low + high)/2;
			if(key == array[mid])
			   return mid;
			else if(key < array[mid])
			   high = mid -1;
			else if(key > array[mid])
			   low = mid + 1;
		}
		return -1;
	}
	
	//running time: O(n)
	public int linerSearch(int[] array, int key){
		for(int i=0; i<array.length; i++){
			if(key == array[i])
			   return i;	
		}
		return -1;
	}
}
