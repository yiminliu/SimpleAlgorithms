package IntegerAlgorithm;

public class Summation {

	//running time O(1)
	public static int summation(int n){
		int sum = 0;
		try{
		  sum = n * (n + 1)/2;
		}
		catch(Exception e){ //catch overflow 
			throw e;    
		}
		return sum;
	}
	
	//running time: O(1)
	public static int summation(int start, int end){
		int sum = 0;
		if(end >= start){
			int bigSum = end*(end+1)/2;
			//start--;
			int littleSum = start*(start+1)/2;
			sum = bigSum - littleSum;
	    }
		return sum;
	}
	
	//running time O(n)
	public static int linerSum(int n){
		int sum = 0;
		try{
		   for(int i=0; i<=n; i++)
			  sum += i; 
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return sum;
	}
	
}
