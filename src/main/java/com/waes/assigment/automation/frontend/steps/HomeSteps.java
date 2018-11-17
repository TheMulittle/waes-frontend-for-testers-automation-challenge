package com.waes.assigment.automation.frontend.steps;

import com.waes.assigment.automation.frontend.pages.HomePage;
import com.waes.assigment.automation.frontend.pages.SignUpPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomeSteps {

    @Autowired
    HomePage homePage;

    @Autowired
    SignUpPage signUpPage;

    @Given("I navigate to the Home page")
    public void navigateToHomePage() {
        homePage.navigateTo();
    }

    @Given("I navigate to the Sign Up page")
    public void navigateToSignUpPage() {
        homePage.navigateTo()
                .clickOnSignUpLink()
                .waitUntilPageIsLoaded();
    }

    @When("I click in the Sign Up link")
    public void clickInSignUpLink() {
        homePage.clickOnSignUpLink();
    }
}
