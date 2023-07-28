package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Load driver
		ChromeDriver driver = new ChromeDriver();

		//Load URL
		driver.get("http://leaftaps.com/opentaps/control/login");

		//Maximize window
		driver.manage().window().maximize();

		// FIND LEAD

		//Locate username and password and populate
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager"); 
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//Locate Login button & click
		driver.findElement(By.className("decorativeSubmit")).click();

		//Locate CRM/SFA link & click
		driver.findElement(By.linkText("CRM/SFA")).click();

		//Locate Leads tab link & click
		driver.findElement(By.linkText("Leads")).click();

		//Locate Find Leads link & click
		driver.findElement(By.linkText("Find Leads")).click();

		//Locate Phone tab and click
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

		//Locate area code, phone number & click
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).clear();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("91");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("7894561232");

		//Locate Find Leads button & click
		//Using xpath since NO unique id or class name is available
		driver.findElement(By.xpath("//button[@type='button' and text()='Find Leads']")).click();

		Thread.sleep(3000);
		
		//Locate and find leadId
		String leadId = driver.findElement(By.xpath("(.//div[contains(@class,'partyId')]/a[1])[2]")).getText();
		System.out.println("Lead Id is :: " + leadId);

		//Locate first row in list and click
		//driver.findElement(By.linkText("Joseph")).click(); // Doesnt work as it is inside a table
		driver.findElement(By.xpath(".//a[contains(text(),'Joseph')]")).click();
		
		//Locate and find leadId
//		WebElement element = driver.findElement(By.name("targetPartyId"));
//		String leadId = element.getAttribute("value");		
//		System.out.println("Lead Id is :: " + leadId);

		//Locate Delete button and click
		driver.findElement(By.linkText("Delete")).click();

		//Locate Find Leads link & click
		driver.findElement(By.linkText("Find Leads")).click();

		//Locate Lead Id & click
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);

		//Locate Find Leads button & click
		//Using xpath since NO unique id or class name is available
		driver.findElement(By.xpath("//button[@type='button' and text()='Find Leads']")).click();
		
		Thread.sleep(5000);

		//Locate No records to display content
		WebElement element1 = driver.findElement(By.xpath(".//div[contains(text(),'No records to display')]"));
		String message = element1.getText();
		System.out.println("Message is :: "+ message);

		//Close the browser
		driver.close();
	}

}
