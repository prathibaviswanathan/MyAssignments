package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/main"); 
	    driver.manage().window().maximize();
	    System.out.println(driver.getTitle());
		
		//System.setProperty("Webdriver.edhe.driver", "C:\\Users\\Viswa\\Desktop\\Prathiba\\Test Leaf Software\\Edgedriver");
		//EdgeDriver driver1=new EdgeDriver();
		
		}

}
