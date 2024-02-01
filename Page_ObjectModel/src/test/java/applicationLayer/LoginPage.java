package applicationLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	//define Repository
	@FindBy(name = "username")
	WebElement ObjUser;
	@FindBy(name = "password")
	 WebElement ObjPass;
	@FindBy(name = "btnsubmit")
	WebElement ObjLoginbtn;
	@FindBy(name = "btnreset")
	WebElement ObjResetbtn;
	//write method for login
	public void adminLogin(String username,String password)
	{
		ObjResetbtn.click();
		ObjUser.sendKeys(username);
		ObjPass.sendKeys(password);
		ObjLoginbtn.click();
		
	}
	

}
