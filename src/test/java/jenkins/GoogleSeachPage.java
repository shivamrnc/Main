package jenkins;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.GoogleSearchPage;

public class GoogleSeachPage {
	
	
	
	WebDriver driver = null;
	static GoogleSearchPage Google;
	
	@BeforeTest
	public void test() {
	
	//public static void main(String[] args) {
	
		
		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path is : "+projectPath);
		
		System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver.exe");
	}
		
@Test
	public void GoogleTest() {	
		WebDriver driver = new FirefoxDriver();
		
		Google = new GoogleSearchPage(driver);
		driver.navigate().to("https://google.com");
		
		Google.enterText();
		Google.clickEnter();
//		driver.findElement(By.name("q")).sendKeys("Facebook");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	}
@AfterTest
	
	public void teardown() {
		//System.out.println("Inside Login - browser is close");

	
		//driver.close();
		

}}
