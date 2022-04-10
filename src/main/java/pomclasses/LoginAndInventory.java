package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;




public class LoginAndInventory {
	@FindBy(xpath="//input[@id='login']") private WebElement UID;
	@FindBy(xpath="//input[@id='password']") private WebElement PASS;
	@FindBy(xpath="//button[@type='submit']") private WebElement LOGIN;
	@FindBy(xpath="//a[@id='result_app_1']") private WebElement Inventory;

	 public LoginAndInventory(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	public void Email() throws InterruptedException {
		UID.sendKeys("user@aspireapp.com");
		Thread.sleep(1000);
	}
	public void Password() throws InterruptedException {
		PASS.sendKeys("@sp1r3app");
		
		Thread.sleep(1000);
	}
	public void Login() throws InterruptedException {
		LOGIN.click();
		Thread.sleep(1000);
	}
	public void ClickonInventory() throws InterruptedException {
		Inventory.click();
		Thread.sleep(2000);
	}
	
}
