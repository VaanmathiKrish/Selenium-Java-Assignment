package week3.day2.assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		
		int index = 0;
		for(int i=0; i<arr.length; i++) { 
			index = i+1;
			if(index != arr[i]) {
				System.out.println("Missing element is :: " + index);
				break;
			}
		}
	}

}
