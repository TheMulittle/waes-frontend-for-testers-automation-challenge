package com.waes.assigment.automation.frontend.test.steps;

import com.waes.assigment.automation.frontend.test.components.StatusBar;
import com.waes.assigment.automation.frontend.test.pages.CommonPage;
import com.waes.assigment.automation.frontend.test.pages.LoginPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

@Component
public class BrowserSteps {

    @Autowired
    CommonPage commonPage;


    @Given("I close the browser")
    public void openBroswer() {
        commonPage.keepSession();
        commonPage.closeBrowser();
    }

    @When("I re-open the browser")
    public void reOpenBroswer() {
        commonPage.reopenBroswer();
    }
}
