package objectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="userName")
	private WebElement userNameTxt;
	
	@FindBy(id="password")
	private WebElement passwordTxt;
	
	@FindBy(id="login")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * @return the userNameTxt
	 */
	public WebElement getUserNameTxt() {
		return userNameTxt;
	}

	/**
	 * @return the passwordTxt
	 */
	public WebElement getPasswordTxt() {
		return passwordTxt;
	}

	/**
	 * @return the loginButton
	 */
	public WebElement getLoginButton() {
		return loginButton;
	}

	
	public void loginToPage() {
		
	}
	
	

}
