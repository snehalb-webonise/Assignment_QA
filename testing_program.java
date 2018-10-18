import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.UUID;

public class testing_program {
	
	public static void main(String args[]) throws InterruptedException {
		
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","/home/webonise/eclipse-workspace/Testing/Resource/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://web-stg.gofaceoff.com/");
	

		WebElement signin = driver.findElement(By.xpath("//a[@href = '/signup']"));
		signin.click();
		System.out.println("sing-up button click");
		
		final String randomEmail = randomEmail();
		WebElement email = driver.findElement(By.xpath("//*[@name ='email']"));
		email.clear();
		email.sendKeys("snehal40@gmail.com");
		//email.sendKeys(randomEmail);
		
		WebElement user_name = driver.findElement(By.xpath("//*[@name ='username']"));
		user_name.clear();
		user_name.sendKeys("snehal112");
	
		WebElement password = driver.findElement(By.xpath("//*[@name ='password']"));
		password.clear();
		password.sendKeys("snehal12423#");
		
		WebElement first_name = driver.findElement(By.xpath("//*[@name ='first_name']"));
		first_name.clear();
		first_name.sendKeys("snehalasB");
		
		WebElement last_name = driver.findElement(By.xpath("//*[@name ='last_name']"));
		last_name.clear();
		last_name.sendKeys("Babar");
		
		WebElement dob = driver.findElement(By.xpath("//*[@name ='dateOfBirth']"));
		dob.clear();
		dob.sendKeys("05/22/1997");
		
		WebElement state = driver.findElement(By.xpath("//*[ @name = 'state']"));
		Select selectcountry = new Select(state);
		selectcountry.selectByVisibleText("LA");
		
		WebElement promo_code = driver.findElement(By.xpath("//*[@name ='referralCode']"));
		promo_code.clear();
		promo_code.sendKeys("iam");
		
		WebElement signup_forfree = driver.findElement(By.xpath("//*[ text()='Sign Up For Free']"));
		signup_forfree.click();
		
		Thread.sleep(10000);
		WebElement skip = driver.findElement(By.xpath("//a[ text()='Skip']"));
		skip.click();
		
		WebElement log_pref = driver.findElement(By.xpath("//span[@class = 'dropDownIcon']"));
		log_pref.click();
		
		
		WebElement logout = driver.findElement(By.xpath("//a[ text()='Log Out']"));
		logout.click();
		
		
		
		//driver.close();
		
	}
	 private static String randomEmail() {
	        return "random-" + UUID.randomUUID().toString() + "@example.com";
	    }

}
