package com.waes.assigment.automation.frontend.test.pages;


import com.waes.assigment.automation.frontend.configuration.PageObject.PageObject;
import com.waes.assigment.automation.frontend.test.AbstractComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@PageObject
public class HomePage extends AbstractComponent {

    @Autowired
    SignUpPage signUpPage;

    @FindBy(how = How.ID, using = "signup_link")
    private WebElement signUpLink;

    @FindBy(how = How.ID, using = "login_link")
    private WebElement loginLink;

    public HomePage navigateTo() {
        navigateToUrl("https://waesworks.bitbucket.io");
        return this;
    }

    public SignUpPage clickOnSignUpLink() {
        click(signUpLink);
        return signUpPage;
    }

    /*public LoginPage clickOnLoginLink() {
        click(loginLink);
        return signUpPage;
    }*/

    @Override
    protected List<WebElement> elementsToWait() {
        List<WebElement> elementToWait = new ArrayList<>();
        elementToWait.add(signUpLink);
        return elementToWait;
    }
}
