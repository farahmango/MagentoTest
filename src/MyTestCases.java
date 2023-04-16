import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases extends Parameters{
//	PasswordGenerator myObj = new PasswordGenerator();
	String password2 = Parameters.PasswordGenerator.generatePassword();
	
	@BeforeTest
	public void beforeTest() {
		driver.get(homeUrl);
		
		System.out.println(password2 + " before");

	}
	
	@Test(priority =1)
	public void signUp() {
		driver.get(signUpUrl);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstname']"));
		WebElement lastName =driver.findElement(By.xpath("//input[@id='lastname']"));
		WebElement email =driver.findElement(By.xpath("//input[@id='email_address']"));
		WebElement password =driver.findElement(By.xpath("//input[@id='password']"));
		WebElement confirmPassword =driver.findElement(By.xpath("//input[@id='password-confirmation']"));
		WebElement clickButton = driver.findElement(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]"));

		System.out.println(password2 + " signUp");
		
		firstName.sendKeys(this.firstName);
		lastName.sendKeys(this.lastName);
		email.sendKeys(this.email);
		password.sendKeys(password2);
		confirmPassword.sendKeys(password2);
		clickButton.click();
		
	}
	
	@Test(priority = 2)
	public void signIn() {
		driver.get(signOutUrl);
		driver.get(signIn);
		
		WebElement email =driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password =driver.findElement(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[3]/div[1]/input[1]"));
		WebElement clickButton = driver.findElement(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[4]/div[1]/button[1]"));
		System.out.println(password2 + " signIn");

		email.sendKeys(this.email);
		password.sendKeys(password2);
		clickButton.click();

		
	}
	
	@AfterTest()
	public void afterTest() {
		System.out.println(password2 + " after");
		driver.quit();
		
	}
	
}
