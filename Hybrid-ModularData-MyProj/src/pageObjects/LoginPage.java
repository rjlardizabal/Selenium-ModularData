package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver= null;
	
	public LoginPage(WebDriver driverParam){
		this.driver=driverParam;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	
	@CacheLookup
	
	public WebElement txtbox_Email; 
	
	@FindBy(id="pass")
	
	@CacheLookup
	
	public WebElement txtbox_Pass;
	
	@FindBy(id="send2")
	
	@CacheLookup
	
	public WebElement btn_Login;
	
	public void Login(String email, String Pass){
		txtbox_Email.sendKeys(email);
		txtbox_Pass.sendKeys(Pass);
		btn_Login.click();
		
	}

}
