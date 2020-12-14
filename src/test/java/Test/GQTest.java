package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Base.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.Login;


public class GQTest extends Base {
	
	@Test
	public static void test() throws IOException, InterruptedException{
		
		service=startServer();
		AndroidDriver<AndroidElement> driver=capabilities("apiDemo");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	 	Login login=new Login(driver);
	 	login.SigninEmail().sendKeys("neeraj505@gmail.com");
	 	login.SigninPassword().sendKeys("Asdf@1234");
		Thread.sleep(2);
		login.SigninButton().click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		service.stop();
	}
}