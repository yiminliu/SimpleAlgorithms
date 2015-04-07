package IntegerAlgorithm;

public class IntConversion {

	int[] convertNumberToArray(int number){
		String string = String.valueOf(number);
		int[] intArray = new int[string.length()];
		for(int i=0; i<string.length(); i++)
			intArray[i] = string.charAt(i);
		return intArray;
	}
}
