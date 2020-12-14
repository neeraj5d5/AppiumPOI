package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Login {
	public Login(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(xpath="//android.widget.EditText[@index='0']")
	private WebElement SigninEmail;
	@AndroidFindBy(xpath="//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.EditText[@index='0']")
	private WebElement SigninPassword;
	@AndroidFindBy(xpath="//android.view.View[@index='1']/android.view.View[@index='3']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='2']")
	private WebElement SigninButton;
	
	public WebElement SigninEmail() {
		return SigninEmail;
	}
	public WebElement SigninPassword() {
		return SigninPassword;
	}
	public WebElement SigninButton() {
		return SigninButton;
	}

}
