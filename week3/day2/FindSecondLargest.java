package week3.day2.assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {3,2,11,4,6,7};

		List<Integer> dataList = new ArrayList<Integer>();
		
		for(int i=0; i<data.length; i++) {
			// in case the largest number is duplicated while sorting largest number will be considered while sorting. Hence this condition is added
			if(!dataList.contains(data[i])) { 
				dataList.add(data[i]);
			}
		}
		
		Collections.sort(dataList);
		int secondLargestInt = dataList.get(dataList.size()-2);
		
		System.out.println("Second Largest number is :: " + secondLargestInt);
	}

}
