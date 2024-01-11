package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;


public class GoogleSearchPage {

	protected WebDriver driver;



	private By txt_Word = By.name("q");

	private By btn_Enter = By.name("q");
	
	


	
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver= driver;
	}


	public void enterText() {

		driver.findElement(txt_Word).sendKeys("Facebook");
		

	}


	public void clickEnter() {
		driver.findElement(btn_Enter).sendKeys(Keys.RETURN);
	}
	
	


	
	public void loginValidUser() {
		driver.findElement(txt_Word).sendKeys("facebook");
		driver.findElement(btn_Enter).click();
		
		
		
		
	}
	
}

