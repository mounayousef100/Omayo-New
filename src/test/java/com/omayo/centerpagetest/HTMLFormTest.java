package com.omayo.centerpagetest;

import java.io.IOException;
import java.time.Duration;
import org.testng.annotations.Test;
import com.omayo.base.BaseTest;
import com.omayo.centerpageobject.HTMLFormPage;

public class HTMLFormTest extends BaseTest {
	private HTMLFormPage htmlFormPage;

    @Test()
    public void hTMLFormTest() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        htmlFormPage = new HTMLFormPage(driver);
        htmlFormPage.fillLoginForm();
    }
}