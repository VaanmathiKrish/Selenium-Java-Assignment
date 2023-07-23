package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Load driver
		ChromeDriver driver = new ChromeDriver();

		//Load URL
		driver.get("http://leaftaps.com/opentaps/control/login");

		//Maximize window
		driver.manage().window().maximize();

		//Locate username and password and populate
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager"); 
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//Locate Login button & click
		driver.findElement(By.className("decorativeSubmit")).click();

		//Locate CRM/SFA link & click
		driver.findElement(By.linkText("CRM/SFA")).click();

		//Locate Leads tab link & click
		driver.findElement(By.linkText("Leads")).click();

		//Locate Create Lead link & click
		driver.findElement(By.linkText("Create Lead")).click();

		//Locate CompanyName and populate
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("KPMG pvt Ltd"); 

		//Locate FirstName and populate
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jennifer"); 

		//Locate LastName and populate
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Carol"); 

		//Locate FirstName(Local) and populate
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Jenni"); 

		//Locate Department and populate
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Sales"); 

		//Locate Description and populate
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Worked in Sales "); 

		//Locate Email address and populate
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jcarol@gmail.com"); 
		
		//Locate State/Province dropdown 
		WebElement element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select option = new Select(element);
		//populate with one of the dropdown values
		option.selectByVisibleText("New York");
		
		//Locate Create Lead button & click
		driver.findElement(By.className("smallSubmit")).click();
	}

}
