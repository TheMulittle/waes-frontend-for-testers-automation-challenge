package com.waes.assigment.automation.frontend.test.steps;

import com.waes.assigment.automation.frontend.test.components.StatusBar;
import com.waes.assigment.automation.frontend.test.pages.HomePage;
import com.waes.assigment.automation.frontend.test.pages.LoginPage;
import com.waes.assigment.automation.frontend.test.pages.SignUpPage;
import org.jbehave.core.annotations.*;
import org.jbehave.core.model.ExamplesTable;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

@Component
public class StatusBarSteps {

    @Autowired
    StatusBar statusBar;

    @Autowired
    LoginPage loginPage;


    @Given("I'm logged out")
    public void logoutIfNeeded() {
        if(statusBar.logoutIfLoggedIn()) {
            loginPage.waitUntilPageIsLoaded();
        }
    }

    @When("I log out from the system")
    public void logoutFromSystem() {
        statusBar.clickOnLogoutLink();
    }

    @Then("I should see in the Status Bar that I'm logged in as $user")
    public void shouldSeeLoggedUser(@Named("user") String user) {
        Assert.assertThat(statusBar.getStatusBarText(), containsString(user));
    }

    @Then("I should see in the Status Bar that the logout button is available")
    public void shouldSeeLogoutButton() {
        Assert.assertThat(statusBar.isLogoutLinkVisible(), equalTo(true));
    }
}
