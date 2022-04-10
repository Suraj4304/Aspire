package testclass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import baseclasses.BaseClass;
import pomclasses.DoneandValidation;
import pomclasses.LoginAndInventory;
import pomclasses.NewManufacturingOrder;
import pomclasses.NewProducts;
import pomclasses.UpdateQuantity;

public class Aspire extends BaseClass{

	
	WebDriver driver;
	
	@BeforeClass
	
	public void launch() throws IOException{
		driver=initializeBrowser();	
	}
	
	@Test(priority=-5)
	public void Login() throws InterruptedException {
		
		LoginAndInventory log=new LoginAndInventory(driver);
		log.Email();
		log.Password();
		log.Login();
		log.ClickonInventory();
	}
	
	@Test(priority=-4)
	public void NewProduct() throws InterruptedException {
		
		NewProducts prdct=new NewProducts(driver);
		
		prdct.ClickonProduct();
		prdct.SelectNewProduct();
		prdct.CreateRecord();
		prdct.GiveProductName();
		prdct.ClickonUpdateQty();
		
	}
	
	@Test(priority=-3)
	public void UpdateQty() throws InterruptedException {
		
	UpdateQuantity UP= new UpdateQuantity(driver);
	
		UP.ClickonCreateqty();
		UP.SelectQty();
		UP.SaveUpdatedqty();
		UP.ClickonApplicationIcon();
			
	}
	
	@Test(priority=-2)
	public void ManufacturingOrder() throws InterruptedException {
		NewManufacturingOrder Mo= new NewManufacturingOrder(driver);
	
		Mo.ClickonManufacturingorder();
		Mo.CreateManufacturingorder();
		Mo.SelectProductName();
		Mo.SaveManufacturingOrder();
	}
	
	@Test(priority=-1)
	public void FinalDoneAndVAlidation() throws InterruptedException {
		DoneandValidation done= new DoneandValidation(driver);
		
		done.ConfirmOrder();
		done.DoneOrder();
		done.Validate();
		done.FinalValidation();
		
	}
	
	
	
	@AfterClass
	public void CloseBrowser() {
	//	driver.close();
	}
}
