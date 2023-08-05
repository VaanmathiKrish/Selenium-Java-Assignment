package week3.day2.assignment;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] textArr = text.split(" ");
		
		// Removes duplicate words logic
		for(int i=0; i<textArr.length; i++) {
			for(int j=0; j<textArr.length; j++) {
				if(i!=j && textArr[i].equals(textArr[j])) {
					textArr[j] = "";
				}
 			}
		}
		
		String strWithoutDuplicates = "";
		
		//Iterates the updated String array and creates the string
		for(int k=0; k< textArr.length; k++) {
			if(k< textArr.length && !textArr[k].equalsIgnoreCase("")) { // Second condition is to remove white space before & after removed duplicate words
				strWithoutDuplicates = strWithoutDuplicates.concat(textArr[k]).concat(" ");
			} else {
				strWithoutDuplicates = strWithoutDuplicates.concat(textArr[k]);
			}
		}
		
		System.out.println("Duplicate removed text :: " + strWithoutDuplicates);
	}

}
