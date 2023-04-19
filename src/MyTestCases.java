import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
		

	}
//	
//	@Test(priority =1)
//	public void signUp() {
//		driver.get(signUpUrl);
//		
//		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstname']"));
//		WebElement lastName =driver.findElement(By.xpath("//input[@id='lastname']"));
//		WebElement email =driver.findElement(By.xpath("//input[@id='email_address']"));
//		WebElement password =driver.findElement(By.xpath("//input[@id='password']"));
//		WebElement confirmPassword =driver.findElement(By.xpath("//input[@id='password-confirmation']"));
//		WebElement clickButton = driver.findElement(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]"));
//
//		System.out.println(pass + " signUp");
//		
//		firstName.sendKeys(this.firstName);
//		lastName.sendKeys(this.lastName);
//		email.sendKeys(this.email);
//		password.sendKeys(pass);
//		confirmPassword.sendKeys(pass);
//		clickButton.click();
//		
//	}
//	
	@Test(priority = 2)
	public void signIn() {
		driver.get(signOutUrl);
		driver.get(signIn);
		
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
			else if (driver.getCurrentUrl().contains("hoodie")) {
			
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
		String basket = basketContent.getText();
		System.out.println(basket);
		
		String expectedBasket="15";
		Thread.sleep(3000);
		myAssert.assertEquals(basket, expectedBasket);
		myAssert.assertAll();
		
	}
	
	
	
	
	@AfterTest()
	public void afterTest() {
//		driver.quit();
		
	}
	
}
