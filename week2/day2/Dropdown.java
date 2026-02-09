package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();	
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prathiba");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Viswanathan");
		//Locate the SourceDD
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//instantiate the select select class
		Select sel=new Select(sourceDD);
		sel.selectByIndex(5);
		//Select Marketing campaign
		WebElement mcDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sel1= new Select(mcDD);
		sel1.selectByVisibleText("Automobile");
		//Select Corporation in Ownership
		WebElement ownershipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sel2 = new  Select(ownershipDD);
		sel2.selectByValue("OWN_CCORP");
		//Create Lead 
		driver.findElement(By.name("submitButton")).click();
		String title=driver.getTitle();
		System.out.println(title);
		}

	}


