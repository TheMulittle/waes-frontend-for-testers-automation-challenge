package com.waes.assigment.automation.frontend.steps;

import com.waes.assigment.automation.frontend.pages.SignUpPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.jbehave.core.steps.Parameters;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

import static org.hamcrest.Matchers.is;

@Component
public class SignUpSteps {

    @Autowired
    SignUpPage signUpPage;

    @Given("I fill the Sign Up page with following information")
    public void fillSignUpInformation() {

    }

    @When("fill the Sign Up page with following information: $informationTable")
    public void fillSignUpPageInfo(@Named("$informationTable") ExamplesTable informationTable) {
        Map<String, String> informationToFill = informationTable.getRowsAsParameters(true).get(0).values();

        signUpPage.typeOnUserNameField(informationToFill.get("userName"))
                  .typeOnPasswordField(informationToFill.get("password"))
                  .typeOnNameField(informationToFill.get("name"))
                  .typeOnEmailField(informationToFill.get("email"))
                  .selectDayOfBirth(informationToFill.get("day"))
                  .selectMonthOfBirth(informationToFill.get("month"))
                  .selectYearOfBirth(informationToFill.get("year"));
    }

    @When("I try to Sign Up")
    public void whenITryToSignUp() {
        signUpPage.clickOnSubmitButton();
    }

    @Then("I should see the Sign Up page")
    public void shouldSeeTheSignUpPage() {
        signUpPage.waitUntilPageIsLoaded();
        Assert.assertThat(signUpPage.getCurrentUrl(), is("https://waesworks.bitbucket.io/app/signUp"));
    }
}
