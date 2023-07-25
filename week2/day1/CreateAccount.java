package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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

		//Locate Accounts tab link & click
		driver.findElement(By.linkText("Accounts")).click();

		//Locate Create Account link & click
		driver.findElement(By.linkText("Create Account")).click();

		//Locate accountName and populate
		driver.findElement(By.id("accountName")).sendKeys("Debit Limited Account_Carol"); 

		//Locate Description and populate
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester"); 

		//Locate LocalName and populate
		driver.findElement(By.id("groupNameLocal")).sendKeys("Carol"); 

		//Locate Site name and populate
		driver.findElement(By.id("officeSiteName")).sendKeys("New York"); 

		//Locate Annual Revenue and populate
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("1253332.00"); 

		//Locate Industry dropdown 
		WebElement element = driver.findElement(By.name("industryEnumId"));
		Select option = new Select(element);
		//populate with one of the dropdown values
		option.selectByVisibleText("Computer Software");

		//Locate Ownership dropdown 
		WebElement ownershipElement = driver.findElement(By.name("ownershipEnumId"));
		option = new Select(ownershipElement);
		//populate with one of the dropdown values
		option.selectByVisibleText("S-Corporation");

		//Locate Source dropdown 
		WebElement sourceElement = driver.findElement(By.id("dataSourceId"));
		option = new Select(sourceElement);
		//populate Source with one of the dropdown values
		option.selectByValue("LEAD_EMPLOYEE");

		//Locate Marketing dropdown 
		WebElement marketingElement = driver.findElement(By.id("marketingCampaignId"));
		option = new Select(marketingElement);
		//populate Marketing campaign with one of the dropdown values
		option.selectByIndex(6);

		//Locate State/Province dropdown 
		WebElement stateElement = driver.findElement(By.id("generalStateProvinceGeoId"));
		option = new Select(stateElement);
		//populate State/Province campaign with one of the dropdown values
		option.selectByValue("TX");

		//Locate Create Account dropdown 
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click(); 
	}

}
