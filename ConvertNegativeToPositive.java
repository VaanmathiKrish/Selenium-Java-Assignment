package week1.day2.assignment;

public class ConvertNegativeToPositive {
	
	public int returnNumber(int num) {
		return Math.abs(num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int negativeNumber = -250;
		ConvertNegativeToPositive cnp = new ConvertNegativeToPositive();
		System.out.println("Converted positive number is :: " + cnp.returnNumber(negativeNumber));
	}

}
