package msciq;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class forecast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		String email = "rajamegam.govindaraj@ideas2it.com";
		String password = "123456";
		driver.get("http://qa.msciq.io/login");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[@type='button']/child::h6[text()='Planning & Forecasting']")).click();
		driver.findElement(By.xpath("//button[@type='button']/child::h6[text()='Forecast']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	}

}
