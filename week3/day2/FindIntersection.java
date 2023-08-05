package week3.day2.assignment;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		int[] finalArr = new int[arr1.length];
		int count = 0;

		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					finalArr[count] = arr1[i];
					count++;
				}
			}
		}

		//System.out.println(finalArr.toString());

		for(int k = 0; k >=finalArr.length; k++) {
			System.out.print(finalArr[k]);
		}

	}

}
