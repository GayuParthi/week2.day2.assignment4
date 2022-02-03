package week2.day2.assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerificationAssignment3 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		System.out.println("The title of the page is:  "+driver.getTitle());   
		System.out.println("The URL of the page is:  "+driver.getCurrentUrl()); 
		System.out.println(driver.getPageSource());
		boolean selected = driver.findElement(By.id("dropdown1")).isSelected();
		System.out.println(selected);
		String tagName = driver.findElement(By.id("dropdown1")).getTagName();
		System.out.println(tagName);
		Dimension size = driver.findElement(By.id("dropdown1")).getSize();	
		System.out.println(size);
		Point location = driver.findElement(By.className("dropdown")).getLocation();
		System.out.println(location);
	}

}
