package week1.day2.assignment;

public class FindFirstMissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,7,6,8};
		
		// Sort the array
		//Arrays.sort(arr);
		
		int arrLength = arr.length;		 
		int i;
        int temp[] = new int[arrLength + 1];
        
        for (i = 0; i < arrLength; i++) {
            temp[arr[i] - 1] = 1;
        }
 
        int missingNum = 0;
        for (i = 0; i <= arrLength; i++) {
            if (temp[i] == 0)
            	missingNum = i + 1;
        }
        System.out.println(missingNum);
	}

}
