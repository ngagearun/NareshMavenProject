import org.openqa.selenium.By;


public class AlertPopup extends NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		
		//adding comment s new line
		launchbrowser();
		driver.navigate().to("http://only-testing-blog.blogspot.com/");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='post-body-2641311481947341581']/div[1]/button[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();
		

	}

}
