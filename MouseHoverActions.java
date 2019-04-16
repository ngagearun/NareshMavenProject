import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MouseHoverActions extends NavigationCommands{

	public static void main(String[] args) throws InterruptedException {
		
		String expectedtext="Mi Mobiles";
		launchbrowser();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.navigate().to("https://www.flipkart.com/");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/div[2]/div/div/button")))).click();
		//Thread.sleep(8000);
		WebElement electronics=	driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[1]/span"));
		Actions action=new Actions(driver);
		action.moveToElement(electronics).perform();
		//Thread.sleep(3000);
		driver.findElement(By.linkText("Mi")).click();
		//Thread.sleep(3000);
		String actualtext=driver.findElement(By.className("_2yAnYN12")).getText();
		if(actualtext.equalsIgnoreCase(expectedtext)){
			System.out.println("Title name is same");
		}
		
		//Thread.sleep(3000);
		WebElement dropdown=driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div/div[1]/div[1]/div/div[1]/div/section[2]/div[4]/div[1]/select"));
		Select price_dropdown=new Select(dropdown);
		price_dropdown.selectByIndex(1);
	//	Thread.sleep(3000);
		price_dropdown.selectByValue("13000");
		//Thread.sleep(3000);
		price_dropdown.selectByVisibleText("₹25000");
	//	Thread.sleep(3000);
		
		driver.close();

	}

}
