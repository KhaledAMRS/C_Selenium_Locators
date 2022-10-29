package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Syntax_Xpath {


    public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://the-internet.herokuapp.com/login");
driver.manage().window().maximize();

/*
Remember
The general syntax of CssSelector is
TagName[attribute="value"]

The general syntax of Xpath is
//TagName[@attribute="value"]           Note: @attribute in xpath but in cssSelector it's attribute without @

 */

driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("tomsmith");
driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("SuperSecretPassword!");
/* Note if you define classname using Xpath so you will type the whole text
"fa fa-2x fa-sign-in"
not part of class name unlike the special case mentioned before
*/

driver.findElement(By.xpath("//i[@class=\"fa fa-2x fa-sign-in\"]")).click();

Thread.sleep(2000);

 driver.quit();


    }
}
