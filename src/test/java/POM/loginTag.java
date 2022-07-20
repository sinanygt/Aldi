package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.asserts.Assertion;
import utulities.Driver;

public class loginTag extends AbstractClass {

    public loginTag(){

    PageFactory.initElements(Driver.get(),this);
}

 @FindBy(xpath = "/html/body/div[3]/div/div/form/div[3]/div/div[2]/button")
    public WebElement Cookies;

@FindBy(xpath = "//*[@id=\"left_top_menu\"]/ul[2]/li[2]/a")
    public WebElement login;
@FindBy(xpath = "//*[@id=\"member_login_email\"]")
    public WebElement email;

@FindBy(xpath = "//*[@id=\"member_login_password\"]")
public WebElement password;

@FindBy(css = "#login_submit")
    public WebElement submit;

@FindBy(xpath = "/html/body/main/div[1]/div[3]/section[1]/div/div[1]/div[1]")

    public WebElement succesMessage;
 
public void assertMyMessage(){
    Assertion(succesMessage,("E-Mail-Adresse und Passwort stimmen nicht überein. Bitte überprüfe deine Eingabe."));


 }

    private void Assertion(WebElement succesMessage, String s) {
    }

}




