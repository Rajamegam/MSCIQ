package msciq;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

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
		driver.findElement(By.xpath("//div[@class='sc-bcXHqe hvTKYE']/div[4]/div/div/div[6]/div/button")).click();
		driver.findElement(By.xpath("//div[@class='sc-bcXHqe hvTKYE']/div[4]/div/div[2]/div/div/div[2]/div/button"))
				.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement department = wait.until(
				ExpectedConditions.elementToBeClickable(By.cssSelector("tbody tr:nth-child(2) td:nth-child(2)")));
		a.doubleClick(department).perform();
		driver.findElement(By.xpath("//div[@id='3']")).click();
		WebElement businessunit = wait.until(
				ExpectedConditions.elementToBeClickable(By.cssSelector("tbody tr:nth-child(2) td:nth-child(3)")));
		a.doubleClick(businessunit).perform();
		driver.findElement(By.xpath("//div[@id='2']")).click();
		WebElement Location = wait.until(
				ExpectedConditions.elementToBeClickable(By.cssSelector("tbody tr:nth-child(2) td:nth-child(5)")));
		a.doubleClick(Location).perform();
		driver.findElement(By.xpath("//div[@id='2']")).click();
		WebElement GLaccounts = wait.until(
				ExpectedConditions.elementToBeClickable(By.cssSelector("tbody tr:nth-child(2) td:nth-child(6)")));
		a.doubleClick(GLaccounts).perform();
		driver.findElement(By.xpath("//div[@id='2']")).click();
		WebElement Vendor = wait.until(
				ExpectedConditions.elementToBeClickable(By.cssSelector("tbody tr:nth-child(2) td:nth-child(7)")));
		a.doubleClick(Vendor).sendKeys("amazon").perform();
		WebElement ItemDescription = wait.until(
				ExpectedConditions.elementToBeClickable(By.cssSelector("tbody tr:nth-child(2) td:nth-child(8)")));
		a.doubleClick(ItemDescription).sendKeys("Pen").perform();
		WebElement Business_Justification = wait.until(
				ExpectedConditions.elementToBeClickable(By.cssSelector("tbody tr:nth-child(2) td:nth-child(9)")));
		a.doubleClick(Business_Justification).sendKeys("Projectneed").perform();
		WebElement Project_name = wait.until(
				ExpectedConditions.elementToBeClickable(By.cssSelector("tbody tr:nth-child(2) td:nth-child(10)")));
		a.doubleClick(Project_name).sendKeys("MSCIQ").perform();
		WebElement Amount = wait.until(
				ExpectedConditions.elementToBeClickable(By.cssSelector("tbody tr:nth-child(2) td:nth-child(11)")));
		a.doubleClick(Amount).sendKeys("5000").perform();
		WebElement Month = wait.until(
				ExpectedConditions.elementToBeClickable(By.cssSelector("tbody tr:nth-child(2) td:nth-child(12)")));
		a.doubleClick(Month).perform();
		driver.findElement(By.id("APR")).click();
		WebElement Year = wait.until(
				ExpectedConditions.elementToBeClickable(By.cssSelector("tbody tr:nth-child(2) td:nth-child(13)")));
		a.doubleClick(Year).perform();
		driver.findElement(By.id("2023")).click();
		driver.findElement(By.xpath("//div[@class='MuiBox-root css-k008qs']/button[2]")).click();
		Boolean Success_status = wait.until(
				ExpectedConditions.textToBePresentInElementValue(By.xpath("//div[@role='status']"), "Forecast saved successfully."));
				//elementToBeClickable(By.cssSelector("tbody tr:nth-child(2) td:nth-child(13)")));
		System.out.println(Success_status);
//		String status = driver.findElement(By.xpath("//div[@role='status']")).getText();
//		System.out.println(status);

	}
}
