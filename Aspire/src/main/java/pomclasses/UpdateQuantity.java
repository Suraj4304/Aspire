package pomclasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateQuantity {
	@FindBy(xpath="(//button[@type='button'])[6]") private WebElement  Createqty;
	@FindBy(xpath="//input[@name='inventory_quantity']") private WebElement Addqty ;
	@FindBy(xpath="(//button[@type='button'])[3]") private WebElement Saveqty ;
	@FindBy(xpath=" //a[@href='#menu_id=108&action=232']") private WebElement ApplicationIcon ;

	

	public UpdateQuantity(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void ClickonCreateqty() throws InterruptedException {
		Createqty.click();
		Thread.sleep(2000);
	}
	public void SelectQty() throws InterruptedException {
		Addqty.click();
		Thread.sleep(2000);
		Addqty.sendKeys("43");
		Thread.sleep(2000);
	}
	public void SaveUpdatedqty() throws InterruptedException {
		Saveqty.click();
		Thread.sleep(2000);
	}
	public void ClickonApplicationIcon() throws InterruptedException {
		ApplicationIcon.click();
		Thread.sleep(2000);
	}
	
	

}
