package com.omayo.rightpageobject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayo.base.BasePage;

public class GetPromptPage extends BasePage {

    @FindBy(id = "prompt")
    private WebElement getPromptButton;

    public void getPrompt() throws InterruptedException {
        action.click(getPromptButton);
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println(text);
        alert.sendKeys("muna");
        alert.accept();
       
    }
}