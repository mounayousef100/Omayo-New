package com.omayo.centerpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.omayo.actiondriver.Action;
import com.omayo.base.BasePage;

public class LoginPage extends BasePage {

	@FindBy(name = "userid")
	private WebElement usernameField;

	@FindBy(name = "pswrd")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@onclick='check(this.form)']")
	private WebElement loginButton;


	public void login( String userName,String pass) throws Throwable {

		action.sendText(usernameField, userName);
		action.sendText(passwordField, pass);
		action.click(loginButton);
		action.AlertAccept(driver);

	}

}
