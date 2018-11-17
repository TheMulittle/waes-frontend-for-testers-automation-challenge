package com.waes.assigment.automation.frontend.pages;


import com.waes.assigment.automation.frontend.configuration.PageObject.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@PageObject
public class SignUpPage extends AbstractPage {

    @FindBy(how = How.ID, using = "username_input")
    private WebElement userNameField;

    @FindBy(how = How.ID, using = "password_input")
    private WebElement passwordField;

    @FindBy(how = How.ID, using = "name_input")
    private WebElement nameField;

    @FindBy(how = How.ID, using = "email_input")
    private WebElement emailField;

    @FindBy(how = How.ID, using = "day_select")
    private WebElement dayDropdown;

    @FindBy(how = How.ID, using = "month_select")
    private WebElement monthDropdown;

    @FindBy(how = How.ID, using = "year_select")
    private WebElement yearDropdown;

    @FindBy(how = How.ID, using = "submit_button")
    private WebElement submitButton;

    protected WebElement typeOnUserNameField(String text) {
        typeData(userNameField, text);
        return userNameField;
    }

    protected WebElement typeOnPasswordField(String text) {
        typeData(passwordField, text);
        return passwordField;
    }

    protected WebElement typeOnNameField(String text) {
        typeData(nameField, text);
        return nameField;
    }

    protected WebElement typeOnEmailField(String text) {
        typeData(emailField, text);
        return emailField;
    }

    protected WebElement selectDayOfBirth(String option) {
        selectInDropdown(dayDropdown, option);
        return dayDropdown;
    }

    protected WebElement selectMonthOfBirth(String option) {
        selectInDropdown(monthDropdown, option);
        return monthDropdown;
    }

    protected WebElement selectYearOfMonth(String option) {
        selectInDropdown(yearDropdown, option);
        return yearDropdown;
    }

    @Override
    protected List<WebElement> elementsToWait() {
        List<WebElement> elementsToWait = new ArrayList<>();
        elementsToWait.add(userNameField);
        elementsToWait.add(emailField);
        return elementsToWait;
    }
}
