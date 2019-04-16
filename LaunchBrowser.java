import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		//To launch the browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mortgagecalculator.org/");
		Thread.sleep(3000);
		driver.findElement(By.id("homeval")).sendKeys("30000");
		Thread.sleep(3000);
		driver.findElement(By.id("downpayment")).sendKeys("400");
		Thread.sleep(3000);
		driver.findElement(By.name("cal")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
