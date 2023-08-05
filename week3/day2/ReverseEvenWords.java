package week3.day2.assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "I am a software tester";

		String[] textArr = test.split(" ");

		// iterates to find even position and calls "reversedWord" method to reverse string
		for(int i=0; i<textArr.length; i++) {
			if(i > 0 && i%2 != 0) {
				textArr[i] = reversedWord(textArr[i]);
			}
		}

		String completeReversedStr = "";
		//Iterates the updated String array and creates the string with reversed Even index words
		for(int k=0; k< textArr.length; k++) {
			if(k< textArr.length) {
				completeReversedStr = completeReversedStr.concat(textArr[k]).concat(" ");
			} else {
				completeReversedStr = completeReversedStr.concat(textArr[k]);
			}
		}
		
		System.out.println("Final even reversed String is :: " + completeReversedStr);
	}

	/**
	 * Method reverses the even position word sent to this method
	 * @param str
	 * @return String
	 */
	private static String reversedWord(String str) {
		char[] charStr = str.toCharArray();
		char[] reversedChar = new char[charStr.length];
		int j = 0;

		for(int i = charStr.length - 1; i >=0; i--) {
			reversedChar[j] = charStr[i];
			j++;
		}

		String reversedStr = new String(reversedChar);		
		return reversedStr;
	}

}
