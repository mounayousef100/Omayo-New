package com.omayo.centerpageobject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.github.javafaker.Faker;
import com.omayo.base.BasePage;

public class HTMLFormPage extends BasePage {
    Faker faker = new Faker();

    @FindBy(xpath = "//form[@name='form1']/input[1]")
    private WebElement usernameInput;

    @FindBy(xpath = "//form[@name='form1']/input[2]")
    private WebElement passwordInput;

    @FindBy(xpath = "//form[@name='form1']/button")
    private WebElement loginButton;

 
    public void fillLoginForm() throws InterruptedException {
        Thread.sleep(3000);
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = firstName+lastName +"@gmail.com";
        String phoneNumber = "079"+ faker.number().numberBetween(2000000,3000000);
        String pass  = faker.number().toString();
        action.sendText(usernameInput, phoneNumber);
        Thread.sleep(3000);
        action.sendText(passwordInput,"muna123");
        action.click( loginButton);
        Thread.sleep(3000);
    }
}