package POM;

import javafx.scene.input.InputMethodTextRun;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.Assert;
import utulities.Driver;

import java.time.Instant;

public abstract class AbstractClass {

    private InputMethodTextRun actual;
    private String expected;

    public AbstractClass(){
 PageFactory.initElements(Driver.get(), this);
}

   public void Assertion(){
        Assert.assertNotEquals(actual.getText(),expected);
       System.out.println("My Message : "+actual.getText());

    }

}


