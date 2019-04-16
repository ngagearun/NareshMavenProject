import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class DraggableDemo extends NavigationCommands{

	public static void main(String[] args) throws InterruptedException {
		
		launchbrowser();
		driver.navigate().to("http://jqueryui.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Draggable")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
	
		WebElement draggable_object=driver.findElement(By.id("draggable"));
		
		Actions action=new Actions(driver);
		
		action.dragAndDropBy(draggable_object,27, 281).perform();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();//to come out from frame
		driver.findElement(By.linkText("Droppable")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
