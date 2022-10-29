package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Syntax_CssSelector {


    public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.navigate().to("http://the-internet.herokuapp.com/login");


// Note: cssSelector & Xpath are syntax not attributes unlike id, name, classname, linktext, partiallinktext
/*
The general syntax of CssSelector is
TagName[attribute="value"]

The general syntax of Xpath is
//TagName[@attribute="value"]           Note: @attribute in xpath but in cssSelector it's attribute without @

 */

driver.findElement(By.cssSelector("input[id=\"username\"]")).sendKeys("tomsmith");
driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("SuperSecretPassword!");
/* Note if you define classname using cssSelector so you will type the whole text
"fa fa-2x fa-sign-in"
not part of class name unlike the special case mentioned before
*/

driver.findElement(By.cssSelector("i[class=\"fa fa-2x fa-sign-in\"]")).click();

Thread.sleep(2000);

 driver.quit();


    }
}
