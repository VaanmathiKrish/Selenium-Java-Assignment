package week1.day1.assignment;

public class Bike {
	Car car = null;
	
	// Creating method to create object for Car class and call the methods
	public void callCarMethod() {
		car = new Car();
		
		// Calling methods within Car class
		car.applyBreak();
		car.soundHorn();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike = new Bike();
		bike.callCarMethod();
	}

}
