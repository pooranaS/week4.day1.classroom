package week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// Step 2: Instantaite the ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		// Loads a new web page in the current browser window
		// Maximise the screen
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/");
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		
		  // Handling drop down using Select class
	    //1. Find the drop down element
	   /* WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
	    
	    //2. Access the Select class
	    Select select1 = new Select(sourceDropdown);
	    
	    //3. Select the value from the drop down
	    select1.selectByIndex(1);
//	    select1.deselectByIndex(1);
	    
	    WebElement marketingCampaignDropdown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	    
	    Select select2 = new Select(marketingCampaignDropdown);
	    
//	    select2.selectByVisibleText("Car and Driver");
	    
	    select2.selectByValue("9000");
	    List<WebElement> options = select2.getOptions();
	    select2.selectByIndex(options.size()-1);
	    
	    for (WebElement eachOption : options) {
	        System.out.println(eachOption.getText());
	    }*/
	    
	    WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
	    Select selectIndustry = new Select(industryDD);
	    List<WebElement> optionsIndustry = selectIndustry.getOptions();
	    for (WebElement eachOption : optionsIndustry) {
	        System.out.println(eachOption.getText());
	    }
	    
	    WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	    Select selectownership = new Select(ownership);
	    List<WebElement> optionsOwnership = selectownership.getOptions();
	selectownership.selectByIndex(optionsOwnership.size()-1);
	   System.out.println(optionsOwnership.size()-1);
	    }
	}


