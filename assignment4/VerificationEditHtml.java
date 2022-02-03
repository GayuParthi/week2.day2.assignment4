package week2.day2.assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerificationEditHtml {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/Edit.html");
	driver.manage().window().maximize();
	System.out.println("The title of the page is:  "+driver.getTitle());   
	System.out.println("The URL of the page is:  "+driver.getCurrentUrl()); 
	System.out.println(driver.getPageSource());
	String attribute = driver.findElement(By.name("username")).getAttribute("value");
	System.out.println("The Attribute value is  "+attribute);
	boolean enabled = driver.findElement(By.name("username")).isEnabled();
	System.out.println(enabled);
    boolean enabled2 = driver.findElement(By.id("email")).isEnabled();
    System.out.println(enabled2);
    boolean notEnabled = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input")).isEnabled();
    System.out.println(notEnabled);
   
    
}
}
