package CommonUtils;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtil {
	
	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void implicitwait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void handleDropDown(WebElement element, String targatedElement)
	{
		Select s=new Select(element);
		s.selectByVisibleText(targatedElement);
	}
	public void mouseHover(WebDriver driver,WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element);
		a.perform();
	}
	public void switchWindow(WebDriver driver,String expectedUrl)
	{
//		driver.findElement(By.xpath("(//img[@src='themes/softed/images/select.gif'])[1]")).click();
		Set<String> tabID=driver.getWindowHandles();
		
		for(String a: tabID)
		{
			String actualUrl=driver.switchTo().window(a).getCurrentUrl();
//			String childUrl="http://localhost:8888/index.php?module=Accounts&action=Popup&popuptype=specific_contact_account_address&form=TasksEditView&form_submit=false&fromlink=&recordid=";
			if(actualUrl.contains(expectedUrl))
			{
				break;
			}
		}
	}
}