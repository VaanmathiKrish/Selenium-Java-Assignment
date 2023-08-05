package week3.day2.assignment;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cmpArray = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		String[] sortedCmpArray = new String[cmpArray.length];
		
		// Sort the array. it sorts in ascending order
		Arrays.sort(cmpArray);
		
		// Iterate array and reverse it
		int index = 0;
		for(int i = cmpArray.length - 1; i >=0; i--) {
			sortedCmpArray[index] = cmpArray[i];
			index++;
		}
		
		System.out.println("Reversed sorted array is :: " + Arrays.toString(sortedCmpArray));
	}

}
