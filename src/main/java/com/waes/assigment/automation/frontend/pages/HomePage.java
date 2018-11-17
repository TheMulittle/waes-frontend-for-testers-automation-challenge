package com.waes.assigment.automation.frontend.pages;


import com.waes.assigment.automation.frontend.configuration.PageObject.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@PageObject
public class HomePage extends AbstractPage {

    @FindBy(how = How.ID, using = "signup_link")
    private WebElement signUpLink;

    @FindBy(how = How.ID, using = "login_link")
    private WebElement loginLink;

    public HomePage navigateTo() {
        navigateToUrl("https://waesworks.bitbucket.io");
        return this;
    }

    public HomePage clickOnSignUpLink() {
        click(signUpLink);
        return this;
    }

    public HomePage clickOnLoginLink() {
        click(loginLink);
        return this;
    }

    @Override
    protected List<WebElement> elementsToWait() {
        List<WebElement> elementToWait = new ArrayList<>();
        elementToWait.add(signUpLink);
        return elementToWait;
    }
}
