package com.waes.assigment.automation.frontend.test;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public abstract class AbstractComponent {

    @Autowired
    WebDriverProvider webDriverProvider;

    @Value("${DEFAULT_TIMEOUT_IN_SECONDS:10}")
    int DEFAULT_TIMEOUT_IN_SECONDS;

    public String getCurrentUrl() {
        return webDriverProvider.get().getCurrentUrl();
    }

    public AbstractComponent waitUntilPageIsLoaded() {
        WebDriverWait wait = new WebDriverWait(webDriverProvider.get(), DEFAULT_TIMEOUT_IN_SECONDS);
        wait.until(ExpectedConditions.visibilityOfAllElements(elementsToWait()));
        return this;
    }

    protected void navigateToUrl(String url) {
        webDriverProvider.get().get(url);
    }

    protected WebElement click(WebElement element) {
        scrollToElement(element).click();
        return element;
    }

    protected WebElement typeData(WebElement element, String informationToType) {
        scrollToElement(element);
        element.clear();
        element.sendKeys(informationToType);
        return element;
    }

    protected WebElement scrollToElement(WebElement element) {
            JavascriptExecutor js = (JavascriptExecutor) (webDriverProvider.get());
            js.executeScript("arguments[0].scrollIntoView(true)", element);
            return element;
    }


    protected WebElement selectInDropdown(WebElement dropdown, String option) {
        new Select(dropdown).selectByVisibleText(option);
        return dropdown;
    }

    protected abstract List<WebElement> elementsToWait();
}
