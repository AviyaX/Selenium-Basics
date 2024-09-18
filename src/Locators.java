import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver ();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getCurrentUrl());
		
		//ID - Locator 
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		//name Locator 
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		//ClassName Locator
		//driver.findElement(By.className("signInBtn")).click();
		/* 
		 * CSS Selectors 
		 * 		CalssName --> tagName.classname
		 * 			driver.findElement(By.className("signInBtn")).click();
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		driver.findElement(By.cssSelector("Button.signInBtn")).click();

	}

}
