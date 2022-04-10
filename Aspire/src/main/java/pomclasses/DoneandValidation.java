package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DoneandValidation {
	@FindBy(xpath="//button[@name='action_confirm'] ") private WebElement  ConfirmOrder;
	@FindBy(xpath=" (//button[@name='button_mark_done'])[4]") private WebElement  DoneOrder;
	@FindBy(xpath="(//button[@type='button\'])[47] ") private WebElement  Validate;
	@FindBy(xpath=" //button[@name='process'] ") private WebElement  FinalValidation ;

	

	public DoneandValidation(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void ConfirmOrder() throws InterruptedException {
		ConfirmOrder.click();
		Thread.sleep(2000);
	}
	public void DoneOrder() throws InterruptedException {
		DoneOrder.click();
		Thread.sleep(2000);
	}
	public void  Validate() throws InterruptedException {
		 Validate.click();
		 Thread.sleep(2000);
	
	}
	public void FinalValidation() throws InterruptedException {
		FinalValidation.click();
		Thread.sleep(2000);
	}
}
