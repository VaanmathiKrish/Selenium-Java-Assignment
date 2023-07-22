package week1.day1.assignment;

public class Mobile {
	
	public void makeCall() {
		String mobileModel = "Samsung s22";
		float mobileWeight = 197.25f;
		
		System.out.println("Mobile model :: " +mobileModel);
		System.out.println("Mobile weight :: " +mobileWeight);
	}
	
	public void sendMsg() {
		boolean isFullCharged = true;
		int mobileCost = 25000;
		
		System.out.println("Is fuly charged :: " +isFullCharged);
		System.out.println("Mobile cost :: " +mobileCost);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mobile = new Mobile();
		
		mobile.makeCall();
		mobile.sendMsg();
		
		System.out.println("\nThis is my mobile");
	}

}
