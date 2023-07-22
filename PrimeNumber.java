package week1.day2.assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 13;
		int ind = 0;
		int dividedNum = num/2;
		
		// checking if number is not 0 & 1
		if(num == 0 || num == 1) {
			System.out.println("Not a Prime");
		} else {
			// finding the reminder during each iteration
			for(int i = 2; i <=dividedNum; i++) {		
				if(num%i == 0) {
					
					System.out.println("Not a prime");
					ind = 1;
					break;
				}
			}
			if(ind == 0) {
				System.out.println("Prime");
			}
		}
		
		
	}

}
