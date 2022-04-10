package pomclasses;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewManufacturingOrder {
	@FindBy(xpath=" //button[@data-type='action']") private WebElement Manufacturingorder ;
	@FindBy(xpath=" //button[@data-original-title='Create record']") private WebElement Create ;
	@FindBy(xpath="(//input[@type='text'])[1] ") private WebElement  ProductName;
	@FindBy(xpath="//button[@title='Save record'] ") private WebElement SaveOrder  ;

	
	

	public NewManufacturingOrder(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickonManufacturingorder() throws InterruptedException {
		Manufacturingorder.click();
		Thread.sleep(2000);
	}
	public void CreateManufacturingorder() throws InterruptedException {
		Create.click();
		Thread.sleep(2000);
	}
	public void SelectProductName() throws InterruptedException {
		ProductName.click();
		Thread.sleep(3000);
		ProductName.sendKeys("Shrikhand");
		Thread.sleep(3000);
	}
	public void SaveManufacturingOrder() throws InterruptedException {
		SaveOrder.click();
		Thread.sleep(2000);
	}
	
	
}
