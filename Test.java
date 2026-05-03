package org.testleaf.week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {

    public static void main(String[] args) {
       //Launch the browser
        ChromeDriver driver=new ChromeDriver();
        
        //Load the url
        driver.get("https://leafground.com/frame.xhtml");

        //maximize the browser
        driver.manage().window().maximize();

        //add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

      //Switch inside the outer frame
      //driver.switchTo().frame(2);
      WebElement element = driver.findElement(By.xpath("//h5[text()=' Click Me (Inside Nested frame)']/following-sibling::iframe"));
      driver.switchTo().frame(element);

      //Switch inside the inner frame
      driver.switchTo().frame(0);

     //Click the button
      driver.findElement(By.id("Click")).click();

        //Switch to the main page
        driver.switchTo().defaultContent();

        //Switch back to the immediate parent frame
        driver.switchTo().parentFrame();
        
    }

}
