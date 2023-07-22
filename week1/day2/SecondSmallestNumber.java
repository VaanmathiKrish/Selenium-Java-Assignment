package week1.day2.assignment;

import java.util.Arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {83,45,67,32,89,22 };
		
		Arrays.sort(arr);
		System.out.println("Second smallest number is :: " + arr[1]);
	}

}
