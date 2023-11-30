package com.omayo.centerpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.omayo.actiondriver.Action;
import com.omayo.base.BasePage;

public class LoginPage extends BasePage {

	Action action = new Action();

	@FindBy(name = "userid")
	private WebElement usernameField;

	@FindBy(name = "pswrd")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@onclick='check(this.form)']")
	private WebElement loginButton;

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	public void login( String user,String pasw) throws Throwable {

		action.sendText(usernameField, user);
		action.sendText(passwordField, pasw);
		action.click(loginButton);
		action.AlertAccept(driver);

	}

}
