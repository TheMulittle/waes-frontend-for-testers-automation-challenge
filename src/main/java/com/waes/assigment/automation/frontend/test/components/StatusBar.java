package com.waes.assigment.automation.frontend.test.components;

import com.waes.assigment.automation.frontend.configuration.PageObject.PageObject;
import com.waes.assigment.automation.frontend.test.AbstractComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

import java.util.List;

@PageObject
public class StatusBar extends AbstractComponent {

    @FindBy(how = How.CSS, using = "#status p")
    private WebElement statusLabel;

    @FindBy(how = How.CSS, using = "#status p a")
    private WebElement logoutLink;

    public String getStatusBarText() {
        return statusLabel.getText();
    }

    public boolean isLogoutLinkVisible() {
        return logoutLink.isDisplayed();
    }

    public StatusBar clickOnLogoutLink() {
        click(logoutLink);
        return this;
    }

    @Override
    protected List<WebElement> elementsToWait() {
        return null;
    }
}
