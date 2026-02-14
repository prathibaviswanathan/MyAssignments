package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/ "); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("(//input[@name='firstname'])[1]")).sendKeys("Prathiba");
		driver.findElement(By.xpath("(//input[@name='lastname'])[1]")).sendKeys("Viswanathan");
		driver.findElement(By.xpath("(//input[@name='reg_email__'])")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("(//input[@name='reg_passwd__'])")).sendKeys("Welcome@123$");
		//Date
		WebElement Day= driver.findElement(By.name("birthday_day"));
		Select selDay=new Select(Day);
		selDay.selectByValue("30");
		//Month
		WebElement Month = driver.findElement(By.name("birthday_month"));
		Select selMonth=new Select(Month);
		selMonth.selectByVisibleText("Apr");
		//year
		WebElement Year= driver.findElement(By.name("birthday_year"));
		Select selYear=new Select(Year);
		selYear.selectByValue("1984");
		//Gender
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();

	}

}
