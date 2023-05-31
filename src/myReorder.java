import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myReorder extends Parameters{

	@BeforeTest
	public void beforeTest() {
		driver.manage().window().maximize();
		driver.get(signIn);
		
		WebElement email =driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password =driver.findElement(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[3]/div[1]/input[1]"));
		WebElement clickButton = driver.findElement(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[4]/div[1]/button[1]"));

		email.sendKeys(this.email);
		password.sendKeys(this.pass);
		clickButton.click();
		
		
	}
	
	@Test()
	public void reorder() throws Exception {
	
		Thread.sleep(3000);

		WebElement orderButton = driver.findElement(By.xpath("//a[contains(text(),'My Orders')]"));
		orderButton.click();
		Thread.sleep(3000);
			for(int i =0 ;i < 5 ; i++) {
				Thread.sleep(3000);
		WebElement reOrderButton  = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[6]/a[2]"));
		reOrderButton.click();
		Thread.sleep(3000);
		WebElement proceedCheck = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]"));
		proceedCheck.click();
		Thread.sleep(5000);
		WebElement nextButton = driver.findElement(By.cssSelector("body.checkout-index-index.page-layout-checkout:nth-child(2) div.page-wrapper:nth-child(4) main.page-main div.columns:nth-child(3) div.column.main div.checkout-container:nth-child(3) div.opc-wrapper:nth-child(5) ol.opc li.checkout-shipping-method div.checkout-shipping-method div.step-content form.form.methods-shipping div.actions-toolbar:nth-child(3) div.primary > button.button.action.continue.primary"));
		nextButton.click();
		Thread.sleep(3000);
		
//		WebElement placeOrder = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[4]/div/button"));
		WebElement placeOrder = driver.findElement(By.cssSelector("body.checkout-index-index.page-layout-checkout:nth-child(2) div.page-wrapper:nth-child(5) main.page-main div.columns:nth-child(3) div.column.main div.checkout-container:nth-child(3) div.opc-wrapper:nth-child(5) ol.opc li.checkout-payment-method div.step-content form.form.payments fieldset.fieldset:nth-child(2) div.opc-payment:nth-child(5) div.items.payment-methods div.payment-group div.payment-method._active div.payment-method-content div.actions-toolbar div.primary > button.action.primary.checkout"));

		placeOrder.click();
		Thread.sleep(3000);

		driver.navigate().to("https://magento.softwaretestingboard.com/customer/account/");
		Thread.sleep(3000);

		WebElement myorderButton = driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[2]/div/div[2]/ul/li[2]/a"));
		myorderButton.click();
		
			}
			List <WebElement> price = driver.findElements(By.className("price"));
			for (int i =1 ; i< price.size(); i++) {
				
				String expectedPrice = price.get(i).getText();
					
					WebElement  actualPrice = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[4]/span[1]"));
					
					String actualPriceText = actualPrice.getText();

					
					System.out.println(actualPriceText);
					System.out.println(expectedPrice);
					if(expectedPrice.equals(actualPriceText)) {
			
						myAssert.assertEquals(expectedPrice, actualPriceText);
						myAssert.assertAll();
						Thread.sleep(3000);		
					 
						
					}else {
						throw new Exception();
					}
		 				 
			}
		
	}
	
	@AfterTest
	public void afterTest() {
//		driver.quit();
			
		
	}
	
}
