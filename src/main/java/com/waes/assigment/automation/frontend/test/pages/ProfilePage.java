package com.waes.assigment.automation.frontend.test.pages;


import com.waes.assigment.automation.frontend.configuration.PageObject.PageObject;
import com.waes.assigment.automation.frontend.test.AbstractComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

@PageObject
public class ProfilePage extends AbstractComponent {

    @FindBy(how = How.XPATH, using = "//h1[text() = 'Your Profile']")
    private WebElement profileTitle;

    @FindBy(how = How.CSS, using = "section p")
    private WebElement profileMessage;

    public String getProfileMessage() {
        return profileMessage.getText().replace("\n", "");
    }

    @Override
    protected List<WebElement> elementsToWait() {
        List<WebElement> elementsToWait = new ArrayList<>();
        elementsToWait.add(profileTitle);
        return elementsToWait;
    }
}
