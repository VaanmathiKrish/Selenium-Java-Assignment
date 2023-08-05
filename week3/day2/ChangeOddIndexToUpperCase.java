package week3.day2.assignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "changeme";
		
		char[] testArr = test.toCharArray();
		
		//iterate to get the odd indexes
		for(int i=1; i<testArr.length; i+=2) {
			if(i%2 != 0) {
				testArr[i] = Character.toUpperCase(testArr[i]);
			}			
		}
		// convert char array to String
		String changedTest = new String(testArr);
		System.out.println("updated test is :: " + changedTest);
	}

}
