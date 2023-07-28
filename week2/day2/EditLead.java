package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
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

		//Locate FirstName and populate
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Jennifer"); 

		//Locate Find Leads button & click
		//Using xpath since NO unique id or class name is available
		driver.findElement(By.xpath("//button[@type='button' and text()='Find Leads']")).click();

		//Locate first row in list and click
		//driver.findElement(By.linkText("Jennifer")).click(); // Doesnt work as it is inside a table
		driver.findElement(By.xpath(".//a[contains(text(),'Jennifer')]")).click();

		//Verify title of page
		System.out.println("Page title is :: " + driver.getTitle());	

		//Locate Edit button and click
		driver.findElement(By.linkText("Edit")).click();
		
		//Locate company name, CLEAR and enter value
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Barclays pvt ltd");
		
		//Locate Update button & click
		//Using xpath since NO unique id or class name is available
		driver.findElement(By.xpath("//input[@type='submit' and @value='Update']")).click();
		
		//Confirm the changed name appears
		String updatedCompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Updated company name is ::" + updatedCompanyName);
		
		if(updatedCompanyName.contains("Barclays pvt ltd")) {
			System.out.println("Yes. Updated company name appears");
		}
	}

}
