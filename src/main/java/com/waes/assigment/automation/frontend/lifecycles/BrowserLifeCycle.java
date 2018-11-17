package com.waes.assigment.automation.frontend.lifecycles;

import org.jbehave.core.annotations.AfterStory;
import org.jbehave.core.annotations.BeforeStory;
import org.jbehave.web.selenium.WebDriverProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BrowserLifeCycle {
    @Autowired
    WebDriverProvider webDriverProvider;

    @BeforeStory
    public void startBrowser() {
        webDriverProvider.initialize();
        webDriverProvider.get().manage().window().maximize();
    }

    @AfterStory
    public void closeBrowser() {
        webDriverProvider.end();
    }
}
