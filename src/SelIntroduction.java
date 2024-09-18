import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getCurrentUrl());
		driver.quit();
;
	}

}
