package week1.day2.assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 828;
		int revNum, sum = 0, tempNumber;
		tempNumber = num;
		while(num > 0){
			// gets reminder . Here 8
			revNum = num % 10;
			sum = (sum * 10) + revNum;
			num = num/10;
		}
		
		// compare reversed number and actual number here
		if(sum == tempNumber) {
			System.out.println("palindrome number");
		} else {
			System.out.println("not palindrome number");
		}

	}

}
