import java.security.SecureRandom;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.SoftAssert;

public class Parameters {

	
	WebDriver driver =new EdgeDriver();
	SoftAssert myAssert = new SoftAssert();
	String homeUrl = "https://magento.softwaretestingboard.com/";
	String signUpUrl = "https://magento.softwaretestingboard.com/customer/account/create/";
	String signOutUrl = "https://magento.softwaretestingboard.com/customer/account/logout/";
	String signIn = "https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/";
	
	String firstName = "farah";
	String lastName = "go";
	String email = "farahmango1@gmail.com";
	String pass = "farahmango.com123";
	Random myRandom = new Random();
	
	String street = "Riyadah";
	String building = "40";
	String door = "5";
	String city = "Amman";
	String zipCode = "12563";
	String phone = "0777856985";
//	
//	public class PasswordGenerator {
//	    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
//	    private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
//	    private static final String DIGIT = "0123456789";
//	    private static final String SPECIAL_CHAR = "!@#$%^&*()_-+=<>?/{}|~";
//
//	    private static final String PASSWORD_CHARS = CHAR_LOWER + CHAR_UPPER + DIGIT + SPECIAL_CHAR;
//	    private static final int PASSWORD_LENGTH = 12;
//	    int a = 10 ; 
//	    public static String generatePassword() {
//	        StringBuilder password = new StringBuilder(PASSWORD_LENGTH);
//	        SecureRandom random = new SecureRandom();
//
//	        for (int i = 0; i < PASSWORD_LENGTH; i++) {
//	            int randomCharIndex = random.nextInt(PASSWORD_CHARS.length());
//	            password.append(PASSWORD_CHARS.charAt(randomCharIndex));
//	        }
//
//	        return password.toString();
//	    }
//	}
}

