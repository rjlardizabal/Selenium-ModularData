package automationFramework;

import org.testng.annotations.Test;

import pageObjects.LoginPage;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Framework_001 {
	private WebDriver driver=new FirefoxDriver();
	LoginPage loginpageobj = new LoginPage(driver);
  @Test
  public void f() {
	  loginpageobj.txtbox_Email.sendKeys("rj.lardizabal22@gmail.com");
	  loginpageobj.txtbox_Pass.sendKeys("kobeneal");
	  loginpageobj.btn_Login.click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.get("http://live.guru99.com/index.php/customer/account/login/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
