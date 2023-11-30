package com.omayo.centerpageobject;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.omayo.actiondriver.Action;
import com.omayo.base.BasePage;

public class HTMLFormPage extends BasePage {
    private Action action = new Action();

    @FindBy(xpath = "//form[@name='form1']/input[1]")
    private WebElement usernameInput;

    @FindBy(xpath = "//form[@name='form1']/input[2]")
    private WebElement passwordInput;

    @FindBy(xpath = "//form[@name='form1']/button")
    private WebElement loginButton;

    public HTMLFormPage(WebDriver driver) throws IOException {
        PageFactory.initElements(driver, this);
    }

    public void fillLoginForm() throws InterruptedException {
        Thread.sleep(3000);
        action.sendText(usernameInput, prop.getProperty("username"));
        Thread.sleep(3000);
        action.sendText(passwordInput, prop.getProperty("password"));
        action.click( loginButton);
        Thread.sleep(3000);
    }
}