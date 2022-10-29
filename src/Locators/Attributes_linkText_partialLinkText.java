package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Attributes_linkText_partialLinkText {


    public static void main(String[] args) throws InterruptedException {
// 0- you should download relative geckodriver first and define its path on your PC


// 1- Define the bridge between the browser and the code
// Note: there is another better way to define the executable path, which will be discussed after Maven
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");

// 2- Create New Object of WebDriver to open Chrome
        WebDriver driver = new ChromeDriver();


// 3- Configure your driver
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.manage().window().maximize();

// 4- Navigate to the website
        driver.navigate().to("http://the-internet.herokuapp.com/login");

   driver.findElement(By.linkText("Elemental Selenium")).click();
//or
// driver.findElement(By.partialLinkText("Elemental Selen")).click();
Thread.sleep(2000);

 driver.quit();


    }
}
