package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginPage {
    WebDriver driver;

    public OrangeHRMLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "username")
    WebElement txtUsername;
    @FindBy(name = "password")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;
    @FindBy(className="oxd-alert-content-text" )
    WebElement errorMessage;

    public void typeUsername(String text){
        txtUsername.sendKeys(text);
    }

    public void typePassword(String text){
        password.sendKeys(text);
    }

    public void clickLogin(){
        btnLogin.click();
    }

    public void loginAsAdmin(){
        typeUsername("Admin");
        typePassword("admin123");
        clickLogin();
    }

    public void verifyErrorMessageContains(String message){
        Assert.assertTrue(errorMessage.getText().contains(message));
    }


}
