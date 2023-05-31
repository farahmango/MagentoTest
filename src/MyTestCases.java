import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases extends Parameters{
//	PasswordGenerator myObj = new PasswordGenerator();
//	String password2 = Parameters.PasswordGenerator.generatePassword();
	
	
	
	String[] URLS = { "https://magento.softwaretestingboard.com/radiant-tee.html",
			"https://magento.softwaretestingboard.com/breathe-easy-tank.html",
			"https://magento.softwaretestingboard.com/argus-all-weather-tank.html",
			"https://magento.softwaretestingboard.com/hero-hoodie.html",
			"https://magento.softwaretestingboard.com/push-it-messenger-bag.html" };
	
	@BeforeTest
	public void beforeTest() {
		driver.get(homeUrl);
		driver.manage().window().maximize();

	}
//	
	@Test(priority =1)
	public void signUp() {
		driver.get(signUpUrl);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstname']"));
		WebElement lastName =driver.findElement(By.xpath("//input[@id='lastname']"));
		WebElement email =driver.findElement(By.xpath("//input[@id='email_address']"));
		WebElement password =driver.findElement(By.xpath("//input[@id='password']"));
		WebElement confirmPassword =driver.findElement(By.xpath("//input[@id='password-confirmation']"));
		WebElement clickButton = driver.findElement(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]"));

		System.out.println(pass + " signUp");
		
		firstName.sendKeys(this.firstName);
		lastName.sendKeys(this.lastName);
		email.sendKeys(this.email);
		password.sendKeys(pass);
		confirmPassword.sendKeys(pass);
		clickButton.click();
		
	}
//	
	@Test(priority = 2)
	public void signIn() throws InterruptedException {
		driver.get(signOutUrl);
		driver.get(signIn);
		Thread.sleep(2000);
		WebElement email =driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password =driver.findElement(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[3]/div[1]/input[1]"));
		WebElement clickButton = driver.findElement(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[4]/div[1]/button[1]"));

		email.sendKeys(this.email);
		password.sendKeys(this.pass);

		clickButton.click();

		
	}
	
	@Test(priority = 3)
	public void addItems() throws InterruptedException {

	
		for (int i = 0; i < URLS.length; i++) {
			driver.get(URLS[i]);

			if (driver.getCurrentUrl().contains("tee")) {
				Thread.sleep(3000);

				WebElement divItemSize = driver.findElement(By.xpath("//body/div[1]/main[1]/div[2]/div[1]/div[1]/div[4]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
				List<WebElement> size =  divItemSize.findElements(By.className("text"));
				System.out.println(size.size());
				
				WebElement divItemColor = driver.findElement(By.xpath("//body/div[1]/main[1]/div[2]/div[1]/div[1]/div[4]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]"));
				List<WebElement> color =  divItemColor.findElements(By.className("color"));
				System.out.println(color.size());

				int randSize = myRandom.nextInt(size.size());
				int randColor = myRandom.nextInt(color.size());
				
				size.get(randSize).click();
				color.get(randColor).click();

				WebElement Quintyt = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quintyt.clear();
				Quintyt.sendKeys("3");
				
				WebElement addCart = driver.findElement(By.xpath("//button[@id='product-addtocart-button']"));
				addCart.click();

				
			} else if (driver.getCurrentUrl().contains("easy")) {
				Thread.sleep(3000);
				
				WebElement divItemSize = driver.findElement(By.xpath("//body/div[1]/main[1]/div[2]/div[1]/div[1]/div[4]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
				List<WebElement> size =  divItemSize.findElements(By.className("text"));
				System.out.println(size.size());
				Thread.sleep(3000);
				
				WebElement divItemColor = driver.findElement(By.xpath("//body/div[1]/main[1]/div[2]/div[1]/div[1]/div[4]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]"));
				List<WebElement> color =  divItemColor.findElements(By.className("color"));
				System.out.println(color.size());
				
				int randSize = myRandom.nextInt(size.size());
				int randColor = myRandom.nextInt(color.size());
				
				size.get(randSize).click();
				color.get(randColor).click();

				WebElement Quintyt = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quintyt.clear();
				Quintyt.sendKeys("2");
				
				WebElement addCart = driver.findElement(By.xpath("//button[@id='product-addtocart-button']"));
				addCart.click();

				
			} else if (driver.getCurrentUrl().contains("weather")) {
				
				Thread.sleep(3000);
				WebElement divItemSize = driver.findElement(By.xpath("//body/div[1]/main[1]/div[2]/div[1]/div[1]/div[4]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
				List<WebElement> size =  divItemSize.findElements(By.className("text"));
				System.out.println(size.size());
				Thread.sleep(3000);
				
				WebElement divItemColor = driver.findElement(By.xpath("//body/div[1]/main[1]/div[2]/div[1]/div[1]/div[4]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]"));
				List<WebElement> color =  divItemColor.findElements(By.className("color"));
				System.out.println(color.size());
				
				int randSize = myRandom.nextInt(size.size());
				int randColor = myRandom.nextInt(color.size());
				
				size.get(randSize).click();
				color.get(randColor).click();

				WebElement Quintyt = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quintyt.clear();
				Quintyt.sendKeys("4");
				
				WebElement addCart = driver.findElement(By.xpath("//button[@id='product-addtocart-button']"));
				addCart.click();

			} 
			else if (driver.getCurrentUrl().contains("hero")) {
			
				Thread.sleep(3000);
				WebElement divItemSize = driver.findElement(By.xpath("//body/div[1]/main[1]/div[2]/div[1]/div[1]/div[4]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
				List<WebElement> size =  divItemSize.findElements(By.className("text"));
				System.out.println(size.size());
				Thread.sleep(3000);
				
				WebElement divItemColor = driver.findElement(By.xpath("//body/div[1]/main[1]/div[2]/div[1]/div[1]/div[4]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]"));
				List<WebElement> color =  divItemColor.findElements(By.className("color"));
				System.out.println(color.size());
				
				int randSize = myRandom.nextInt(size.size());
				int randColor = myRandom.nextInt(color.size());
				
				size.get(randSize).click();
				color.get(randColor).click();

				WebElement Quintyt = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quintyt.clear();
				Quintyt.sendKeys("1");
				
				WebElement addCart = driver.findElement(By.xpath("//button[@id='product-addtocart-button']"));
				addCart.click();

			} else if (driver.getCurrentUrl().contains("messenger")) {
					
				WebElement Quintyt = driver.findElement(By.xpath("//input[@id='qty']"));
				Quintyt.clear();
				Quintyt.sendKeys("5");
				
				WebElement addCart = driver.findElement(By.xpath("//button[@id='product-addtocart-button']"));
				addCart.click();

			}
		}
		Thread.sleep(5000);

		WebElement basketContent = driver.findElement(By.className("counter-number"));
		Thread.sleep(2000);
		String basket = basketContent.getText();
		System.out.println(basket);
		
		String expectedBasket="15";
		Thread.sleep(3000);
		myAssert.assertEquals(basket, expectedBasket);
		myAssert.assertAll();
//		
	}
	
	@Test(priority = 4)
	public void checkOut() throws InterruptedException {
		
		
		driver.navigate().to("https://magento.softwaretestingboard.com/checkout/#shipping");
		Thread.sleep(5000);
		
		WebElement street = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/input[1]"));
		street.sendKeys(this.street);
		Thread.sleep(3000);

		WebElement building =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[1]/div[1]/fieldset[1]/div[1]/div[2]/div[1]/input[1]"));
		building.sendKeys(this.building);
		Thread.sleep(3000);

		WebElement door =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[1]/div[1]/fieldset[1]/div[1]/div[3]/div[1]/input[1]"));
		door.sendKeys(this.door);
		Thread.sleep(3000);

		WebElement city =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[1]/div[1]/div[4]/div[1]/input[1]"));
		city.sendKeys(this.city);
		Thread.sleep(3000);

		WebElement zipCode =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[1]/div[1]/div[7]/div[1]/input[1]"));
		zipCode.sendKeys(this.zipCode);
		Thread.sleep(3000);

		Select dropDownCountry = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[1]/div[1]/div[8]/div[1]/select[1]")));
		dropDownCountry.selectByValue("JO");
		Thread.sleep(3000);

		WebElement phone =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[1]/div[1]/div[9]/div[1]/input[1]"));
		phone.sendKeys(this.phone);
		Thread.sleep(3000);

		WebElement nextButton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[2]/div[1]/div[3]/form[1]/div[3]/div[1]/button[1]"));
		nextButton.click();

		Thread.sleep(10000);
		
	}
	@Test(priority = 5)
	public void checkThePrice() throws InterruptedException {
		Thread.sleep(5000);

		WebElement placeHolderButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[3]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/button[1]"));
		placeHolderButton.click();
		Thread.sleep(20000);

		WebElement receiptNumber = driver.findElement(By.cssSelector("body.checkout-onepage-success.page-layout-1column:nth-child(2) div.page-wrapper:nth-child(4) main.page-main div.columns:nth-child(4) div.column.main div.checkout-success:nth-child(5) p:nth-child(1) a.order-number > strong:nth-child(1)"));
		Thread.sleep(3000);
		receiptNumber.click();

		Thread.sleep(3000);

		List<WebElement> price = driver.findElements(By.cssSelector("body.account.sales-order-view.page-layout-2columns-left:nth-child(2) div.page-wrapper:nth-child(4) main.page-main div.columns:nth-child(3) div.column.main:nth-child(1) div.order-details-items.ordered:nth-child(3) div.table-wrapper.order-items table.data.table.table-order-items tr:nth-child(1) td.col.subtotal:nth-child(5) span.price-excluding-tax span.cart-price > span.price"));

		double sum = 0;
		for (int i = 0; i < price.size(); i++) {
			String ItemPrice = price.get(i).getText();
			String subPrice = ItemPrice.substring(1, ItemPrice.length());
			double convertPrice = Double.parseDouble(subPrice);
			sum = sum + convertPrice;
		}
		System.out.println(sum);

		double expectedTotalPrice = sum;
		Thread.sleep(3000);

		WebElement actualPrice = driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[1]/div[2]/div[2]/table/tfoot/tr[1]/td/span"));
		String actualPriceValue = actualPrice.getText();

		String convertPrice = actualPriceValue.substring(1, actualPriceValue.length());
		double actualTotalPrice = Double.parseDouble(convertPrice);
		System.out.println(actualTotalPrice);

		myAssert.assertEquals(actualTotalPrice, expectedTotalPrice);
		myAssert.assertAll();

	}

		
	
	
	
	@AfterTest()
	public void afterTest() {
//		driver.quit();
		
	}
	
}
