package com.waes.assigment.automation.frontend.steps;

import com.waes.assigment.automation.frontend.pages.SignUpPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.hamcrest.Matchers.is;

@Component
public class SignUpSteps {

    @Autowired
    SignUpPage signUpPage;

    @Given("I fill the Sign Up page with following information")
    public void fillSignUpInformation() {

    }

    @Given("fill the Sign Up page with following information:\r\n|$s |password  |name    |email   |day  |month  |year  |\r\n|<userName>|<password>|<name>  |<email> |<day>|<month>|<year>|")
    public void givenFillTheSignUpPageWithFollowingInformationuserNamepasswordnameemaildaymonthyearuserNamepasswordnameemaildaymonthyear() {
        // PENDING
    }

    @When("I try to Sign Up")
    public void whenITryToSignUp() {
        // PENDING
    }

    @Then("I should see the Sign Up page")
    public void shouldSeeTheSignUpPage() {
        signUpPage.waitUntilPageIsLoaded();
        Assert.assertThat(signUpPage.getCurrentUrl(), is("https://waesworks.bitbucket.io/app/signUp"));
    }
}
