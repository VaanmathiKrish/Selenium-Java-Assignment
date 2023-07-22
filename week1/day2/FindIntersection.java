package week1.day2.assignment;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] firstArr = {3,2,11,4,6,7};
		int[] secondArr = {1,2,8,4,9,7};
		
		int firstLength = firstArr.length;
		int secondLength = secondArr.length;
		
		System.out.println("Common numbers are:");
		for(int i = 0; i < firstLength; i++) {
			for(int j=0; j< secondLength; j++) {
				if(firstArr[i] == secondArr[j]) {
					System.out.println(firstArr[i]);
				}
			}
		}
	}

}
