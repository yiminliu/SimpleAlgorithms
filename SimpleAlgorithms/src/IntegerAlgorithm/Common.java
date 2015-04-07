package IntegerAlgorithm;

public class Common {

	public boolean isPrime(int number){
		if(number < 1)
		   return false;
		for(int i=2; i<number; i++){
			if(number % 2 == 0)
			   return false;	
		}
		return true;
	}
	
	public int findGCD(int n1, int n2){
		if(n2 == 0)
		   return n1;
		else
		   return findGCD(n2%n1, n1);
	}
}
