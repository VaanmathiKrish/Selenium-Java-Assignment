package week1.day2.assignment;

public class FibonacciNumberSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range = 10;
		
		int firstNum = 0, secNum = 1, sum;
		
		System.out.println(firstNum + "\n" + secNum );
		for(int i = 2; i < range; i++) {
			sum = firstNum + secNum;
			System.out.println(sum );
			firstNum = secNum;
			secNum = sum;
		}
	}

}
