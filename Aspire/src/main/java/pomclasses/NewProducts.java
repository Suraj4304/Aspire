package pomclasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewProducts {
	@FindBy(xpath="//button[@title='Products']") private WebElement Product;
	@FindBy(xpath="//a[@href='#menu_id=124&action=215']") private WebElement NewProduct ;
	@FindBy(xpath="//button[@title='Create record']") private WebElement Create ;
	@FindBy(xpath="//input[@type='text']") private WebElement ProductName ;
	@FindBy(xpath="(//button[@type='button'])[8]") private WebElement UpdateQty ;
	

	public NewProducts(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickonProduct() throws InterruptedException {
		Product.click();
		Thread.sleep(2000);
		
	}
	public void SelectNewProduct() throws InterruptedException {
		NewProduct.click();
		Thread.sleep(2000);
	}
	public void CreateRecord() throws InterruptedException {
		Thread.sleep(2000);
		Create.click();
		Thread.sleep(2000);
	}
	public void GiveProductName() throws InterruptedException {
		ProductName.click();
		Thread.sleep(2000);
		ProductName.sendKeys("Shrikhand");
		Thread.sleep(2000);
		
	}
	public void ClickonUpdateQty() throws InterruptedException {
		UpdateQty.click();
		Thread.sleep(2000);
		
	}
	

}
